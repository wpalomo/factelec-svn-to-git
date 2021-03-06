package com.nirsa.comprobantes.persistencia.bean;
// Generated 29-may-2013 12:11:16 by Hibernate Tools 3.2.1.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol implements java.io.Serializable {

    private int id;
    private String rolCodigo;
    private String rolDescripcion;
    private Date rolFechaCreacion;
    private Date rolFechaActualizacion;
    private Character rolEstaActivo;
    private Set usuarios = new HashSet(0);

    public Rol() {
    }

    public Rol(int id) {
        this.id = id;
    }

    public Rol(int id, String rolCodigo, String rolDescripcion, Date rolFechaCreacion, Date rolFechaActualizacion, Character rolEstaActivo, Set usuarios) {
        this.id = id;
        this.rolCodigo = rolCodigo;
        this.rolDescripcion = rolDescripcion;
        this.rolFechaCreacion = rolFechaCreacion;
        this.rolFechaActualizacion = rolFechaActualizacion;
        this.rolEstaActivo = rolEstaActivo;
        this.usuarios = usuarios;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolCodigo() {
        return this.rolCodigo;
    }

    public void setRolCodigo(String rolCodigo) {
        this.rolCodigo = rolCodigo;
    }

    public String getRolDescripcion() {
        return this.rolDescripcion;
    }

    public void setRolDescripcion(String rolDescripcion) {
        this.rolDescripcion = rolDescripcion;
    }

    public Date getRolFechaCreacion() {
        return this.rolFechaCreacion;
    }

    public void setRolFechaCreacion(Date rolFechaCreacion) {
        this.rolFechaCreacion = rolFechaCreacion;
    }

    public Date getRolFechaActualizacion() {
        return this.rolFechaActualizacion;
    }

    public void setRolFechaActualizacion(Date rolFechaActualizacion) {
        this.rolFechaActualizacion = rolFechaActualizacion;
    }

    public Character getRolEstaActivo() {
        return this.rolEstaActivo;
    }

    public void setRolEstaActivo(Character rolEstaActivo) {
        this.rolEstaActivo = rolEstaActivo;
    }

    public Set getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }
}
