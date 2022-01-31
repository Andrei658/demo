package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nume;

    private String prenume;

    @Column(unique = true)
    private String email;
}
