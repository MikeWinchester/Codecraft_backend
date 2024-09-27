package com.codecraft.Models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "historial")
@Data
public class Historial {

    @Id
    @Column(name = "id_historial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_historial;

    @OneToMany
    @JoinColumn(name = "id_tarea", referencedColumnName = "id_tarea")
    private Tarea id_tarea;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "descripcion")
    private String descripcion;
}
