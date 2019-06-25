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
class PromedioConsumo {

    public static void main(String args[]) { // Abre metodo main
        Scanner entrada = new Scanner(System.in);
        double galon = 0;
        double kilometros;

        Deitel_4_17 miObjeto = new Deitel_4_17();

        System.out.println("\nIntroduzca el numero de galones: (-1 para terminar)\n");
        galon = entrada.nextDouble();

        while (-1 != galon) { // Abre while

            System.out.println("\nIntroduzca el numero de kilometros: \n");
            kilometros = entrada.nextDouble();

            PrintStream PrintStream = System.out.printf("\nLos kilometros por galon fueron: %.2f: ", miObjeto.Procesa_Datos(galon, kilometros)); /*printf*/

            System.out.println("\nIntroduzca el numero de galones: (-1 para terminar) \n");
            galon = entrada.nextDouble();
        } // Cierra while
    } // Cierra metodo main
} // Cierra clase UsaDeitel_4_17

