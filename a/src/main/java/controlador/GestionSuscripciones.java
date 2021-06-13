/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import modelo.Cliente;
import modelo.Suscripcion;

/**
 *
 * @author Adrián Fernádez García
 */
public class GestionSuscripciones {

    public  ArrayList<Suscripcion> suscripciones = new ArrayList();
    public void comprobarSuscripciones() {
        
        for (Cliente c : GestionClientes.getClientes()) {
            if (c.getSuscripcion() != null) {
                if (comprobarFecha(c.getSuscripcion().getFechaFin())) {
                    System.out.println("Renovando suscripción...");
                    System.out.println("Saldo inicial: "+c.getTarjeta().getSaldo());
                    //Cobrar la suscripcion  
                    c.getTarjeta().setSaldo((c.getTarjeta().getSaldo() - c.getSuscripcion().getPrecio()));
                    //establecer la fecha del final de la suscripcion como fecha de inicio
                    c.getSuscripcion().setFechaInicio(c.getSuscripcion().getFechaFin());
                    //Ampliar suscripcion por 30 días
                    c.getSuscripcion().setFechaFin(c.getSuscripcion().getFechaFin().plusMonths(1));
                    //guardar cambios
                    GestionClientes.guardarClientes();
                    System.out.println("Saldo final: "+c.getTarjeta().getSaldo());
                }
            }

        }
    }
    
    private static boolean comprobarFecha(LocalDate fecha){
        Calendar fechaActual = Calendar.getInstance();
        fechaActual.set(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
        Calendar limite = Calendar.getInstance();
        limite.set(fecha.getYear(),fecha.getMonthValue(), fecha.getDayOfMonth());
        
        return ((fechaActual.after(limite)));
    }

}
