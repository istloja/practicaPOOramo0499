/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herenciaander;

/**
 *
 * @author ISTLOJAV
 */
public class Cuadrado extends Figurabidimensional {
    public double calcularArea(double lado){
        return Math.pow(lado,2);
    }
    public double calcularPerimetro(double lado){
        return lado+lado+lado+lado;
    }
}
