package com.pablomonteserin.conJwt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity @Getter @Setter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para generar números autoincrementados
    private int id;
    private String name;
    private Date date;
    private String place;

    @OneToMany(mappedBy = "event")
    private List<RelationEventUserNeed> relation;

}
