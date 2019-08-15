/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_serealizables;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJA1
 */
public class Leeryescribrir {

    public void escribirobjeto(String direccion, Persona p1) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(p1);
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error" + e);
        }
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectOutputStream lector = new ObjectOutputStream(new FileOutputStream(direccion));
            Object auxiliar = lector.getClass();
            Persona p1 = (Persona) auxiliar;//cambio de  objeto a persona 
            System.out.println(p1.getMascota().getNombre() + "su edad es:" + p1.getMascota().getEdad());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void escribirlista(String direccion, List<Persona> Lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Persona persona : Lista) {
                escritor.writeObject(persona);

            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        Leeryescribrir objeto = new Leeryescribrir();
        Persona p1 = new Persona("bazuco1", "bravo", 444, 18, new mascota("perrita", 4, 3));
        Persona p2 = new Persona("bazuco2", "bravo", 444, 18, new mascota("perrita", 4, 3));
        Persona p3 = new Persona("bazuco3", "bravo", 444, 18, new mascota("perrita", 4, 3));
        Persona p4 = new Persona("bazuco4", "bravo", 444, 18, new mascota("perrita", 4, 3));
        List<Persona> lista = new ArrayList<>();//creamos la lista para guardar objetos 
        //una ves que creamos la lista, podemos los objetos dentro de ella 
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        objeto.escribirlista("/Users/ISTLOJA1/Desktop/ejemplo04.txt");

//        objeto.escribirobjeto("/Users/ISTLOJA1/Desktop/ejemplo04.txt", p2)
    }

    private void escribirlista(String usersISTLOJA1Desktopejemplo04txt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
