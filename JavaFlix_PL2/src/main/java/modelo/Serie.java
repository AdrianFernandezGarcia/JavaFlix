/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Adrián
 */
public class Serie {
    private int temporadas;
    private ArrayList<Capitulo> capitulos;

    public Serie(int temporadas, ArrayList<Capitulo> capitulos) {
        this.temporadas = temporadas;
        this.capitulos = capitulos;
    }
    
    
    //GETTERS & SETTERS

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(ArrayList<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }
    
    
}
