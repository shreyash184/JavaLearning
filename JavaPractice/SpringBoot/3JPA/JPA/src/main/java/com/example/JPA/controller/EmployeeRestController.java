package com.example.JPA.controller;

import com.example.JPA.EmployeeDetailDTO;
import com.example.JPA.entity.Employee;
import com.example.JPA.repo.IEmployeeRepo;
import com.example.JPA.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private IEmployeeRepo iEmployeeRepo;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.createEmp(employee));
    }

    @PostMapping("/detail")
    public ResponseEntity<EmployeeDetailDTO> createEmp(@RequestBody EmployeeDetailDTO employeeDetailDTO){
        return ResponseEntity.ok(employeeService.createEmpDetail(employeeDetailDTO));
    }

    @GetMapping("/byname")
    public ResponseEntity<List<Employee>> getByName(@RequestParam String name){
        return ResponseEntity.ok(employeeService.getByName(name));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id){
        Employee employee = iEmployeeRepo.findById(id).get();
        return ResponseEntity.ok(employee);
    }
}
