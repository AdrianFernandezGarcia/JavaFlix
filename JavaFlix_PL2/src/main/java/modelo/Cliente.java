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
public class Cliente {
    
    private String dni;
    private String nombre;
    private String correo;
    private String clave;
    private TarjetaCredito tarjeta;

    public Cliente(String dni, String nombre, String correo, String clave, TarjetaCredito tarjeta) {
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.tarjeta = tarjeta;
    }
    
    //GETTERS & SETTERS

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    
}
