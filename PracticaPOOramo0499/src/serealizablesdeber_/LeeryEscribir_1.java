/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serealizablesdeber_;

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
class LeeryEscribir {
    public List<Estudiante> leerPersonas(String url) {

            List<Estudiante> Lista = new ArrayList<Estudiante>();
            try {
                ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
                Object auxiliar = lector.readObject();
                while (auxiliar != null) {
                    Estudiante p1 = (Estudiante) auxiliar;
                    Lista.add(p1);
                    auxiliar = lector.readObject();
                }

            } catch (Exception e) {//
                System.out.println("error"+e);
            }


        return Lista;

    }

    public void leerLista(String variable) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(variable));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Estudiante p1 = (Estudiante) auxiliar;
                System.out.println("su direccion "+p1.getDireccion());
                auxiliar = lector.readObject();
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }

    public void escribirObjeto(String direccion, Estudiante p1) {

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
            Estudiante p1 = (Estudiante) auxiliar;
            System.out.println("leer direccion");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void escribirLista(String direccion, List<Estudiante> lista) {
        try {
            ObjectOutputStream escritorio = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Estudiante estudiante : lista) {
                escritorio.writeObject(estudiante);
            }
            escritorio.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }

    public static void main(String[] args) {
        LeeryEscribir objeto = new LeeryEscribir();
        Estudiante p2=new Estudiante ("luis2","quevedo2",22,"loja",new Materia
        (" Ingles ",2,"ander",new Carrera("software2",5,2)));
        Estudiante p3=new Estudiante (" jose "," torres ",23,"tierrascoloradas",new Materia
        (" fisica ",2,"luis",new Carrera("Contabilidad3",5,2)));
           Estudiante p4=new Estudiante (" medardo "," ochoa ",24,"malacatos",new Materia
        (" ciencias ",2,"calos",new Carrera("sotfware3",5,2)));
              Estudiante p5=new Estudiante (" David "," ocampo ",27,"el centro",new Materia
        (" matematicas ",2,"ramiro",new Carrera("Contabilidad3",5,2)));
                Estudiante p6=new Estudiante (" meiver "," ruis ",12,"el capuli",new Materia
        (" quimica ",2,"vicente",new Carrera("sotfware3",5,2)));
                  Estudiante p7=new Estudiante (" Gustavo "," Ruiz ",18,"",new Materia
        (" lengua y literatura ",2,"emil",new Carrera("Contabilidad3",5,2)));
                    Estudiante p8=new Estudiante (" neider "," toledo ",29," nangora ",new Materia
        (" biologia ",2,"oscar",new Carrera("sotfware3 ",5,2)));
                      Estudiante p9=new Estudiante (" enrrique "," villa ",31,"san pedro ",new Materia
        (" computacion ",2,"fernando",new Carrera("Contabilidad3",5,2)));
                        Estudiante p10=new Estudiante (" Rafael "," correa ",20," zamora huaico",new Materia
        (" quimica ",2,"celio",new Carrera("sotfware3 ",5,2)));
                          Estudiante p11=new Estudiante (" adalvico"," medina ",19," yangana ",new Materia
        (" Matematicas3 ",2,"analia",new Carrera("Contabilidad3",5,2)));



        List<Estudiante> Lista = new ArrayList<>();//creamos la lista para guarar objetos
        //una vez que creasmos la lista ponemos los objetos dentro de ella

        Lista.add(p2);
        Lista.add(p3);
        Lista.add(p4);
       Lista.add(p5);
       Lista.add(p6);
         Lista.add(p7);
        Lista.add(p8);
        Lista.add(p9);
       Lista.add(p10);
       Lista.add(p11);
        int a = Lista.size();// numero de listas
        System.out.println(" numero de listas"+a);
     for (Estudiante estudiante : Lista) {
       //  Estudiante p1=new Estudiante ("luis","quevedo",22,"loja",new Materia
       // ("Matematicas",2,"ander",new Carrera("sotfware",5,2)));

          System.out.println("Nombre "+estudiante.getNombre()+" Apellido "+ estudiante.getApellido()+" edad "+ estudiante.getEdad()+" Direccion "+estudiante.getDireccion()+" Materia"+
                  estudiante.getMateria().getNombre()+" Creditos "+estudiante.getMateria().getCreditos()+" Docente "+estudiante.getMateria().getDocente()+" Carrera "+estudiante.getMateria().getCarrera().getNombre()
                  +" Ciclos "+estudiante.getMateria().getCarrera().getNumerCiclos()+"  Numero de creditos"+estudiante.getMateria().getCarrera().getNumeroCreditos());
//            
//            
//        }
//        System.out.println(Lista.size());
       objeto.escribirLista("C:\\Users\\ISTLOJA1\\Desktop\\tarea deber.txt", Lista);

      // objeto.escribirObjeto("C:\Users\ISTLOJA1\Desktop\tarea deber.txt", p2);
        //objeto.leerArchivo("C:\Users\ISTLOJA1\Desktop\tarea deber.txt");
        //objeto.leerLista("C:\Users\ISTLOJA1\Desktop\tarea deber.txt");
      //  List<Estudiante> b=objeto.leerPersonas("C:\Users\ISTLOJA1\Desktop\tarea deber.txt");
        //for (Estudiante estudiante : b) {
           // System.out.println("edades "+ p2.getNombre());

        }

    }
}    
    

