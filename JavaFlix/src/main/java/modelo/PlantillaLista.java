/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * Clase que genera una plantilla personalizada que luego se añade a los JList de las ventanas que tengan lista.
 * @author Adrián Fernández García
 */
public class PlantillaLista extends DefaultListCellRenderer implements ListCellRenderer<Object> {

    /**
     * 
     * @param list lista
     * @param value objeto de la lista
     * @param index 
     * @param isSelected flag que determina si un objeto se ha seleccionado o no.
     * @param cellHasFocus
     * @return 
     */
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
      
        Contenido contenido=(Contenido)value;
       
        setText(contenido.toString());
        setIcon(contenido.getPortada());
        setIconTextGap(10);
        
        //Si se ha seleccionado un elemento, poner su fondo de color rojo
        if(isSelected){
            setBackground(Color.red);
        }
        //si no, no poner ningún color
        else{
            setBackground(null);
        }
        
        setEnabled(true);
        setFont(list.getFont());
        
        return this;
    }
    
    
    
}
