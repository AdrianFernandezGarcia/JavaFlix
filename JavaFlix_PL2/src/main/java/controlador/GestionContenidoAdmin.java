/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Contenido;
import java.util.ArrayList;

/**
 *
 * @author Adrián
 */
public class GestionContenidoAdmin {
    
    private ArrayList<Contenido> contenidos= new ArrayList();
    
    
    public void crearContenido (Contenido contenido){
        
        contenidos.add(contenido);
        
    }
    
    public void borrarContenido(Contenido contenido){
        
        contenidos.remove(contenido);
        
    }
    
    public void modificarContenido(Contenido contenido){
        
        
        
        
    }
    
    
    public void buscarContenido(String titulo){
        
        for (int i=0;i<contenidos.size();i++){
            
            if(titulo.toLowerCase().equals(contenidos.get(i).getTitulo().toLowerCase())){
                
            }
        }
        
        
    }
    
    
}
