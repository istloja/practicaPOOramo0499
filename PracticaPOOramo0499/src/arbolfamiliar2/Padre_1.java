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
class Padre extends persona {
    Madre esposa;
   Abuelo Papá;
   Abuela Mamá;
   Hijo hijo;
   Hija hija;

    public Madre getEsposa() {
        return esposa;
    }

    public void setEsposa(Madre esposa) {
        this.esposa = esposa;
    }

    public Abuelo getPapá() {
        return Papá;
    }

    public void setPapá(Abuelo Papá) {
        this.Papá = Papá;
    }

    public Abuela getMamá() {
        return Mamá;
    }

    public void setSuegra(Abuela suegra) {
        this.Mamá = Mamá;
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
    public Padre(){
    setNombres("julio enrrique");
    setApellidos("guzman cabrer");
    setEdad(44);
    
}
}
    


    

