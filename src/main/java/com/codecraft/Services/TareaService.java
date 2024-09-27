package com.codecraft.Services;

import java.sql.Date;
import java.util.List;

import com.codecraft.Models.Tarea;

public interface TareaService {

    public Tarea agregarTarea(Tarea tarea);

    public String marcarTarea(int id, Tarea tarea);

    public String elimninarTarea(int id);
    
    public String actualizarTarea(int id, Tarea tarea);

    public List<Tarea> buscarPorEstado(int idEstado);

    public List<Tarea> buscarPorPrioridad(int idPrioridad);

    public List<Tarea> buscarPorFecha(Date fecha);
}
