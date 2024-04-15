package com.example.parcial_1DAWgt2.users.entities;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;


    // Constructores, getters y setters

    public User() {
        // Constructor por defecto necesario para JPA
    }

    // Constructor con parámetros (si es necesario)
    public User(String name) {
        this.name = name;

    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
