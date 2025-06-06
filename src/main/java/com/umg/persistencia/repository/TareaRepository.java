/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.persistencia.repository;

import com.umg.persistencia.entidades.Tarea;
import com.umg.persistencia.entidades.Usuario;
import com.umg.persistencia.entidades.EstadoTarea;
import com.umg.persistencia.entidades.PrioridadTarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {
    List<Tarea> findByUsuario(Usuario usuario);
    List<Tarea> findByParentTaskIsNullAndUsuario(Usuario usuario);
    List<Tarea> findByCompletada(Boolean completada);
    List<Tarea> findByEstado(EstadoTarea estado);
    List<Tarea> findByPrioridad(PrioridadTarea prioridad);
}