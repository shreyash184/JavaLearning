package com.example.SpringSecurity.service;

import com.example.SpringSecurity.entity.AppUser;
import com.example.SpringSecurity.repo.IAppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService implements UserDetailsService {

    @Autowired
    private IAppUserRepo appUserRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser user = appUserRepo.findByEmail(username);
        if(user == null ){
            throw new UsernameNotFoundException("User does not exist");
        }
        return user;
    }
}
