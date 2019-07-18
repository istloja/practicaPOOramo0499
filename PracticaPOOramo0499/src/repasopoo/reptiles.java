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
public class reptiles extends animal {
    private boolean searrastran;
    private boolean sondesangrefria;
    private String huevos;
    public reptiles() {
    }

    public reptiles(boolean searrastran, boolean sondesangrefria, String huevos) {
        this.searrastran = searrastran;
        this.sondesangrefria = sondesangrefria;
        this.huevos = huevos;
    }

    public reptiles(boolean searrastran, boolean sondesangrefria, String huevos, String nombre, int edad, String color, double altura, double peso) {
        super(nombre, edad, color, altura, peso);
        this.searrastran = searrastran;
        this.sondesangrefria = sondesangrefria;
        this.huevos = huevos;
    }

    public boolean isSearrastran() {
        return searrastran;
    }

    public void setSearrastran(boolean searrastran) {
        this.searrastran = searrastran;
    }

    public boolean isSondesangrefria() {
        return sondesangrefria;
    }

    public void setSondesangrefria(boolean sondesangrefria) {
        this.sondesangrefria = sondesangrefria;
    }

    public String getHuevos() {
        return huevos;
    }

    public void setHuevos(String huevos) {
        this.huevos = huevos;
    }
   
        
    }
    
    }

   