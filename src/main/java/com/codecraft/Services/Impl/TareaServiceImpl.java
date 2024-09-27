package com.codecraft.Services.Impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codecraft.Models.Tarea;
import com.codecraft.Repositories.Repositories.TareaRepository;
import com.codecraft.Services.TareaService;

public class TareaServiceImpl implements TareaService{
    
    @Autowired
    private TareaRepository tareaRepository;

    @Override
    public Tarea agregarTarea(Tarea tarea) {
        return this.tareaRepository.save(tarea);
    }

    @Override
    public String marcarTarea(int id, Tarea tarea) {
        Tarea tareaMarcar = this.tareaRepository.findById(id).get();
        if(tareaMarcar!=null){
            tareaMarcar.setTitulo(tarea.getTitulo());
            tareaMarcar.setDescripcion(tarea.getDescripcion());
            tareaMarcar.setFecha(tarea.getFecha());
            tareaMarcar.setEstado(tarea.getEstado());
            tareaMarcar.setPrioridad(tarea.getPrioridad());
            tareaMarcar.setUsuario(tarea.getUsuario());
            tareaMarcar.setCategoria(tarea.getCategoria());
            return "Se cambio el estado de la tarea";
        }
        return "error";
    }

    @Override
    public String elimninarTarea(int id) {
        Tarea tareaEliminar = this.tareaRepository.findById(id).get();
        if (tareaEliminar!=null){
            this.tareaRepository.delete(tareaEliminar);
            return "Eliminado";
        }
        return "error no se encontro la tarea";
    }

    @Override
    public String actualizarTarea(int id, Tarea tarea) {
        Tarea tareaMarcar = this.tareaRepository.findById(id).get();
        if(tareaMarcar!=null){
            tareaMarcar.setTitulo(tarea.getTitulo());
            tareaMarcar.setDescripcion(tarea.getDescripcion());
            tareaMarcar.setFecha(tarea.getFecha());
            tareaMarcar.setEstado(tarea.getEstado());
            tareaMarcar.setPrioridad(tarea.getPrioridad());
            tareaMarcar.setUsuario(tarea.getUsuario());
            tareaMarcar.setCategoria(tarea.getCategoria());
            return "Se actualizo la tarea";
        }
        return "error";
    }

    @Override
    public List<Tarea> buscarPorEstado(int idEstado) {
        return this.tareaRepository.findAllTareaByEstadoIdEstado(idEstado);
    }

    @Override
    public List<Tarea> buscarPorPrioridad(int idPrioridad) {
        return this.tareaRepository.findAllTareaByPrioridadIdPrioridad(idPrioridad);
    }

    @Override
    public List<Tarea> buscarPorFecha(Date fecha) {
        return this.tareaRepository.findAllTareaByFecha(fecha);
    }

}
