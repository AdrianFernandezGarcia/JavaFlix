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
public class Administrador {
    
    private String correo;
    private String clave;

    public Administrador() {
        this.correo = "admin@javaflix.com";
        this.clave = "admin";
    }
    
    
    
    //GETTERS & SETTERS

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    



}
