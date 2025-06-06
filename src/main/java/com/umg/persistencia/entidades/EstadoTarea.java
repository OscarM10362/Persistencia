/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.persistencia.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "estados_tarea")

public class EstadoTarea {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    public EstadoTarea() {
    }

    // Constructor con todos los campos
    public EstadoTarea(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // toString
    @Override
    public String toString() {
        return "EstadoTarea{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
