package com.example.JPA.repo;

import com.example.JPA.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBranchRepo extends JpaRepository<Branch, Long> {

}
