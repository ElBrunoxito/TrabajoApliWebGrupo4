package com.yobrunox.trabajoaplicacionesweb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombrePais;


    //Relaciones

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "pais")
    private List<Ciudad> ciudades;


    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "pais")
    private List<Banco> bancos;

}
