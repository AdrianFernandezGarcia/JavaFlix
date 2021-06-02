/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Adrián
 */
public class Pelicula extends Contenido {
    
    private String duracionMinutos;
    private String director;
    
    public Pelicula(String titulo, String sinopsis, String genero, int anio, String actores,ImageIcon portada, String duracionMinutos, String director) throws IOException {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.anio = anio;
        this.actores = actores; 
        this.portada=portada;
        this.duracionMinutos=duracionMinutos;
        this.director=director;
    }
    
    //GETTERS & SETTERS

    public String getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(String duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return this.titulo;
    }
    
    
    
    
    
}
