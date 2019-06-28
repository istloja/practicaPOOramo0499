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
public class JavaApplication13a2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
    private int numeroEmpleado;
    private int numero;
    private float salarioEmpleado = 0;
    private Object entrada;

    public void Recibe() { // Abre metodo Recibe

        System.out.println("\nIntroduzca un entero positivo si quiere introducir datos para un proximo empleado o -1 para terminar:");
        numeroEmpleado = entrada.nextInt();

        while (-1 != numeroEmpleado) { // Abre while

            System.out.printf("\nPor favor introduzca que articulo ha vendido el empleado %d (1, 2, 3, 4 ) o -1 para terminar: ", numeroEmpleado);
            numero = entrada.nextInt();

            while (-1 != numero) { // Abre while anidado

                if (1 == numero) {
                    salarioEmpleado += 239.99;
                }
                if (2 == numero) {
                    salarioEmpleado += 129.75;
                }
                if (3 == numero) {
                    salarioEmpleado += 99.95;
                }
                if (4 == numero) {
                    salarioEmpleado += 350.89;
                }

                System.out.printf("\nPor favor introduzca que articulo ha vendido el empleado %d (1, 2, 3, 4 ) o -1 para terminar: ", numeroEmpleado);
                numero = entrada.nextInt();
            } // Cierra while anidado

            System.out.printf("\nEl salario total del empleado %d es %.2f\n", numeroEmpleado, 200 + Retorna(salarioEmpleado));

            System.out.println("\nIntroduzca un entero positivo si quiere introducir datos para un proximo empleado o -1 para terminar: ");
            numeroEmpleado = entrada.nextInt();
        } // Cierra while
    } // Cierra metodo Recibe

    public double Retorna(double salario) { // Abre metodo Retorna
        return salario * 9 / 100;
    } // Cierra metodo Retorna
} // Cierra clase Deitel_4_19
// TODO code application logic here

