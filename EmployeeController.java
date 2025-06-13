
package com.example.assetmanagement3;

import com.example.assetmanagement3.Employee;
import com.example.assetmanagement3.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepo;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
}
