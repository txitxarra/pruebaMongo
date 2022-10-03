package com.txitxarra.aplimongo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.txitxarra.aplimongo.entity.Employee;
import com.txitxarra.aplimongo.payload.response.GetEmployeeResponse;
import com.txitxarra.aplimongo.service.EmployeeService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    Logger LOGGER = Logger.getLogger(EmployeeController.class.getName());

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmployees")
    public List<GetEmployeeResponse> getEmployees() throws IOException {
        return employeeService.getEmployees().stream().map(x -> new ModelMapper().map(x, GetEmployeeResponse.class)).collect(Collectors.toList());
    }

    @GetMapping("getEmployee/{uuid}")
    public GetEmployeeResponse getEmployee(@PathVariable("uuid") String uuid){
        return new ModelMapper().map(employeeService.getEmployee(uuid), GetEmployeeResponse.class);
    }
}
