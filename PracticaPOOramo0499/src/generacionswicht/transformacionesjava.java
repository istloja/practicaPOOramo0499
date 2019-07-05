/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generacionswicht;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA1
 */
public class transformacionesjava {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int km;
        int mk;
        int Mm;
        int mM;
        int Pm;
        int mP;
        double Res;
        System.out.println("ingrese 1 trasformar de kilómetros - metro ");
        System.out.println("ingrese 2 trasformar de metros a kilometros");
        System.out.println("ingrese 3 trasformar de millas a metros ");
        System.out.println("ingrese 4 trasformar de  metros a millas");
        System.out.println("ingrese 5 trasformar de  pies  a metros ");
        System.out.println("ingrese 6 trasformar de  metros a pies  ");
        int numero1;
        Scanner entrada = new Scanner(System.in);
        numero1 = entrada.nextInt();

        switch (numero1) {
            case 1:
                System.out.println("trasformar de kilómetros - metros ");
                System.out.println("Ingrese los kilometros");
                km = leer.nextInt();
                Res = km * 1 * 1000;
                System.out.println("El resultado es: " + Res + " metros");
                break;
            case 2:
                System.out.println("trasformar de metros a kilometros");
                System.out.println("Ingrese los metros");
                mk = leer.nextInt();
                Res = mk * 1000 * 1;
                System.out.println("El resultado es: " + Res + " kilometros");
                break;
            case 3:
                System.out.println("trasformar de millas a metros");
                System.out.println("Ingrese los millas");
                Mm = leer.nextInt();
                Res = Mm * 1 / 0.00062137;
                System.out.println("El resultado es: " + Res + " metros");

            case 4:
                System.out.println(" trasformar de  metros a millas");
                System.out.println("Ingrese los metros");
                mM = leer.nextInt();
                Res = mM * 1 * 0.00062137;
                System.out.println("El resultado es: " + Res + " millas");
                break;
            case 5:
                System.out.println("trasformar de  pies  a metros");
                System.out.println("Ingrese los pies");
                Pm = leer.nextInt();
                Res = Pm * 1 / 3.2808;
                System.out.println("El resultado es: " + Res + " metros");
                break;
            case 6:
                System.out.println("trasformar de  metros a pies ");
                System.out.println("Ingrese los metros");
                mP = leer.nextInt();
                Res = mP * 1 * 3.2808;
                System.out.println("El resultado es: " + Res + " pies");
                break;

        }
    }
}

    

