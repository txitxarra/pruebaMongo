package com.txitxarra.aplimongo.service;

import com.txitxarra.aplimongo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(String uuid);
}
