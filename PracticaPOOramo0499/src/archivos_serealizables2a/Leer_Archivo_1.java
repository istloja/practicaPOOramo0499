/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_serealizables2a;

import archivos_realizables.Equipo;
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
class Leer_Archivo {
    private static Object objeto;

    public void escribirObjeto(String Direccion, Jugador jugador) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            escritor.writeObject(jugador);
            escritor.close();
        } catch (Exception e) {
            System.out.println("se ha produjo un error " + e);
        }
    }

    public void escribirLista(String Direccion, List<Jugador> lj) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            for (Jugador jugador : lj) {//para crear una lista
                escritor.writeObject(jugador);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("se  ha produjo un error " + e);
        }
    }

    public void leerArchivo(String Direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(Direccion));
            Object auxiliar = lector.readObject();
            Jugador jugador = (Jugador) auxiliar;//cambio de objeto a persona
            System.out.println("el jugador se llama se llama: " + jugador.getNombre() + " " + jugador.getApellido() + " su edad es: " + jugador.getEdad() + " sus numeros de goles son " + jugador.getNumeroGoles() + " su año de debut es: " + jugador.getAñoDebut() + " su equipo es: " + jugador.getEquipo().getNombre() + " tiene " + jugador.getEquipo().getNumerotitulos() + " titulos y es de la ciudad de " + jugador.getEquipo().getCiudad());
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public List<Jugador> GuardarLista(String dire) {
        List<Jugador> lj = new ArrayList<>();//creamos la lista para guardar objetos
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dire));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador jugador = (Jugador) auxiliar;
                lj.add(jugador);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
        return lj;

    }

    public void LeerLista(String dir) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador jugador = (Jugador) auxiliar;
                System.out.println("el jugador se llama se llama: " + jugador.getNombre() + " " + jugador.getApellido() + " su edad es: " + jugador.getEdad() + " sus numeros de goles son " + jugador.getNumeroGoles() + " su año de debut es: " + jugador.getAñoDebut() + " su equipo es: " + jugador.getEquipo().getNombre() + " tiene " + jugador.getEquipo().getNumerotitulos() + " titulos y es de la ciudad de " + jugador.getEquipo().getCiudad());
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public int edadMayor(List<Jugador> lj) {
        int edadmayor = lj.get(0).getEdad();
        for (Jugador jugador : lj) {
            System.out.println("la edad mayor es: " + edadmayor + " la edad del objeto es " + jugador.getEdad());
            if (jugador.getEdad() > edadmayor) {
                edadmayor = jugador.getEdad();
            }
        }
        return edadmayor;
    }

    public int edadMenor(List<Jugador> lj) {
        int edadmenor = lj.get(0).getEdad();
        for (Jugador jugador : lj) {
            System.out.println("la edad mayor es: " + edadmenor + " la edad del objeto es " + jugador.getEdad());
            if (jugador.getEdad() < edadmenor) {
                edadmenor = jugador.getEdad();
            }
        }
        return edadmenor;
    }

    public int masGoles(List<Jugador> lj) {
        int masgoles = lj.get(0).getNumeroGoles();
        for (Jugador jugador : lj) {
            System.out.println("el numero mayor de goles es: " + masgoles + " la cantidad de goles del objeto es " + jugador.getNumeroGoles());
            if (jugador.getNumeroGoles() > masgoles) {
                masgoles = jugador.getNumeroGoles();
            }
        }
        return masgoles;
    }
    public Jugador debutP(List<Jugador> lista){
        Jugador debuto = lista.get(0);
        Iterable<Jugador> Lista = null;
        for (Jugador jugador : Lista) {
            if (debuto.getAñoDebut()< jugador.getAñoDebut()) {
                debutP = 
                
            }
            
        }
    }
    public int menosGoles(List<Jugador> lj) {
        int menosgoles = lj.get(0).getNumeroGoles();
        for (Jugador jugador : lj) {
            System.out.println("el numero menor de goles es: " + menosgoles + " la cantidad de goles del objeto es " + jugador.getNumeroGoles());
            if (jugador.getNumeroGoles() < menosgoles) {
                menosgoles = jugador.getNumeroGoles();
            }
        }
        return menosgoles;
    }

   
    public static void main(String[] args) {
        Leer_Archivo objetos = new Leer_Archivo();
        Jugador e1 = new Jugador("Cristiano", "Ronaldo", 33, 520, 2005, new Equipo("Juventus", 20, "Turin"));
        Jugador e2 = new Jugador("Leonel", "Messi", 31, 600, 2007, new Equipo("Barcelona", 30, "Barcelona"));
        Jugador e3 = new Jugador("Neymar", "Jr", 28, 200, 2011, new Equipo("PSG", 10, "Paris"));
        Jugador e4 = new Jugador("Eden", "hazard", 27, 550, 2010, new Equipo("Real Madrid", 40, "Madrid"));
        List<Jugador> lj = new ArrayList<>();
        lj.add(e4);
        lj.add(e2);
        lj.add(e1);
        lj.add(e3);
        System.out.println(lj.size());
        int c = lj.size();
        System.out.println(c);
        for (Jugador jugador : lj) {
            System.out.println(jugador.getNombre());
        }
//        objetos.leerArchivo("C:\Users\ISTLOJA1\Desktop\jugadores.txt");
        objetos.escribirLista("C:\\Users\\ISTLOJA1\\Desktop\\jugadores.txt", lj);
        //objetos.escribirObjeto("C:\Users\ISTLOJA1\Desktop\jugadores.txt", e4);
//        objetos.LeerLista("C:\Users\ISTLOJA1\Desktop\jugadores.txt");
//        objetos.GuardarLista("C:\Users\ISTLOJA1\Desktop\jugadores.txt");
//        List<Jugador> b = objetos.GuardarLista("C:\Users\ISTLOJA1\Desktop\jugadores.txt");
//        for (Jugador jugador : b) {
//            System.out.println(jugador.getEdad() + " años");
              System.out.println(objeto.debutP(b).getAñoDebut);
//        }
        objetos.edadMayor(lj);
        objetos.edadMenor(lj);
        objetos.masGoles(lj);
        objetos.menosGoles(lj);
    }
}
