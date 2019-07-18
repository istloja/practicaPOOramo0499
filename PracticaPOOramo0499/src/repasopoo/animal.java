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
public class animal {

    String nombre;
    private int edad;
    private String color;
    private double altura;
    private double peso;
    
    
    public animal(){
    

    
    }

    public animal(String nombre, int edad, String color, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void nombreAnimal() {
        System.out.println("hola soy un animal");

    }

    public String informacionAnimal() {
        String informacion = nombre +" "+ color+" "+edad+" "+altura+" "+peso;
        return informacion;

    }
     public static void main(String[] args) {
        animal objeto=new animal();
        objeto.setNombre(" perro ");
        objeto.setEdad(10);
        objeto.setPeso(15);
        objeto.setPeso(15);
        objeto.setColor(" blanco ");
         System.out.println(objeto.informacionAnimal());
         animal objeto1=new animal("gato",5,"negro",8,10);
         System.out.println(objeto1.informacionAnimal());
       
    }

    
    }
    
    

