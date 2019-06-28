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
public class NewClassa34 {

    public static void main(String[] args) {
        //pedirHoras();
        calcularSalario();
    }
//Metodo que pide las horas

    public static int pedirHoras() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce las horas que ha trabajado: ");
        int horas = teclado.nextInt();
        return horas;
    } //CIERRE DEL METODO pedirHoras

    //Metodo que calcula las horas
    public static void calcularSalario() {
        int resultado = 0, horasExtra = 0; //La variable resultado guardara el valor final
        // La variable horasExtra guardara las horas extra
        final int horasNormales = 35;	//Esta constante guarda las horasNormales, esta variable se 
        int hora = pedirHoras();
        //usara solo en el caso de que hayan horas extra.
        if (hora <= 35) {			//Si se han realizado las horas normales o menos...
            resultado = hora * 15;		//El resultado es esa operacion
            System.out.println(resultado);
        } else {		//Si no...habran horas extras, por lo que...
            horasExtra = (hora - 35) * 22;		//Se calculan las horas extra y su precio
            resultado = horasNormales * 15 + horasExtra;	//Se calcula el resultado directamente
            System.out.println(resultado);
        }
        //return resultado;
    }	//CIERRE DEL METODO calcularSalario

    public static void mostrarResultado() {

    }
}
