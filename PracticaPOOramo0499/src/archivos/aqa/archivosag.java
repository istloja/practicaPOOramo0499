/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos.aqa;

import archivos.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ISTLOJA1
 */
public class archivosag {

//    public static void main(String[] args) {
//        File archivo = new File("‪C:\\Users\\ISTLOJA1\\Desktop\\ejemplo.txt");//creando un objeto de la clase archivo
//        //en las comillas va el nombre y la direccion del archivo
//        System.out.println(archivo.exists());
//        //para saber si es una carpeta o no 
//        System.out.println(archivo.isDirectory());
//        //para saber si es un archivo o no 
//        System.out.println(archivo.isFile());
//        //para saber si es un archivo oculto o no 
//        System.out.println(archivo.isHidden());
//        //para saber la ultima fecha de modificacion
//        System.out.println(archivo.lastModified());
//        archivo.delete();
//
//        File carpeta = new File("C:\\Users\\ISTLOJA1\\Desktop/");
//        //carpeta.list devuelve un arreglo con los archivos de una carpeta 
//        String[] arregloarchivos = carpeta.list();
//        for (int i = 0; i < arregloarchivos.length; i++) {
//          System.out.println(arregloarchivos[i]);
//          
//        }
//
//    }
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("que archivos desea guardar");
        String texto=entrada.nextLine();
        
        
        archivosag objeto= new archivosag();
        objeto.leerArchivo("C:\\Users\\ISTLOJA1\\Desktop\\ejemplo04.txt");
        objeto.escribirArchivo("C:\\Users\\ISTLOJA1\\Desktop\\ejemplo04.txt",texto);
        
        
    }
    public void leerArchivo(String direccion){
        File archivo = new  File(direccion);
        try {
            FileReader reader = new FileReader (archivo);// nos convierte el archivo en 
            BufferedReader recorrido=new BufferedReader (reader);
            String linea;
            while((linea=recorrido.readLine())!=null){
                System.out.println(linea);
                
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    public void escribirArchivo(String direccion,String texto) {
        try {
            FileWriter archivo = new FileWriter(direccion);
            PrintWriter escribir = new PrintWriter(archivo);
            escribir.println(texto);
            archivo.close();
            
        } catch (Exception e) {
            System.out.println(e);
            
            
            
        }
        
    }

    
}
