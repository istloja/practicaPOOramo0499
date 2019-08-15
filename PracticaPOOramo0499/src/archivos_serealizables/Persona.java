/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_serealizables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJA1
 */
public class Persona implements Serializable {

    private String nombre;
    private String apellido;
    private int telefono;
    private int edad;
    private mascota Mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int telefono, int edad, mascota Mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.Mascota = Mascota;
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

    public mascota getMascota() {
        return Mascota;
    }

    public void setMascota(mascota Mascota) {
        this.Mascota = Mascota;

    }

    public static void main(String[] args) {
        Persona p1 = new Persona("andersson", "guzman", 666, 20, new mascota("adalvico", 5, 4));
        Persona p2 = new Persona("bazuco", "bravo", 444, 18, new mascota("perrita", 4, 3));
        System.out.println("La persona se llama" + p1.getNombre() + "y su mascota es" + p1.getMascota().getNombre());

    }

}
