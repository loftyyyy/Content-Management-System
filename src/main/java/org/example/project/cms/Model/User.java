package org.example.project.cms.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String firstName;
    private String lastName;
    private String email;

    private String phoneNumber;




}

// PAGE 123
