package com.example.lab3_20203651.Entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="estadio")
public class Estadio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idestadio", nullable = false)
    private Integer idestadio;

    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;

}
