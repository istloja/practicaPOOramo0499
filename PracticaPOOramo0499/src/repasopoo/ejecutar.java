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
public class ejecutar {

    public static void main(String[] args) {
        animal objeto = new animal("jirafa", 10, "amarillo", 14, 15);
        ave objetoave = new ave(10, false, "pato", 9, "negro", 9, 2);
        mamifero objeto2 = new mamifero(12, true, "vaca", 3, "blanca", 10, 45);
        anfibios objetoanfibios =new anfibios(4, "rana",5, "verde",6, 7,);
        reptiles objetoreptiles =new reptiles(2, "lagarto",1, 5, "negro",5);
        System.out.println(objeto.informacionAnimal());
        System.out.println(objetoave.informacionAnimal());
        System.out.println(objeto2.informacionAnimal());
        System.out.println(objetoanfibios.informacionAnimal());
        System.out.println(objetoreptiles.informacionAnimal());
        

    }

}
