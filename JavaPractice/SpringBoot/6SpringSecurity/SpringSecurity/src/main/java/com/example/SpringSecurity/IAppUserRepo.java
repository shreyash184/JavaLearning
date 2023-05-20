package com.example.SpringSecurity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAppUserRepo extends JpaRepository<AppUser, Integer> {
    List<AppUser> findByEmail(String email);
}
