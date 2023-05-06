package com.example.JPA.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @ManyToOne
    @JsonIgnoreProperties("employee")
    private Branch branch;
}
