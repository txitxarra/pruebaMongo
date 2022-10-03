package com.txitxarra.aplimongo.service.impl;

import com.txitxarra.aplimongo.entity.Employee;
import com.txitxarra.aplimongo.respository.EmployeeRespository;
import com.txitxarra.aplimongo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRespository employeeRespository;

    @Override
    public List<Employee> getEmployees(){
        return employeeRespository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee){
        employeeRespository.save(employee);
    }

    @Override
    public Employee getEmployee(String uuid){
        return employeeRespository.getEmployeeByUuid(uuid);
    }
}
