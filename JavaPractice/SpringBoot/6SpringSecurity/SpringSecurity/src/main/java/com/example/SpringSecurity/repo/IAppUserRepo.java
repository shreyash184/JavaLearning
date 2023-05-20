package com.example.SpringSecurity.repo;

import com.example.SpringSecurity.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAppUserRepo extends JpaRepository<AppUser, Integer> {
    AppUser findByEmail(String email);
}
