/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transformaciones_de_medidas;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA1
 */
public class generaciones {
    public static void main(String[] args) {
        System.out.println(" ingresa 1 si naciste de (1930-1948)");
        System.out.println(" ingresa 2 si nacistes de (1949-1968) ");
        System.out.println(" ingresa 3 si nacistes de (1969-1980)");
        System.out.println(" ingresa 4 si nacistes de (1981-1993)");
        System.out.println(" inresa 5 si nacistes de (1994-2010)");
        int numero1;
        Scanner entrada = new Scanner(System.in);
        numero1 = entrada.nextInt();

        switch (numero1) {
            case 1:
                System.out.println("Niños de la postguerra");
            case 2:
                System.out.println("baby boom");
            case 3:
                System.out.println("Generación X");
            case 4:
                System.out.println("Millennials");
            case 5:
                System.out.println("Generación Z ");

        }

    }

}

    

