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
public class Capitulo {
    
    private String titulo;
    private int duracionMinutos;

    public Capitulo(String titulo, int duracionMinutos) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
    }

    //GETTERS & SETTERS
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    
    
}
