package com.example.lab3_20203651.Entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "jugador")
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idjugador", nullable = false)
    private Integer idjugador;

    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;

    @Column(name = "edad", nullable = false)
    private Integer edad;

    @Column(name = "posicion", nullable = false, length = 45)
    private String posicion;

    @Column(name = "club", nullable = false, length = 45)
    private String club;

    @Column(name = "sn_idseleccion", nullable = false)
    private Integer sn_idseleccion;


}
