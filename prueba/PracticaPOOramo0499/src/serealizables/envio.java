/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serealizables;

/**
 *
 * @author ISTLOJA1
 */
public class envio implements serealizables {
    private String fechaenvio;
    private String direccionenvio;
    private articulo articulo;

    public envio() {
    }

    public envio(String fechaenvio, String direccionenvio, articulo articulo) {
        this.fechaenvio = fechaenvio;
        this.direccionenvio = direccionenvio;
        this.articulo = articulo;
    }

    public String getFechaenvio() {
        return fechaenvio;
    }

    public void setFechaenvio(String fechaenvio) {
        this.fechaenvio = fechaenvio;
    }

    public String getDireccionenvio() {
        return direccionenvio;
    }

    public void setDireccionenvio(String direccionenvio) {
        this.direccionenvio = direccionenvio;
    }

    public articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(articulo articulo) {
        this.articulo = articulo;
    }
    
    
    

   

  