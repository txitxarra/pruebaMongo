package com.txitxarra.aplimongo.controller;

import com.txitxarra.aplimongo.payload.response.GetEmployeeResponse;
import com.txitxarra.aplimongo.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
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
}
