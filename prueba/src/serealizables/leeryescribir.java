/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serealizables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJA1
 */
public class leeryescribir {
   
    public class comprovador implements Serializable {
    private String apellido;
    private String nombre;
    private String direccion;
    

    public comprovador() {
    }

    public comprovador(String apellido, String nombre,String direccion) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
       
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getdireccion() {
        return direccion;
    }

    public void setdireccion(int direccion) {
        this.direccion = direccion;
    
    
    
     public void compovador(String nombre, List<nombre> lista) {
        try {
            ObjectOutputStream escr = new ObjectOutputStream(new FileOutputStream(autor));
            for (Libro libro : lista) {
                escr.writeObject(autor);
            }
            escr.close();
        } catch (Exception e) {
            System.out.println("error" + e);

        }
    }
      public int menosNumpaginas(List<Libro> lista) {
        int edadmax = lista.get(0).getNumPag();
        for (Libro Libro : lista) {
            if (Libro.getNumPag()>edadmax) {

               edadmax = Libro.getNumPag();

            } else {
                System.out.println("");
            }

        }
        int menosNumpaginas = 0;

        return  menosNumpaginas ;

    }
      public Libro masNumpaginas(List<Libro> lista) {
        Libro  edadmax = lista.get(0);
        for (Libro Libro : lista) {
            if (Libro.getNumPag()> edadmax.getNumPag()) {
               
                edadmax  = Libro;
            }
        }
        Libro masNumpaginas = null;
        return masNumpaginas ;
    }
     
}
     public void leerLibro(String Autor) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(Autor));
            Object auxiliar = lector.readObject();
            Autor j1 = (Autor) auxiliar;
            System.out.println("nombre" + j1.nombre + "aÃ±odepublicacion" + j1.aÃ±odepublicacion);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public List<Libro> leerlibro(String url) {

        List<Libro> Lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Libro j1 = (Libro) auxiliar;
                Lista.add(j1);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return Lista;

    }
     public double PorcentajedeLibro(Libro Libroadn) {
        return Libroadn.getAÃ±odepublicacion()+ Libroadn.getNumPag();

    }

    public Libro masvendidos(List<Libro> lista) {
        Libro mayorefect = lista.get(0);
        Libro masvendidos = null;
        for (Libro libro : lista) {
            if (masvendidos((List<Libro>) libro) >masvendidos(libro)) {
                mayorefect =libro;
                
            }
        }
        return masvendidos;
    }
        public Jugador Mporcentajeacierto(List<Jugador> lista) {
            Jugador mayorporcentaje  = lista.get(0);
        for (Jugador jugador : lista) {
                if (PorcentajeAcierto(jugador) > PorcentajeAcierto(mayorporcentaje)) {
                    mayorporcentaje = jugador;
                }
            }
                
            return  mayorporcentaje;
            
        }
    
        public Jugador Mporcentajeefectividad(List<Jugador> lista) {
        Jugador Mporcentajeefectividad= lista.get(0);
        for (Jugador jugador : lista) {
            if (PorcentajeEfectividad(jugador) >PorcentajeEfectividad(Mporcentajeefectividad)) {
                Mporcentajeefectividad = jugador;
            }
                
        }
        
        return Mporcentajeefectividad;
        
        }
        public int numerocarateres(Jugador jugador) {
            return jugador.getNombre().length()+jugador.getApellido().length();
            
        }
        
        public Jugador Mascarateres(List<Jugador> lista)  {
            Jugador Mascarateres = lista.get(0);
            for (Jugador jugador : lista)  {
        
               if ( numerocarateres(jugador)> numerocarateres(Mascarateres)) {
                   Mascarateres = jugador;
               }
                   
               }
            return  Mascarateres;
            
        }
        public Libro Menoscaracteres(List<Libro> lista)  {
            Libro Menoscaracteres = lista.get(0);
            for (libro libro : lista)  {
                
                if (numerocarateres(jugador)>  numerocarateres(Menoscaracteres)) {
                    Menoscaracteres = jugador;
                    
            }
           
            }
            return Menoscaracteres;
        }
        
}
 public static void main(String[] args) {
        Libro objeto = new  Libro();
        Libro j1 = new  Libro(". Citas del Presidente Mao Tse-Tung", "andersson guzman", 33, 520, 2005, new autores("juventus" "Turin") 30, 46, 51);
        Libro j2 = new  Libro("El SeÃ±or de los Anillos", "andersson guzman", 31, 600, 2001, new Equipo("Barcelona", 30, "Barcelona"), 1, 22, 34, 45, 57);
        Libroj3 = new  Libro("Neymar", "Jr", 28, 200, 2011, new Equipo("PSG", 10, "Paris"), 12, 29, 37, 46, 55);
        Libro j4 = new  Libro("Eden", "Hazard", 27, 1590, 2010, new Equipo("Real Madrid", 40, "Madrid"), 1, 23, 31, 40, 58);
        Libro j5 = new  Libro("Marcelo" ,"vieira", 30, 980, 2013, new Equipo("Real Madrid", 50, "Madrid"), 1, 27, 30, 47, 53);
        Libro j6 = new  Libro("Sergio", "Ramos", 29, 1609, 2012, new Equipo("Real Madrid", 70, "Madrid"), 1, 28, 32, 49, 56);
        Libro j7 = new  Libro("Jordi", "Alba", 27, 1590, 2010, new Equipo("barcelona", 40, "barcelona"), 1, 23, 31, 40, 58);
        Libro j8 = new  Libro("Ningolo", "Cante", 27, 1590, 2010, new Equipo("Chelsea", 43, "Chelsea"), 1, 23, 31, 40, 58);
        Libro j9 = new  Libro("Pual", "Pogba", 27, 1590, 2010, new Equipo("Juventus", 49, "Juventos"), 1, 23, 31, 40, 58);
        Libro  j10 = new  Libro("Alexis", "Sanches", 27, 1590, 2010, new Equipo("inter", 40, "Milan"), 1, 23, 37, 60, 60);
        List< Libro> Lista = new ArrayList<>();
        Lista.add(j1);
        Lista.add(j2);
        Lista.add(j3);
        Lista.add(j4);
        Lista.add(j5);
        Lista.add(j6);
        Lista.add(j7);
        Lista.add(j8);
        Lista.add(j9);
        Lista.add(j10);
           
        System.out.println("a");
        for (Libros pers : Lista) {
            System.out.println(pers.getNombre());
    
}
