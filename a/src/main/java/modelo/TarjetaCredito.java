/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Adrián Fernández García
 */
public class TarjetaCredito implements Serializable{
    
    private String numero;
    private Date fechaCaducidad;//mirar si hay que cambiarlo
    private double saldo;//mirar si hay que cambiarlo por long
    
    public TarjetaCredito(String numero, Date fechaCaducidad) {
        
        
        
        this.numero = numero;
        
        this.fechaCaducidad = fechaCaducidad;
        
    }
    
    
    //GETTERS & SETTERS

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
            
}
