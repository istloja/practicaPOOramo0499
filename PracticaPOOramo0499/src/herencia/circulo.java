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
public class circulo extends FiguraBidimencional {

    static double calcularArea(double radio) {
        return radio*Math.pow(Math.PI,2);
    }

    static double calcularPerimetro(double radio) {
        
        return radio*(2*Math.PI);
    }
}
