/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Suscripcion;

/**
 *
 * @author adria
 */
public class GestionSuscripciones {

    public static ArrayList<Suscripcion> suscripciones = new ArrayList();

    public static void comprobarSuscripciones() {

        for (Cliente c : GestionClientes.getClientes()) {
            if (c.getSuscripcion() != null) {
                if (LocalDate.now().equals(c.getSuscripcion().getFechaInicio().plusMonths(1))) {
                    //Cobrar la suscripcion  
                    c.getTarjeta().setSaldo((c.getTarjeta().getSaldo() - c.getSuscripcion().getPrecio()));
                    //establecer la fecha del final de la suscripcion como fecha de inicio
                    c.getSuscripcion().setFechaInicio(c.getSuscripcion().getFechaInicio().plusMonths(1));
                    GestionClientes.guardarClientes();
                }
            }

        }
    }

}
