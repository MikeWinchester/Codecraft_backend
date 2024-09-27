package com.codecraft.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codecraft.Models.Tarea;
import com.codecraft.Services.Impl.TareaServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/tareas")
public class TareaController {
    
    @Autowired
    private TareaServiceImpl tareaServiceImpl;

    @PostMapping("/crear")
    public Tarea agregarTarea(@RequestBody Tarea nuevaTarea) {
        return this.tareaServiceImpl.agregarTarea(nuevaTarea);
    }

    @PutMapping("{id}/marcar")
    public String marcarTarea(@PathVariable int idTarea, @RequestBody Tarea tarea) {
        return this.tareaServiceImpl.marcarTarea(idTarea, tarea);
    }

    @DeleteMapping("{id}/eliminar")
    public String eliminarTarea(@PathVariable int idTarea){
        return this.tareaServiceImpl.elimninarTarea(idTarea);
    }

    @PutMapping("{id}/actualizar")
    public String actualizarTarea(@PathVariable int idTarea, @RequestBody Tarea tarea) {
        return this.tareaServiceImpl.actualizarTarea(idTarea, tarea);
    }

    @GetMapping("/obtener")
    public String obtenerPorEstado(@RequestParam int idEstado) {
        return this.obtenerPorEstado(idEstado);
    }
}
