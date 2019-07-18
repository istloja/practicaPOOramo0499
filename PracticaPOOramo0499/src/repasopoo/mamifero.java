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
public class mamifero extends animal {
    private int tiempodegestacion;
    private boolean pelaje;
    public mamifero() {
    
    }

    public mamifero(int tiempodegestacion, boolean pelaje, String nombre, int edad, String color, double altura, double peso) {
        super(nombre, edad, color, altura, peso);
        this.tiempodegestacion = tiempodegestacion;
        this.pelaje = pelaje;
    }
    

    
    public int getTiempodegestacion() {
        return tiempodegestacion;
    }

    public void setTiempodegestacion(int tiempodegestacion) {
        this.tiempodegestacion = tiempodegestacion;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
        
    }
    
    
        
    }
    
    

