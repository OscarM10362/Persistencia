/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.persistencia.entidades;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "historial_acciones")

public class HistorialAccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tarea_id")
    private Tarea tarea;

    private String tipoAccion;
    private String detalles;
    private LocalDateTime fechaAccion;
    private boolean undoable;

    public HistorialAccion() {
    }

    public HistorialAccion(Long id, Usuario usuario, Tarea tarea, String tipoAccion,
                           String detalles, LocalDateTime fechaAccion, boolean undoable) {
        this.id = id;
        this.usuario = usuario;
        this.tarea = tarea;
        this.tipoAccion = tipoAccion;
        this.detalles = detalles;
        this.fechaAccion = fechaAccion;
        this.undoable = undoable;
    }

    @PrePersist
    protected void onCreate() {
        fechaAccion = LocalDateTime.now();
      
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public String getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(String tipoAccion) {
        this.tipoAccion = tipoAccion;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDateTime getFechaAccion() {
        return fechaAccion;
    }

    public void setFechaAccion(LocalDateTime fechaAccion) {
        this.fechaAccion = fechaAccion;
    }

    public boolean isUndoable() {
        return undoable;
    }

    public void setUndoable(boolean undoable) {
        this.undoable = undoable;
    }

    @Override
    public String toString() {
        return "HistorialAccion{" +
                "id=" + id +
                ", tipoAccion='" + tipoAccion + '\'' +
                ", detalles='" + detalles + '\'' +
                ", fechaAccion=" + fechaAccion +
                ", undoable=" + undoable +
                '}';
    }
}
