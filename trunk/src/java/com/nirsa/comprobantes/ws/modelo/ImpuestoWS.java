/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nirsa.comprobantes.ws.modelo;

import java.math.BigDecimal;

/**
 *
 * @author Rolando
 */
public class ImpuestoWS {

    protected String codigo;
    protected String codigoPorcentaje;
    protected BigDecimal tarifa;
    protected BigDecimal baseImponible;
    protected BigDecimal valor;

    public BigDecimal getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(BigDecimal baseImponible) {
        this.baseImponible = baseImponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoPorcentaje() {
        return codigoPorcentaje;
    }

    public void setCodigoPorcentaje(String codigoPorcentaje) {
        this.codigoPorcentaje = codigoPorcentaje;
    }

    public BigDecimal getTarifa() {
        return tarifa;
    }

    public void setTarifa(BigDecimal tarifa) {
        this.tarifa = tarifa;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
