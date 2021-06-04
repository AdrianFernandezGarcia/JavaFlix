/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author adria
 */
public class Suscripcion implements Serializable {
    private LocalDate fechaInicio;
    private int tipoSuscripcion;
    private double precio;

    public Suscripcion(LocalDate fechaInicio, int tipoSuscripcion, double precio) {
        this.fechaInicio = fechaInicio;
        this.tipoSuscripcion = tipoSuscripcion;
        this.precio=precio;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public void setTipoSuscripcion(int tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
