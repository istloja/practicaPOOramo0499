/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_realizables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ISTLOJA1
 */
class LeeryEscribir {

    File objeto=new File("C:\\Users\\ISTLOJA1\\Desktop\\jugadores.txttxt");
    
    public void leerArchivo(String direccion) {
        File archivo = new File(direccion);
        try {
            //convierte el archivo en objeto
            FileReader reader = new FileReader(archivo);
            BufferedReader recorrido = new BufferedReader(reader);
            String linea;
            while ((linea = recorrido.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void escribirArchivo(String direccion, String texto) {
        try {
            FileWriter Archivo = new FileWriter(direccion);
            PrintWriter escribir = new PrintWriter(Archivo);
            escribir.println(texto);
            Archivo.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Ingrese texto");
        String texto = entrada.nextLine();
        Archivo objeto = new Archivo();
        objeto.leerArchivo("C:\\Users\\ISTLOJA1\\Desktop\\jugadores.txt");
        objeto.escribirArchivo("C:\\Users\\ISTLOJA1\\Desktop\\jugadores.txt", texto);
    }

    void escribirLista(String cUsersISTLOJA1Desktopjugadorestxt, List<Jugador> lj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void leerLista(String cUsersISTLOJA1Desktopjugadorestxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    List<Jugador> leerjugador(String cUsersISTLOJA1Desktopjugadorestxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}