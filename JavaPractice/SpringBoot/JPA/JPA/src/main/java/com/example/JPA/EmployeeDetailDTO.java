package com.example.JPA;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Getter
public class EmployeeDetailDTO {
    private String name;
    private String email;
    private String line1;
    private String line2;
    private String city;
}
