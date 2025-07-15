package com.service;

import com.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    void registerEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO authenticate(String emailId, String password);

    List<EmployeeDTO> findAllEmployees();

    void deleteEmployee(int employeeId);

    EmployeeDTO updateEmployee(int employeeId);

    void postEmployeeInfo(EmployeeDTO employeeDTO);
}
