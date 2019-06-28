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
public class NewClassentradausuario {

    public static void main(String[] args) {
        final int MIN = -1000;
        final int MAX = +1000;

        int inicio;
        int termina;
        double respuesta;

        System.out.println("Este programa calcula la suma de los cuadrados de enteros.\n"
                + "en un rango entre -1000 y +1000.\n"
                + "Ingresa los límites (0 en los dos límites para terminar)\n"
                + "Límite bajo: ");
        inicio = obten_int();
        System.out.println("Limite alto: ");
        termina = obten_int();

        while (inicio != 0 || termina != 0) {
            if (mal_limites(inicio, termina, MIN, MAX)) {
                System.out.println("Otra vez por favor\n");
            } else {
                respuesta = suma_cuadrados(inicio, termina);
                System.out.println("La suma de los cuadrados de los enteros ");
                System.out.printf("entre %d y %d es %g\n", inicio, termina, respuesta);
            }
            System.out.println("Entra los límites (0 en los dos "
                    + " para terminar)\n");
            System.out.println("Entra los límites (0 en los dos "
                    + " para terminar)\n");
            System.out.println("limite bajo: ");
            inicio = obten_int();
            System.out.println("limite alto: ");
            termina = obten_int();
        }
        System.out.println("Listo.\n");
    }

    public static int obten_int() {
        Scanner scan = new Scanner(System.in);
        int ingreso;

        while ((ingreso = scan.nextInt()) != 1) {
            String cadena = new String(scan.nextLine());
            while ((scan.nextLine()) != "\n") {
                cadena.charAt(ingreso);
            }
            System.out.println(" no es entero.\nFavor entrar un ");
            System.out.println("entero como 25, -178, o 3: ");
        }
        return ingreso;
    }

    public static double suma_cuadrados(int a, int b) {
        double total = 0;
        int i;

        for (i = a; i <= b; i++) {
            total += i * i;
        }
        return total;
    }

    public static boolean mal_limites(int inicio, int termina, int bajo, int alto) {
        boolean no_bueno = false;

        if (inicio > termina) {
            System.out.printf("%d no es menor que %d.\n", inicio, termina);
            no_bueno = true;
        }

        if (inicio < bajo || termina < bajo) {
            System.out.printf("Valores deber ser >= %d.\n", bajo);
            no_bueno = true;
        }

        if (inicio > alto || termina > alto) {
            System.out.printf("Valores deber ser <= %d.\n", alto);
            no_bueno = true;
        }

        return no_bueno;
    }
}


