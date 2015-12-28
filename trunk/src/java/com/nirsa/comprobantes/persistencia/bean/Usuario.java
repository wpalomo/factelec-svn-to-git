package com.nirsa.comprobantes.persistencia.bean;
// Generated 29-may-2013 12:11:16 by Hibernate Tools 3.2.1.GA

import java.util.Date;

/**
 * Usuario generated by hbm2java
 */
public class Usuario implements java.io.Serializable {

    private int id;
    private Rol rol;
    private Emisor emisor;
    private String usuarioNombre;
    private String usuarioNombreReal;
    private String usuarioApellidoReal;
    private String usuarioPassword;
    private String usuarioNuevaPassword;
    private String usuarioEmail;
    private Date usuarioFechaCreacion;
    private Date usuarioFechaModificacion;
    private Character usuarioEstaActivo;

    public Usuario() {
    }

    public Usuario(int id, Rol rol, Emisor emisor) {
        this.id = id;
        this.rol = rol;
        this.emisor = emisor;
    }

    public Usuario(int id, Rol rol, Emisor emisor, String usuarioNombre, String usuarioNombreReal, String usuarioApellidoReal, String usuarioPassword, String usuarioNuevaPassword, String usuarioEmail, Date usuarioFechaCreacion, Date usuarioFechaModificacion, Character usuarioEstaActivo) {
        this.id = id;
        this.rol = rol;
        this.emisor = emisor;
        this.usuarioNombre = usuarioNombre;
        this.usuarioNombreReal = usuarioNombreReal;
        this.usuarioApellidoReal = usuarioApellidoReal;
        this.usuarioPassword = usuarioPassword;
        this.usuarioNuevaPassword = usuarioNuevaPassword;
        this.usuarioEmail = usuarioEmail;
        this.usuarioFechaCreacion = usuarioFechaCreacion;
        this.usuarioFechaModificacion = usuarioFechaModificacion;
        this.usuarioEstaActivo = usuarioEstaActivo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Emisor getEmisor() {
        return this.emisor;
    }

    public void setEmisor(Emisor emisor) {
        this.emisor = emisor;
    }

    public String getUsuarioNombre() {
        return this.usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getUsuarioNombreReal() {
        return this.usuarioNombreReal;
    }

    public void setUsuarioNombreReal(String usuarioNombreReal) {
        this.usuarioNombreReal = usuarioNombreReal;
    }

    public String getUsuarioApellidoReal() {
        return this.usuarioApellidoReal;
    }

    public void setUsuarioApellidoReal(String usuarioApellidoReal) {
        this.usuarioApellidoReal = usuarioApellidoReal;
    }

    public String getUsuarioPassword() {
        return this.usuarioPassword;
    }

    public void setUsuarioPassword(String usuarioPassword) {
        this.usuarioPassword = usuarioPassword;
    }

    public String getUsuarioNuevaPassword() {
        return this.usuarioNuevaPassword;
    }

    public void setUsuarioNuevaPassword(String usuarioNuevaPassword) {
        this.usuarioNuevaPassword = usuarioNuevaPassword;
    }

    public String getUsuarioEmail() {
        return this.usuarioEmail;
    }

    public void setUsuarioEmail(String usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
    }

    public Date getUsuarioFechaCreacion() {
        return this.usuarioFechaCreacion;
    }

    public void setUsuarioFechaCreacion(Date usuarioFechaCreacion) {
        this.usuarioFechaCreacion = usuarioFechaCreacion;
    }

    public Date getUsuarioFechaModificacion() {
        return this.usuarioFechaModificacion;
    }

    public void setUsuarioFechaModificacion(Date usuarioFechaModificacion) {
        this.usuarioFechaModificacion = usuarioFechaModificacion;
    }

    public Character getUsuarioEstaActivo() {
        return this.usuarioEstaActivo;
    }

    public void setUsuarioEstaActivo(Character usuarioEstaActivo) {
        this.usuarioEstaActivo = usuarioEstaActivo;
    }
}