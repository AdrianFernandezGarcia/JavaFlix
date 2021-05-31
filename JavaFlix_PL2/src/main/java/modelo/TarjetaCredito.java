/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import java.util.InputMismatchException;

/**
 *
 * @author Adrián
 */
public class TarjetaCredito {
    
    private String numero;
    private String fechaCaducidad;//mirar si hay que cambiarlo
    private int saldo;//mirar si hay que cambiarlo por long
    private String patronNumTarjeta="\\d{16}";
    public TarjetaCredito(String numero, String fechaCaducidad, int saldo) {
        
        
        if(numero.matches(patronNumTarjeta)){
             this.numero = numero;
        }
        
        else{
            System.out.println("Error. La tarjeta debe contener un numero de 16 dígitos.");
            throw new InputMismatchException() ;
        }
       
        this.fechaCaducidad = fechaCaducidad;
        this.saldo = saldo;
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
