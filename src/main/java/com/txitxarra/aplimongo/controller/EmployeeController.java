package com.txitxarra.aplimongo.controller;

import com.txitxarra.aplimongo.payload.response.GetEmployeeResponse;
import com.txitxarra.aplimongo.service.EmployeeService;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import xyz.capybara.clamav.ClamavClient;
import xyz.capybara.clamav.commands.scan.result.ScanResult;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@Log4j2
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmployees")
    public List<GetEmployeeResponse> getEmployees() {
        return employeeService.getEmployees().stream().map(x -> new ModelMapper().map(x, GetEmployeeResponse.class)).collect(Collectors.toList());
    }

    @GetMapping("getEmployee/{uuid}")
    public GetEmployeeResponse getEmployee(@PathVariable("uuid") String uuid){
        return new ModelMapper().map(employeeService.getEmployee(uuid), GetEmployeeResponse.class);
    }

    @PostMapping(value = "checkFile", consumes={"multipart/form-data"})
    public void checkClamAV(MultipartFile file){
        ClamavClient client = new ClamavClient("localhost",3310);
        try {
            ScanResult scanResult = client.scan(file.getInputStream());
            if (scanResult instanceof ScanResult.OK) {
                log.info("El resultado del analisis ha sido el correcto");
            } else if (scanResult instanceof ScanResult.VirusFound) {
                Map<String, Collection<String>> viruses = ((ScanResult.VirusFound) scanResult).getFoundViruses();
                viruses.entrySet().forEach(x -> x.getValue().forEach(z -> log.info(x +", " + z)));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
