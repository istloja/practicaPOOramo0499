/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_jueves0519;

import archivos_serealizables2a.Jugador;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJA1
 */
public class Libro implements Serializable {

    private String titulo;
    private Autor autor;
    public double precio;
    public int numeropaginas;
    public int año_de_publicacion;
   

    public Libro() {

    }

    public Libro(String titulo, Autor autor, double precio, int numeropaginas, int año_de_publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.numeropaginas = numeropaginas;
        this.año_de_publicacion = año_de_publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeropaginas() {
        return numeropaginas;
    }

    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }

    public int getAño_de_publicacion() {
        return año_de_publicacion;
    }

    public void setAño_de_publicacion(int año_de_publicacion) {
        this.año_de_publicacion = año_de_publicacion;
    }

    public void escribirObjeto(String Direccion, Libro libro) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            escritor.writeObject(libro);
            escritor.close();
        } catch (Exception e) {
            System.out.println("se ha producido un error " + e);
        }
    }

    public void escribirLibro(String Direccion, List<Libro> lj) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            List<Libro> lc;
            for (Libro libro : lj) {
                escritor.writeObject(libro);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se ha producido un error" + e);
        }
    }

    public void leerArchivo(String Direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(Direccion));
            Object auxiliar = lector.readObject();
            Libro libro = (Libro) auxiliar;
            System.out.println("el libro se llama : " + libro.getAutor() + " " + libro.getAutor());
        } catch (Exception e) {
            System.out.println("se ha producido un error " + e);
        }
    }

    public List<Libro> leerLibro(String dire) {
        List<Libro> lj = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dire));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Libro libro = (Libro) auxiliar;
                lj.add(libro);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("se ha producido un error " + e);
        }
        return lj;

    }
    public int edadMenor(List<Libro>lj){
   int edadmenor = lj.get(0).getAño_de_publicacion();
        for (Libro libro : lj) {
            System.out.println("la edad mayor es: " + edadmenor + " la edad del objeto es " + libro.getAño_de_publicacion());
            if (libro.getAño_de_publicacion() < edadmenor) {
                edadmenor = libro.getAño_de_publicacion();
            }
        }
        return edadmenor;
}
    
    public Libro libroactualizado(List<Libro>lj){
    Libro act = lj.get(0);
        for (Libro libro : lj) {
            
            if (libro.getAño_de_publicacion() > 2010) {
                act = libro;
                System.out.println("actualisado"+libro.getTitulo());
            }
        }
        return act;
}
    
    
    

    public static void main(String[] args) {
       Libro objeto = new Libro();
        Libro l1 = new Libro("las tres vestias de un castillo ", new Autor("Pablo", "Ramon", 45, 967234672, 23, "loja"), 34, 123, 2000);
        Libro l2 = new Libro("el ceñor de los anillos ", new Autor("Diego", "Ordoñez", 34, 875699083, 26, "Malacatos"), 38, 165, 2005);
        Libro l3 = new Libro("los girasoles", new Autor("Fabian", "Valverde", 50, 95234589, 27, "Cuenca"), 39, 154, 2010);
        Libro l4 = new Libro("la isla perdida", new Autor("Luis", "Quevedo", 35, 916293440, 28, "Nangora"), 40, 200, 2006);
        List<Libro> lj = new ArrayList<>();
        lj.add(l1);
        lj.add(l2);
        lj.add(l3);
        lj.add(l4);
     System.out.println("a");
     for (Libro libro : lj){
         System.out.println(libro.getTitulo());
     }
        objeto.escribirLibro("C:\\Users\\ISTLOJA1\\Desktop\\practica 0519.txt", lj);
objeto.leerArchivo("C:\\Users\\ISTLOJA1\\Desktop\\practica 0519.txt");

        objeto.escribirObjeto("C:\\Users\\ISTLOJA1\\Desktop\\practica 0519.txt", l4);
        List<Libro> b = objeto.leerLibro("C:\\Users\\ISTLOJA1\\Desktop\\practica 0519.txt");
        for (Libro libro : b) {
            System.out.println(libro.getNumeropaginas());
        }
        System.out.println("el  libro es bien  "+objeto.edadMenor(lj));
        System.out.println("esta actualizado"+objeto.año_de_publicacion);
    }
    
}
