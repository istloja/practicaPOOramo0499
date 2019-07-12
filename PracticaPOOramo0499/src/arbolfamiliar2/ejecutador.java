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
public class ejecutador {
     public static void main(String[] args) {
        Hijo hijo = new Hijo();
        Hija hija = new Hija();
        Madre madre = new Madre();
        Padre padre = new Padre();
        Abuelo abuelo = new Abuelo();
        Abuela abuela = new Abuela();
        hijo.setPadre(padre);
        hijo.setMadre(madre);
        hija.setPadre(padre);
        hija.setMadre(madre);
        madre.setHijo(hijo);
        padre.setHijo(hijo);
        madre.setHija(hija);
        padre.setHija(hija);
        madre.setEsposo(padre);
        padre.setEsposa(madre);

        System.out.println("nombre del padre es " + hijo.getPadre().getNombres());
        System.out.println("nombre del hijo de " + madre.getNombres() + " es: " + madre.getHijo().getNombres());
        System.out.println("nombre del hijo de " + padre.getNombres() + " es: " + padre.getHijo().getNombres());
        System.out.println("nombre de la hija de " + madre.getNombres() + " es: " + madre.getHija().getNombres());
        System.out.println("el esposos de " + madre.getNombres() + " es: " + madre.getEsposo().getNombres());

    }
}

    

