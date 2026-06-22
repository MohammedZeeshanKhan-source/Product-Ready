package com.productionready.Production_Ready.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "post")
public class Postentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String title;

    private String description;




}
