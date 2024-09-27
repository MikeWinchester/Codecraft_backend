package com.codecraft.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tareas_x_etiquetas")
public class TareaXEtiqueta {
    
    @Id
    @Column
    private int tareaXEtiqueta;

    @ManyToOne
    @JoinColumn(name = "id_tarea", referencedColumnName = "id_tarea")
    private Tarea tarea;

    @ManyToOne
    @JoinColumn(name = "id_etiqueta", referencedColumnName = "id_etiqueta")
    private Etiqueta etiqueta;
}
