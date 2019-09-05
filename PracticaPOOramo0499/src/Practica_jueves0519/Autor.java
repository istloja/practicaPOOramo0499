/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_jueves0519;

/**
 *
 * @author ISTLOJA1
 */
public class Autor {
    private String nombre;
    private String apellido;
    private int telefono;
    private int edad;
    private int  tipodelibro;

    public Autor() {
    }

    public Autor(String nombre, String apellido, int telefono, int edad, int tipodelibro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.tipodelibro = tipodelibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTipodelibro() {
        return tipodelibro;
    }

    public void setTipodelibro(int tipodelibro) {
        this.tipodelibro = tipodelibro;
    }
    
    
    
}
