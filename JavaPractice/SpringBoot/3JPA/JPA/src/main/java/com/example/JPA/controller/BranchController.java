package com.example.JPA.controller;

import com.example.JPA.entity.Branch;
import com.example.JPA.repo.IBranchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private IBranchRepo branchRepo;

    @GetMapping("/{id}")
    public ResponseEntity<Branch> getBranch(@PathVariable Long id){
        Branch branch = branchRepo.findById(id).get();
        return ResponseEntity.ok(branch);
    }
}
