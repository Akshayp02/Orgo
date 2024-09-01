package com.employ_backend.employ_backend.Services;

import com.employ_backend.employ_backend.Model.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getEmployees();

  boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
