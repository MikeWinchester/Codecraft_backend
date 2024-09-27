package com.codecraft.Models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "sub_tarea")
@Data

public class Subtarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sub_tarea")
    private int idTarea;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "id_tarea", referencedColumnName = "id_tarea")
    private Estado tarea;

    @ManyToOne
    @JoinColumn(name = "id_estado", referencedColumnName = "id_estado")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "id_prioridad", referencedColumnName = "id_prioridad")
    private Prioridad prioridad;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
}
