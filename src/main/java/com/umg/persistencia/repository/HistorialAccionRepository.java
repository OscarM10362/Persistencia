/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.persistencia.repository;

import com.umg.persistencia.entidades.HistorialAccion;
import com.umg.persistencia.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HistorialAccionRepository extends JpaRepository<HistorialAccion, Long> {
    List<HistorialAccion> findByUsuarioOrderByFechaAccionDesc(Usuario usuario);
    Optional<HistorialAccion> findFirstByUsuarioAndUndoableOrderByFechaAccionDesc(Usuario usuario, boolean undoable);
}