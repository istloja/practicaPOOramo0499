/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolfamiliar2;

/**
 *
 * @author ISTLOJA1
 */
class Madre extends persona{
     Padre esposo;
   Abuelo suegro;
   Abuela suegra;
   Hijo hijo;
   Hija hija;

    public Padre getEsposo() {
        return esposo;
    }

    public void setEsposo(Padre esposo) {
        this.esposo = esposo;
    }

    public Abuelo getSuegro() {
        return suegro;
    }

    public void setSuegro(Abuelo suegro) {
        this.suegro = suegro;
    }

    public Abuela getSuegra() {
        return suegra;
    }

    public void setSuegra(Abuela suegra) {
        this.suegra = suegra;
    }

    public Hijo getHijo() {
        return hijo;
    }

    public void setHijo(Hijo hijo) {
        this.hijo = hijo;
    }

    public Hija getHija() {
        return hija;
    }

    public void setHija(Hija hija) {
        this.hija = hija;
    }
   public Madre(){
    setNombres("maydi florence");
    setApellidos("guzman castillo");
    setEdad(40);
    
}
}
    

