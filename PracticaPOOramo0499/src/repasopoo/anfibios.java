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
public class anfibios extends animal {
    private String viveenelagua;
    private boolean sonvertebrados;
    private int adultosycrias;
    public anfibios(){
    
    }

    public anfibios(String viveenelagua, boolean sonvertebrados, int adultosycrias) {
        this.viveenelagua = viveenelagua;
        this.sonvertebrados = sonvertebrados;
        this.adultosycrias = adultosycrias;
    }

    public anfibios(String viveenelagua, boolean sonvertebrados, int adultosycrias, String nombre, int edad, String color, double altura, double peso) {
        super(nombre, edad, color, altura, peso);
        this.viveenelagua = viveenelagua;
        this.sonvertebrados = sonvertebrados;
        this.adultosycrias = adultosycrias;
    }

    public String getViveenelagua() {
        return viveenelagua;
    }

    public void setViveenelagua(String viveenelagua) {
        this.viveenelagua = viveenelagua;
    }

    public boolean isSonvertebrados() {
        return sonvertebrados;
    }

    public void setSonvertebrados(boolean sonvertebrados) {
        this.sonvertebrados = sonvertebrados;
    }

    public int getAdultosycrias() {
        return adultosycrias;
    }

    public void setAdultosycrias(int adultosycrias) {
        this.adultosycrias = adultosycrias;
       
    }
    
    
}
