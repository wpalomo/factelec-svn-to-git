/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nirsa.comprobantes.modelo.factura;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Rolando
 */
@XmlType(propOrder = {
    "fechaEmision", "dirEstablecimiento", "contribuyenteEspecial", 
    "obligadoContabilidad", "tipoIdentificacionComprador", "guiaRemision", 
    "razonSocialComprador", "identificacionComprador", "totalSinImpuestos", 
    "totalDescuento", "totalConImpuestos", "propina", "importeTotal", "moneda"})
public class InfoFactura {

    protected String fechaEmision;
    protected String dirEstablecimiento;
    protected String contribuyenteEspecial;
    protected String obligadoContabilidad;
    protected String tipoIdentificacionComprador;
    protected String guiaRemision;
    protected String razonSocialComprador;
    protected String identificacionComprador;
    protected BigDecimal totalSinImpuestos;
    protected BigDecimal totalDescuento;
    protected TotalConImpuestos totalConImpuestos;
    protected BigDecimal propina;
    protected BigDecimal importeTotal;
    protected String moneda;

    public String getContribuyenteEspecial() {
        return contribuyenteEspecial;
    }

    public void setContribuyenteEspecial(String contribuyenteEspecial) {
        this.contribuyenteEspecial = contribuyenteEspecial;
    }

    public String getDirEstablecimiento() {
        return dirEstablecimiento;
    }

    public void setDirEstablecimiento(String dirEstablecimiento) {
        this.dirEstablecimiento = dirEstablecimiento;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getGuiaRemision() {
        return guiaRemision;
    }

    public void setGuiaRemision(String guiaRemision) {
        this.guiaRemision = guiaRemision;
    }

    public String getIdentificacionComprador() {
        return identificacionComprador;
    }

    public void setIdentificacionComprador(String identificacionComprador) {
        this.identificacionComprador = identificacionComprador;
    }

    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(BigDecimal importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getObligadoContabilidad() {
        return obligadoContabilidad;
    }

    public void setObligadoContabilidad(String obligadoContabilidad) {
        this.obligadoContabilidad = obligadoContabilidad;
    }

    public BigDecimal getPropina() {
        return propina;
    }

    public void setPropina(BigDecimal propina) {
        this.propina = propina;
    }

    public String getRazonSocialComprador() {
        return razonSocialComprador;
    }

    public void setRazonSocialComprador(String razonSocialComprador) {
        this.razonSocialComprador = razonSocialComprador;
    }

    public String getTipoIdentificacionComprador() {
        return tipoIdentificacionComprador;
    }

    public void setTipoIdentificacionComprador(String tipoIdentificacionComprador) {
        this.tipoIdentificacionComprador = tipoIdentificacionComprador;
    }

    public TotalConImpuestos getTotalConImpuestos() {
        return totalConImpuestos;
    }

    public void setTotalConImpuestos(TotalConImpuestos totalConImpuestos) {
        this.totalConImpuestos = totalConImpuestos;
    }

    public BigDecimal getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(BigDecimal totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public BigDecimal getTotalSinImpuestos() {
        return totalSinImpuestos;
    }

    public void setTotalSinImpuestos(BigDecimal totalSinImpuestos) {
        this.totalSinImpuestos = totalSinImpuestos;
    }
}
