/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13a2;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class NewClasseed {

    Scanner entrada = new Scanner(System.in);
    private String mensaje;
    private int mayor;
    private int segundo;

    public NewClasseed(String cadena) { // Abre constructor         
        mensaje = cadena;
    } // Cierra constructor         

//METODO RECIBE           
    public void Recibe() { // Abre el metodo recibe       
        int numero;
        int contador = 1;

        System.out.printf("\nEste es su mensaje: %s\n", mensaje);

        System.out.printf("\nEscriba por favor el numero %d: ", contador++);
        mayor = entrada.nextInt();

        System.out.printf("\nEscriba por favor el numero %d: ", contador++);
        segundo = entrada.nextInt();

        if (segundo > mayor) {
            Intercambia(segundo, mayor);
        }

        while (10 >= contador) { // Abre while         

            System.out.printf("\nEscriba por favor el numero %d: ", contador++);
            numero = entrada.nextInt();

            if (numero > mayor) {
                Intercambia(numero, mayor);
            }

        } // Cierra while         

        System.out.printf("\nEl numero mayor es: %d y el siguiente es %d\n", mayor, segundo);

    } // Cierra el metodo recibe       

//////////////////////////////////////////////////////////////////////////            
//METODO INTERCAMBIA           
////////////////////////////////////////////////////////////////////////////            
    public void Intercambia(int x, int y) { // Abre metodo intercambia        
        mayor = x;
        segundo = y;
    } // Cierra metodo intercambia        

} // Cierra clase Deitel_4_23       

