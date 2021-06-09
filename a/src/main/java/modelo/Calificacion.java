/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author adria
 */
public class Calificacion implements Serializable {

    private int puntuacion;
    private Cliente cliente;
    private Contenido contenidoCalificado;

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
