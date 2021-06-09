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
import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author adria
 */
public class GestionClientes {
    public static ArrayList<Cliente> clientes= new ArrayList<Cliente>();
    

    public static void IntroducirCliente(Cliente cliente){
        clientes.add(cliente);
        guardarClientes();
    }
    
    
    public static  ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void cargarClientes() {
        try {
            //Lectura de los clientes
            FileInputStream istreamPer = new FileInputStream("clientes.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamPer);
            clientes = (ArrayList<Cliente>) oisPer.readObject();
            istreamPer.close();
            
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos

    public static void guardarClientes() {
        try {
            //Si hay datos los guardamos...
            if (!clientes.isEmpty()) {
                try ( 
                 
                    //Serialización
                    FileOutputStream ostreamPer = new FileOutputStream("clientes.dat")) {
                    ObjectOutputStream oosPer = new ObjectOutputStream(ostreamPer);
                    oosPer.writeObject(clientes);
                    ostreamPer.close();
                }
            } else {
                
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin guardarDatos
}
