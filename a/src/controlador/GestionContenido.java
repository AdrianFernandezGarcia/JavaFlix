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
import modelo.Contenido;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Adrián
 */
public class GestionContenido {
    
    public static ArrayList<Contenido> contenidos= new ArrayList();
    
    
    public static void crearContenido (Contenido contenido){
        
        contenidos.add(contenido);
        guardarContenido();
                
    }
    
    
    public static void modificarContenido(Contenido contenido, int index){
        
        contenidos.set(index, contenido);
        guardarContenido();
               
    }
    
    
    public static void cargarContenido() {
        try {
            //Lectura de los clientes
            FileInputStream istreamPer = new FileInputStream("contenido.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamPer);
            contenidos = (ArrayList<Contenido>) oisPer.readObject();
            contenidos.sort(Comparator.reverseOrder());
            istreamPer.close();
            
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos

    public static void guardarContenido() {
        try {
            //Si hay datos los guardamos...
            if (!contenidos.isEmpty()) {
                try ( 
                    //Serialización
                    FileOutputStream ostreamPer = new FileOutputStream("contenido.dat")) {
                    ObjectOutputStream oosPer = new ObjectOutputStream(ostreamPer);
                    oosPer.writeObject(contenidos);
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
