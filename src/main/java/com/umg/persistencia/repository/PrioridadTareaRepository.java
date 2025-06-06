/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.persistencia.repository;

import com.umg.persistencia.entidades.PrioridadTarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface PrioridadTareaRepository extends JpaRepository<PrioridadTarea, Integer> {
    Optional<PrioridadTarea> findByNombre(String nombre);
}