/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13a2;

/**
 *
 * @author Usuario iTC
 */
public class NewClassa2 {

    //Declaro variables de campo

    int total, kms, carga;
    int totalcarga;
    int contador;
    double promedio;

    public void ingresaConsumo() {//Metodo que se encarga de leer los datos

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca los Kms o -1 para terminar :");//Solicito ingreso de kms recorridos

        kms = entrada.nextInt();

        System.out.println("Introduzca la carga de combustible :");//Solicito la cantidad de combustible

        carga = entrada.nextInt();

        while (kms != -1) {

            total = total + kms;
            totalcarga = totalcarga + carga;
            contador = contador + 1;

            System.out.println("Introduzca los Kms o -1 para terminar :");

            kms = entrada.nextInt();

            System.out.println("Introduzca la carga de combustible :");

            carga = entrada.nextInt();

        }

    }

    public void muestraPromedio() {//Metodo que imprime el resultado

        if (contador != 0) {

            promedio = (double) total / totalcarga;

            System.out.printf("Hizo un total de %d paradas, con %d Kms recorridos\n", contador, total);
            System.out.printf("\nCargó un total de %d Lts, y el consumo promedio es %.2f Kms/L", totalcarga, promedio);

        } else {
            System.out.println("No introdujo ningun dato");
        }

    }
}
