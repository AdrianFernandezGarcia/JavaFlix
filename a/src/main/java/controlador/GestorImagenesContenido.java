/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import vista.administrador.OperacionesPelicula;

/**
 *
 * @author adria
 */
public class GestorImagenesContenido {
    private final int VALOR_ALTURA=150;
    private final int VALOR_ANCHURA=150;
    
    public File seleccionarImagen(File archivoGuardar, JFrame frame){
        //Filtro para que el selector solo escoja entre imágenes
        FileFilter imageFilter = new FileNameExtensionFilter(
                "Imágenes", ImageIO.getReaderFileSuffixes());
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(imageFilter);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        //Mostrar la ventama de selector de archivos
        int option = fileChooser.showOpenDialog(frame);

        //Leer el achivo y asignárselo al valor de la portada.
        if (option == JFileChooser.APPROVE_OPTION) {
            archivoGuardar=fileChooser.getSelectedFile();
            
               
        } 
        else{
            //error
        }
        
        return archivoGuardar;

    }                                     

    
    public File escalarImagen(File fileData,String nombreArchivo) {
        
        String rutaEscritura="imagenes/"+nombreArchivo+".jpg";
        try {
            BufferedImage imagen =ImageIO.read(fileData);
            
            Image imagenReescalada= imagen.getScaledInstance(VALOR_ANCHURA, VALOR_ALTURA,Image.SCALE_SMOOTH);
            BufferedImage buffer= new BufferedImage(VALOR_ANCHURA, VALOR_ALTURA,BufferedImage.TYPE_INT_RGB);
            buffer.getGraphics().drawImage(imagenReescalada, 0, 0, new Color(0,0,0), null);
            
            ImageIO.write(buffer, "jpg", new File(rutaEscritura));
            
        } catch (IOException ex) {
            Logger.getLogger(OperacionesPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return new File(rutaEscritura);
    }
    
    
}
