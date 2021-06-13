/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Adrián Fernández García
 */
public class Calificacion implements Serializable {
    //puntuacion que se establece a un contenido
    private int puntuacion;
    //cliente que califica
    private Cliente cliente;
    //contenido que es calificado
    private Contenido contenidoCalificado;

    /**
     * Constructor vacío
     */
    public Calificacion(){
        
    }
    
    /**
     * Constructor
     * @param puntuacion
     * @param cliente
     * @param contenidoCalificado 
     */
    public Calificacion(int puntuacion, Cliente cliente, Contenido contenidoCalificado) {
        this.puntuacion = puntuacion;
        this.cliente = cliente;
        this.contenidoCalificado = contenidoCalificado;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Contenido getContenidoCalificado() {
        return contenidoCalificado;
    }

    public void setContenidoCalificado(Contenido contenidoCalificado) {
        this.contenidoCalificado = contenidoCalificado;
    }

    /**
     * Sobrecarga del método equals
     * @param obj objeto a comparar
     * @return true si el contenido calificado y el cliente que lo califica son los mismos en las dos calificaciones
     */
    @Override
    public boolean equals(Object obj) {
        
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        
        Calificacion c= (Calificacion)obj;
        //Dos calificaciones serán iguales si el contenido calificado y el cliente que califica coinciden.
        return (this.getContenidoCalificado().equals(c.getContenidoCalificado()))&&(this.getCliente().equals(c.getCliente()));

    }

    
    
}
