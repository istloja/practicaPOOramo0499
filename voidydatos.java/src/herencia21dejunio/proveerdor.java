/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia21dejunio;

/**
 *
 * @author ISTLOJA1
 */
public class proveerdor {
    private String tipodeproductos;
    private int cobrar;
    private int cantidadeproductos;
   
    public void provedordeproductos(){
        System.out.println("hola soy el proveedor");
    }
    public String getTipodeproductos() {
        return tipodeproductos;
    }

    public void setTipodeproductos(String tipodeproductos) {
        this.tipodeproductos = tipodeproductos;
    }

    public int getCobrar() {
        return cobrar;
    }

    public void setCobrar(int cobrar) {
        this.cobrar = cobrar;
    }

    public int getCantidadeproductos() {
        return cantidadeproductos;
    }

    public void setCantidadeproductos(int cantidadeproductos) {
        this.cantidadeproductos = cantidadeproductos;
    }

    public void saludar() {
        System.out.println("hola soy un proveedor");

    }

    public void test() {
        saludar();
        super.saludar();
    }

    public static void main(String[] args) {
        proveerdor objeto = new proveerdor();
//        objeto.provedordeproductos();
        objeto.saludar();
    
            }
}
    
    
    
    
    

