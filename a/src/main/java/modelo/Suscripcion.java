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
    //fecha en la que se inició la suscripción
    private LocalDate fechaInicio;
    //fecha en la que acaba la suscripción
    private LocalDate fechaFin;
    //tipos de suscripción
    public enum TipoSuscripcion{Basica,Estandar,Premium;}
    private final TipoSuscripcion tipoSuscripcion;
    //precio de la suscripción
    private final double precio;

    /**
     * Constructor
     * @param fechaInicio
     * @param fechaFin
     * @param tipoSuscripcion
     * @param precio 
     */
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
