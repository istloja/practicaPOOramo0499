/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia21dejunio;

;

/**
 *
 * @author ISTLOJA1
 */
public class cliente extends Persona {

    private int ncompras;
    private String tipodepagos;

    public void comprar() {
        System.out.println("la compra se realizo con exito");

    }

    public int getNcompras() {
        return ncompras;
    }

    public void setNcompras(int ncompras) {
        this.ncompras = ncompras;
    }

    public String getTipodepagos() {
        return tipodepagos;
    }

    public void setTipodepagos(String tipodepagos) {
        this.tipodepagos = tipodepagos;
    }

    @Override//significa que estoy sobreescribiendo
    public void saludar() {
        System.out.println("hola soy un cliente");

    }

    public void test() {
        saludar();
        super.saludar();//llama al metodo de  la clase
    }

    public static void main(String[] args) {
        cliente objeto = new cliente();
//        objeto.saludar();
        objeto.comprar();

    }

}
