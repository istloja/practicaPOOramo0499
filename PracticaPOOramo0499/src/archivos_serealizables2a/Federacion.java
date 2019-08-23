/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_serealizables2a;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ISTLOJA1
 */
public class Federacion  implements Serializable{
    String nombre;
    String pais;
    int numEquipos;

    public Federacion() {
    }

    public Federacion(String nombre, String pais, int numEquipos) {
        this.nombre = nombre;
        this.pais = pais;
        this.numEquipos = numEquipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }
    
    
    public void escribirLista(String direccion, List<Federacion> Lista) {
        
        
        
    }
    
}
