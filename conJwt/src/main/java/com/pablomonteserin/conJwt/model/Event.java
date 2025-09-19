package com.pablomonteserin.conJwt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity @Getter @Setter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para generar números autoincrementados
    private int id;
    private String name;
    private Date date;
    private String place;

}
