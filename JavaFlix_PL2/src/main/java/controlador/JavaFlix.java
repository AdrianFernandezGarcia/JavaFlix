/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Administrador;
import modelo.Cliente;
import modelo.TarjetaCredito;

/**
 *
 * @author Adrián
 */
public class JavaFlix {
    
    
    public static void main(String[] args) {
        
        Administrador admin = new Administrador();
        
        TarjetaCredito t1= new TarjetaCredito("1234567891011126", "2", 0);
        Cliente cliente1= new Cliente("0", "Paco", "a", "1", t1);
        int index=0;
        
        switch(index){
            
            
        }
    }
}
