package com.example.JPA.service;

import com.example.JPA.EmployeeDetailDTO;
import com.example.JPA.entity.Address;
import com.example.JPA.repo.IAddressRepo;
import com.example.JPA.repo.IEmployeeRepo;
import com.example.JPA.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepo employeeRepo;

    @Autowired
    private IAddressRepo addressRepo;

    public Employee createEmp(Employee employee){
        employeeRepo.save(employee);
        return employee;
    }

    @Transactional
    public EmployeeDetailDTO createEmpDetail(EmployeeDetailDTO employeeDetailDTO){
        Employee employee = new Employee();
        employee.setName(employeeDetailDTO.getName());
        employee.setEmail(employeeDetailDTO.getEmail());

        Address address = new Address();
        address.setLine1(employeeDetailDTO.getLine1());
        address.setLine2(employeeDetailDTO.getLine2());
        address.setCity(employeeDetailDTO.getCity());

        employee.setAddress(address);
        employeeRepo.save(employee);
        return employeeDetailDTO;
    }

    public List<Employee> getByName(String name){
        return employeeRepo.findByName(name);
    }
}
