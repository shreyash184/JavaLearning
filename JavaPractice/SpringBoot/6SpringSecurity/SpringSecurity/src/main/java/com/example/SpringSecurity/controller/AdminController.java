package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.service.AdminService;
import com.example.SpringSecurity.entity.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/createUser")
    ResponseEntity<AppUser> createUser(@RequestBody AppUser user){
        return ResponseEntity.ok(adminService.createUser(user));
    }

    @GetMapping("/user/{id}")
    ResponseEntity<AppUser> getUser(@PathVariable Integer id){
        return ResponseEntity.ok(adminService.getUser(id));
    }

    @GetMapping("/changePassword")
    ResponseEntity<String> changePassword(@RequestParam String newPassword){
        adminService.changePassword(newPassword);
        return ResponseEntity.ok("Password Changed");
    }
}
