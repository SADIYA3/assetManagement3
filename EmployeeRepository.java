package com.example.assetmanagement3;



import com.example.assetmanagement3.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
