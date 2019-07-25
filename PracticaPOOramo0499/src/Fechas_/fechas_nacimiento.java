/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechas_;

import static java.lang.System.out;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.M;

/**
 *
 * @author ISTLOJA1
 */
public class fechas_nacimiento {

    private static Object entrada;

    public static void main(String[] args) {
        Date fechaactual = new Date();
        System.out.println(fechaactual);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy");//para pasar de un
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la fecha en el formato dd/MM/yyy");
        String fecha = entrada.nextLine();
        Date fechanacimineto = null;
        try {
            fechanacimineto = formato.parse("2000/08/27"); //pasando del string a un fecha
            System.out.println(fechanacimineto);
//           System.out.println(fechanacimineto.before(fechaactual));
        } catch (Exception e) {
            System.out.println(e);

        }
        GregorianCalendar calendario = new GregorianCalendar();//permitir manejar fechas
        calendario.setTime(fechaactual);
        int anioactual = calendario.get(GregorianCalendar.YEAR);
        int mesactual = calendario.get(GregorianCalendar.MONTH) + 1;
        int diactual = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("anioactual" + anioactual + "mes" + mesactual + "dia" + diactual);
        GregorianCalendar calendario1 = new GregorianCalendar();
        calendario1.setTime(fechanacimineto);
        int anionac = calendario.get(GregorianCalendar.YEAR);
        int mesnac = calendario.get(GregorianCalendar.MONTH) + 1;
        int dianac = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        int meses;
        int año;
        int dia;
        año = anioactual - anionac;
        if (anionac<anioactual);
        else{
        
            meses = mesactual - mesnac;
        if (mesnac<mesactual);
       else{
        
            dia = diactual - dianac;
        if (dianac<diactual);
        else{
        System.out.println("tiene" + año + "años" + meses + "meses" + dia + "dia");  }
        }
            
        
        
       
        
    


        
        
