/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.persistencia.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre_usuario", nullable = false, unique = true) // Añadido para claridad y unicidad
    private String nombreUsuario;

    @Column(nullable = false, unique = true) // Añadido para claridad y unicidad
    private String email;

    @Column(name = "password_hash", nullable = false) // Añadido para claridad
    private String passwordHash; // Guarda hashes, no contraseñas en texto plano

     public Usuario() {
    }   

    public Usuario(String nombreUsuario, String email, String passwordHash) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.passwordHash = passwordHash;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
     
      @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0; 
    }
}
