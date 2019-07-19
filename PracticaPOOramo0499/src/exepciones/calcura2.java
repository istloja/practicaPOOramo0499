/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA1
 */
public class calcura2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 1 para suma");
        System.out.println("ingrese 2 para resta");
        System.out.println("ingrese 3 para multiplicacion");
        System.out.println("ingrese 4 para division");
        try {
            int valor = entrada.nextInt();
            System.out.println("el valor ingresado es: " + valor);
            switch (valor) {
                case 1:
                    System.out.println("ingresaste a la suma");
                    System.out.println("ingrese los numeros que desee sumar");
                    int a = 0;
                    int b = 0;
                    try {
                        b = entrada.nextInt();
                        a = entrada.nextInt();
                        System.out.println("los numeros ingresados son: " + b + " y " + a);
                    } catch (Exception e) {
                        System.out.println("se genero un error " + a);
                        System.out.println("Por favor ingrese un numero correcto");
                    }
                    try {
                        int suma = b + a;
                        System.out.println("la suma de los dos numero es: " + suma);
                    } catch (Exception e) {
                        System.out.println("se genero un error " + a);
                        System.out.println("porfavor ingrese los numeros correctamente");
                    }
                    break;
                case 2:
                    System.out.println("ingresaste a la resta");
                    System.out.println("ingrese los numeros que desee restar");
                    int d = 0;
                    int e = 0;
                    try {
                        d = entrada.nextInt();
                        e = entrada.nextInt();
                        System.out.println("los numeros ingresados son: " + d + " y " + e);
                    } catch (Exception c) {
                        System.out.println("se genero un error " + 1);
                        System.out.println("Por favor ingrese un numero correcto");
                    }
                    try {
                        int resta = d - e;
                        System.out.println("la suma de los dos numero es: " + resta);
                    } catch (Exception c) {
                        System.out.println("se genero un error " + 1);
                        System.out.println("porfavor ingrese los numeros correctamente");
                    }
                    break;
                case 3:
                    System.out.println("ingresaste a la multiplicacion");
                    System.out.println("ingrese los numeros que desee multiplicar");
                    int f = 0;
                    int g = 0;
                    try {
                        f = entrada.nextInt();
                        g = entrada.nextInt();
                        System.out.println("los numeros ingresados son: " + f + " y " + g);
                    } catch (Exception c) {
                        System.out.println("se genero un error " + 1);
                        System.out.println("Por favor ingrese un numero correcto");
                    }
                    try {
                        int multiplicacion = f * g;
                        System.out.println("la suma de los dos numero es: " + multiplicacion);
                    } catch (Exception c) {
                        System.out.println("se genero un error " + 1);
                        System.out.println("porfavor ingrese los numeros correctamente");
                    }
                    break;
                case 4:
                    System.out.println("ingresaste a la division");
                    System.out.println("ingrese los numeros que desee dividir");
                    int h = 0;
                    int i = 0;
                    try {
                        h = entrada.nextInt();
                        i = entrada.nextInt();
                        System.out.println("los numeros ingresados son: " + h + " y " + i);
                    } catch (Exception c) {
                        System.out.println("se genero un error " + 1);
                        System.out.println("Por favor ingrese un numero correcto");
                    }
                    try {
                        int division = h / i;
                        System.out.println("la suma de los dos numero es: " + division);
                    } catch (Exception c) {
                        System.out.println("se genero un error " + 1);
                        System.out.println("porfavor ingrese los numeros correctamente");
                    }
                    break;
                default:
                    System.out.println("ingrese un numero correcto:");
                    break;

            }
        } catch (Exception a) {
            System.out.println("se produjo un error " + a);
            System.out.println("porfavor ingrese los numeros correctamente");
        }
    }
}
