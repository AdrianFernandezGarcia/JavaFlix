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
    //numero de la tarjeta de crédito.
    private String numero;
    //fecha de caducidad .
    private Date fechaCaducidad;
    //saldo que el cliente tiene disponible en su tarjeta de crédito.
    private double saldo;
    
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
