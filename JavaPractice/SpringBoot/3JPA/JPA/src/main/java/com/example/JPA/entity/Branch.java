package com.example.JPA.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String renewalNumber;

    @OneToMany(mappedBy = "branch", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("branch")
    private Set<Employee> employee;
}
