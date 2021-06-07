/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author adria
 */
public class Suscripcion implements Serializable {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int tipoSuscripcion;
    private final double precio;

    public Suscripcion(LocalDate fechaInicio,LocalDate fechaFin, int tipoSuscripcion, double precio) {
        this.fechaInicio = fechaInicio;
        this.fechaFin=fechaFin;
        this.tipoSuscripcion = tipoSuscripcion;
        this.precio=precio;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
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

   
    
}
