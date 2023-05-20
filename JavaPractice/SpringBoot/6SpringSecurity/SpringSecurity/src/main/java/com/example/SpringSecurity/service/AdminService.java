package com.example.SpringSecurity.service;

import com.example.SpringSecurity.entity.AppUser;
import com.example.SpringSecurity.repo.IAppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private IAppUserRepo appUserRepo;

    public AppUser createUser(AppUser appUser){
        appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
        appUserRepo.save(appUser);
        return appUser;
    }

    public AppUser getUser(Integer id){
        return appUserRepo.findById(id).get();
    }

    public void changePassword(String newPass){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        AppUser appUser = appUserRepo.findByEmail(userDetails.getUsername());
        appUser.setPassword(passwordEncoder.encode(newPass));
        appUserRepo.save(appUser);
    }
}
