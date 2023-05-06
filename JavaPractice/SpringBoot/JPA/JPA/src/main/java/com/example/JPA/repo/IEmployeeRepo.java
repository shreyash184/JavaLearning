package com.example.JPA.repo;

import com.example.JPA.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);

}
