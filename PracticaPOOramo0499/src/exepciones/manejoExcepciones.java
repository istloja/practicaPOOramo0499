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
public class manejoExcepciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el numero");
        int numero = 0;
        try {//ponemos el codigo que queremos proteger
            numero = entrada.nextInt();
        } catch (Exception e) {//ponemos la excepcion a capturar
            System.out.println("se genero el error" + e);
            System.out.println("por favor ingrese un numero correcto");
        }
        System.out.println("el numero ingresado es" + numero);
        try {
            int resultado = numero / 0;
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("nose puede dividir para cero aprenda matematicas ");

        }
    }

}
