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
 * @author Adrián
 */
public class TarjetaCredito implements Serializable{
    
    private String numero;
    private Date fechaCaducidad;//mirar si hay que cambiarlo
    private int saldo;//mirar si hay que cambiarlo por long
    
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

    

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
            
}
