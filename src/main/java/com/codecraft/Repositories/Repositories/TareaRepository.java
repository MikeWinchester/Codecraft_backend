package com.codecraft.Repositories.Repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codecraft.Models.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Integer> {
    
    public List<Tarea> findAllTareaByEstadoIdEstado(int idEstado);

    public List<Tarea> findAllTareaByPrioridadIdPrioridad(int idPrioridad);
    
    public List<Tarea> findAllTareaByFecha(Date fecha);
}
