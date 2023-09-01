package com.example.lab3_20203651.Entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "seleccion")
public class Seleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idseleccion", nullable = false)
    private Integer idseleccion;

    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;

    @Column(name = "tecnico", nullable = false, length = 45)
    private String tecnico;

    @Column(name = "estadio_idestadio", nullable = false)
    private Integer estadio_idestadio;

}
