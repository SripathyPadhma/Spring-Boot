package com.example.employeerecords.endities;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String email;

    
}
