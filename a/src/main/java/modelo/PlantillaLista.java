/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Adrián Fernández García
 */
public class PlantillaLista extends DefaultListCellRenderer implements ListCellRenderer<Object> {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        
        
       
        Contenido contenido=(Contenido)value;
        ImageIcon imagenPortada= contenido.getPortada();
        
        
        setText(contenido.toString());
        setIcon(contenido.getPortada());
        setIconTextGap(10);
        
        
        if(isSelected){
            setBackground(Color.red);
        }
        
        setEnabled(true);
        setFont(list.getFont());
        
        return this;
    }
    
    
    
}
