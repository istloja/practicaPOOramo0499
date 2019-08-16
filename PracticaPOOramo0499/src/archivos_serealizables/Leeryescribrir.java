/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_serealizables;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import static java.util.Collections.list;
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

    public Leeryescribrir() {
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Persona p1 = (Persona) auxiliar;//cambio de  objeto a persona 
            System.out.println(p1.getMascota().getNombre() + "su edad es:" + p1.getMascota().getEdad());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void leerLista(String url) {
        try {
            ObjectInputStream Lector = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar = Lector.readObject();
            while (auxiliar != null) {
                Persona p1 = (Persona) auxiliar;//cambio de objeto a perosna 
                System.out.println(p1.getMascota().getNombre() + "su edad es:" + p1.getMascota().getEdad());
                auxiliar = Lector.readObject();
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public List<Persona> leerPersonas(String url) {
        List<Persona> Lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Persona p1 = (Persona) auxiliar;
                Lista.add(p1);
                auxiliar = lector.readObject();
            }

        } catch (Exception e) {
            System.out.println(e);

        }
        return Lista;
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
        int a = lista.size();
        System.out.println(a);
        Iterable<Persona> Lista = null;
//        for (Persona pers :Lista){
//            System.out.println(pers.getNombre());
        List<Persona> b = objeto.leerPersonas("\\Users\\ISTLOJA1\\Desktop\\ejemplo04.txt");
        for (Persona persona : b) {
            System.out.println(persona.getEdad());
        }

//        objeto.leerLista("\\Users\\ISTLOJA1\\Desktop\\ejemplo04.txt");
//        }
//        {  
    }
//        objeto.escribirLista("/Users/ISTLOJA1/Desktop/ejemplo04.txt", lista);

//        objeto.escribirobjeto("/Users/ISTLOJA1/Desktop/ejemplo04.txt", p2)
}
