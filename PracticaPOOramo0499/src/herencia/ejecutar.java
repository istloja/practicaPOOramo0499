/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA1
 */
public class ejecutar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 1 para circulo 2 para"
                + "triangulo y 3 para cuadrado");
        int valor = entrada.nextInt();
        switch (valor) {
            case 1:
                System.out.println("ingrese el radio del  circulo");
                double radio = entrada.nextDouble();
                circulo objeto = new circulo();
                double areacirculo = objeto.calcularArea(radio);
                double perimetrocirculo = objeto.calcularPerimetro(radio);
                System.out.println("este es el area: " + areacirculo + " y el perimetro es: " + perimetrocirculo);
                break;//este va despues de case 
            case 2:
                System.out.println("ingrese la base y la altura");
                double base = entrada.nextDouble();
                double altura=entrada.nextDouble();
                triangulo objeto1 = new triangulo();
                double areatriangulo = objeto1.calcularArea(base,altura);
                System.out.println("el area es: "+areatriangulo);
                System.out.println("ingrese los lados");
                double lado1=entrada.nextDouble();
                double lado2=entrada.nextDouble();
                double lado3=entrada.nextDouble();
                double perimetrotriangulo = objeto1.calcularPerimetro(lado1,lado2,lado3);
                System.out.println("el perimetro es: "+ perimetrotriangulo);
                break;
            case 3:
                System.out.println("ingrese el radio del  cuadrado");
                double lado = entrada.nextDouble();
                cuadrado objeto2 = new cuadrado();
                double areacuadrado = objeto2.calcularArea(lado);
                double perimetrocuadrado = objeto2.calcularPerimetro(lado);
                System.out.println("este es el area: " + areacuadrado + " y el perimetro es: " + perimetrocuadrado);
                break;
            default:
                System.out.println(" ingrese un numero correcto para poder saber que fugura presenta");
                break;

        }
    }

}
