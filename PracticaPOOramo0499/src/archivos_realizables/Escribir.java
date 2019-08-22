/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_realizables;

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
public class Escribir {
    private static Object lector;
    
      public List<Jugador> leerPersonas(String url) {

        List<Jugador> Lista = new ArrayList<Jugador>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador p1 = (Jugador) auxiliar;
                Lista.add(p1);
                auxiliar = lector.readObject();
            }

        } catch (Exception e) {//
            System.out.println("error" + e);
        }

        return Lista;
    }

    public int edadMayor(List<Jugador>  Lista) {
        int edadMayor = Lista.get(0).getEdad();
        for (Jugador jugador : Lista) {
            if (jugador.getEdad()> edadMayor);
            edadMayor = jugador.getEdad();
        }
    
    return edadMayor;
    }

    public Jugador edadMenorObjeto(List<Jugador>  Lista) {
        Jugador edadMenor = Lista.get(0);
        for (Jugador jugador : Lista) {
            if (edadMenor.getEdad() > jugador.getEdad()) {
                edadMenor = jugador;
            }      
        
        }
        return edadMenor ;
    }
    public void escribrilista
        


    public static void main(String direccion,List<Jugador> Lista) {
        try {
            String url;
            ObjectInputStream escribir = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
            
        }
        LeeryEscribir objeto = new LeeryEscribir();
        Jugador j1 = new Jugador("cristiano", "ronaldo", 33, 520, 2005, new Equipo("Juventus", 20, "true"));
        Jugador j2 = new Jugador("leonel", "messi", 31, 600, 2007, new Equipo("Barcelona", 30, "true"));
        Jugador j3 = new Jugador("neymar", "jr", 28, 200, 2011, new Equipo("PSG", 10, "true"));
        Jugador j4 = new Jugador("edder", "hazar", 27, 300, 2010, new Equipo("Real madrid", 40, "true"));
        List<Jugador> lj = new ArrayList<>();
        lj.add(j1);
        lj.add(j2);
        lj.add(j3);
        lj.add(j4);
        System.out.println(a);
       //     for (Persona pers : lista){
//         System.out.println(pers.getNombre);
//     }
        
        objeto.escribirLista("C:\\Users\\ISTLOJA1\\Desktop\\jugadores.txt", lj);

        objeto.leerLista("C:\\Users\\ISTLOJA1\\Desktop\\jugadores.txt");
        List<Jugador> b = objeto.leerjugador("C:\\Users\\ISTLOJA1\\Desktop\\jugadores.txt");
        for (Jugador persona : b) {
            System.out.println(persona.getEdad());
            
        }

    }
}

    