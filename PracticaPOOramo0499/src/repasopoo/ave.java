/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasopoo;

/**
 *
 * @author ISTLOJA1
 */
public class ave extends animal {
    private int numero_de_huevos ;
    private boolean vuela;
    public ave() {
    
    }

    public ave(int numero_de_huevos, boolean vuela) {
        this.numero_de_huevos = numero_de_huevos;
        this.vuela = vuela;
    }

    public ave(int numero_de_huevos, boolean vuela, String nombre, int edad, String color, double altura, double peso) {
        super(nombre, edad, color, altura, peso);
        this.numero_de_huevos = numero_de_huevos;
        this.vuela = vuela;
    }

    public ave(int numero_de_huevos) {
        this.numero_de_huevos = numero_de_huevos;
    }
    public int getNumero_de_huevos() {
        return numero_de_huevos;
    }

    public void setNumero_de_huevos(int numero_de_huevos) {
        this.numero_de_huevos = numero_de_huevos;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
        
       
    }
    
    
       

       
    }


