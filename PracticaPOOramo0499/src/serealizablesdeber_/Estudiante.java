/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serealizablesdeber_;

/**
 *
 * @author ISTLOJA1
 */
public class Estudiante implements serializables {
    private static Object p1;

    private static void Carrera(String sotfware, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
     private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private Materia materia;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, String direccion, Materia materia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.materia = materia;
    }
    // geter

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    public static void main(String[] args) {
        //(String nombre, int numerCiclos, int numeroCreditos)
    
        System.out.println("nombre del estudiante "+p1.getNombre()+" Materia "+p1.getMateria().getNombre()+" Carrera "+p1.getMateria().getCarrera().getNombre());

    }


}
    
    

