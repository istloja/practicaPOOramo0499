/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serealizables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJA1
 */
public class comprovador  implements serealizables  {
    private String nombre;
    private String apellido;
    private String direccion;
    
    public comprovador() {
    }

    public comprovador(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    

    public List<Comprador> leerCompradores(String url) {

        List<Comprador> Lista = new ArrayList<Comprador>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Comprador p1 = (Comprador) auxiliar;
                Lista.add(p1);
                auxiliar = lector.readObject();
            }

        } catch (Exception e) {//
            System.out.println("error" + e);
        }

        return Lista;

    }

    public void leerLista(String variable) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(variable));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Comprador p1 = (Comprador) auxiliar;

                auxiliar = lector.readObject();
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }

    public void escribirObjeto(String direccion, Comprador p1) {

        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            escritorio.writeObject(p1);                                                                  // input para leer Output para escribir en el objeto
            escritorio.close();
        } catch (Exception e) {
            System.out.println("se produjo un error en " + e);
        }
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Comprador p1 = (Comprador) auxiliar;

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void escribirLista(String direccion, List<Comprador> lista) {
        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Comprador persona : lista) {//POR CADA VEZ Q rrecorro la lista creo un objeto de la clase persdona
                escritorio.writeObject(persona);
            }
            escritorio.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }

    public static void main(String[] args) {
        Comprador objeto = new Comprador();
        Comprador p1 = new Comprador("aloe", "ruis", "Venezuela");
        Comprador p2 = new Comprador("decia", "delgado", "onduruas");
        Comprador p3 = new Comprador("tilio", "torres", "loja");
        Comprador p4 = new Comprador("emilio", "Arboleda", "Vilcabamba");
        Comprador p5 = new Comprador("eley", "Armijos", "Loja");
        Comprador p6 = new Comprador("maico", "benites", "San Pedro");
        Comprador p7 = new Comprador("juan", "jara", "Plateado");
        Comprador p8 = new Comprador("dilan", "jara", "Ereas");
        Comprador p9 = new Comprador("samel", "agua", "Malacatos");
        Comprador p10 = new Comprador("Alejandra", "iran", "San fracniso ");
        List<Comprador> Lista = new ArrayList<>();
        Lista.add(p1);
        Lista.add(p2);
        Lista.add(p3);
        Lista.add(p4);
        Lista.add(p5);
        Lista.add(p6);
        Lista.add(p7);
        Lista.add(p8);
        Lista.add(p9);
        Lista.add(p10);

        int a = Lista.size();
        System.out.println(a);

        List<Comprador> b = objeto.leerCompradores("‪C:\\Users\\ISTLOJA1\\Desktop\\prueba.txt");
        for (Comprador persona : b) {
            ;

        }

    }
}


        
        
    

       

    