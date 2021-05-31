/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Adrián
 */
public class Pelicula extends Contenido {
    
    private int duracionMinutos;
    private String director;
    
    public Pelicula(String titulo, String sinopsis, String genero, int anio, String actores, int duracionMinutos, String director) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.anio = anio;
        this.actores = actores;
        this.duracionMinutos=duracionMinutos;
        this.director=director;
    }
    
    //GETTERS & SETTERS

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    
    
}
