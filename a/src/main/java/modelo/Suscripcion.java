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
 * @author Adrián Fernández García
 */
public class Suscripcion implements Serializable {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    public enum TipoSuscripcion{Basica,Estandar,Premium;}
    private final TipoSuscripcion tipoSuscripcion;
    private final double precio;

    public Suscripcion(LocalDate fechaInicio,LocalDate fechaFin, String tipoSuscripcion, double precio) {
        this.fechaInicio = fechaInicio;
        this.fechaFin=fechaFin;
        this.tipoSuscripcion= TipoSuscripcion.valueOf(tipoSuscripcion);
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

    public TipoSuscripcion getTipoSuscripcion() {
        return tipoSuscripcion;
    }
    


    public double getPrecio() {
        return precio;
    }

   
    
}
