package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Adrián
 */
public abstract class Contenido implements Serializable, Comparable<Contenido> {

    protected String titulo;
    protected String sinopsis;
    protected String genero;
    protected int anio;
    protected ArrayList<String> actores;
    protected ImageIcon portada;
    protected ArrayList<Calificacion> calificaciones = new ArrayList();
    protected double mediaPuntuaciones = 0;

    //GETTERS & SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    public ImageIcon getPortada() {
        return portada;
    }

    public void setPortada(ImageIcon portada) {
        this.portada = portada;
    }

    public void setCalificacion(ArrayList<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public ArrayList<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public double getMediaPuntuaciones() {
        return mediaPuntuaciones;
    }

    public void setMediaPuntuaciones(double mediaPuntuaciones) {
        this.mediaPuntuaciones = mediaPuntuaciones;
    }

    @Override
    public int compareTo(Contenido t) {
        if ((this.anio > t.anio) && (this.mediaPuntuaciones > t.mediaPuntuaciones)) {

            return 1;
        } else if ((this.anio < t.anio) && (this.mediaPuntuaciones < t.mediaPuntuaciones)) {

            return -1;
        } else if ((this.anio == t.anio) && (this.mediaPuntuaciones > t.mediaPuntuaciones)) {
            return 1;
        } else if ((this.anio == t.anio) && (this.mediaPuntuaciones < t.mediaPuntuaciones)) {
            return -1;
        } 
        
        
        else {

            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        Contenido c = (Contenido) obj;

        return (this.titulo.equals(c.titulo));

    }

    @Override
    public String toString() {

        return this.titulo + "      " + this.anio + "      " + this.mediaPuntuaciones;

    }

}
