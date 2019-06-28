/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;



/**
 *
 * @author ISTLOJA1
 */
public class triangulo extends figurabidimencional {

    static double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }

    static double calcularPerimetro(double lado1, double lado2, double lado3) {
        
        return lado1+lado2+lado3;
    }

   
}
