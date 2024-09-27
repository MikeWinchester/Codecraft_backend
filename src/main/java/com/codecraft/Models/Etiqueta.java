package com.codecraft.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "etiquetas")
@Data
public class Etiqueta {

    @Id
    @Column(name = "id_etiquetas")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtiqueta;

    @Column(name = "descripcion")
    private String descripcion;
}
