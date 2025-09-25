package com.pablomonteserin.conJwt.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity @Getter @Setter
public class Need {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para generar números autoincrementados
    private int id;
    private String Name;

    @OneToMany(mappedBy = "need")
    private List<RelationEventUserNeed> relation;
}
