/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serealizables;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author ISTLOJA1
 */
class ConexionBasica {
     public void Leer(String usuario, String password)  {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection basedatos = DriverManager.getConnection("jdbc:mysql://localhost/persona?characterEncoding=latin1", usuario, password);
            System.out.println(basedatos.getCatalog());
            Statement b=(Statement) basedatos.createStatement();
            ResultSet resultado=b.executeQuery("Select*from persona");//vamos a poner consulta
            while(resultado.next()){
                System.out.println(resultado.getString("nombre")+resultado.getString("apellido"));
            }
            
        } catch (Exception e) {
            System.out.println(" error producido en: " + e);
        }

    }

    public static void main(String[] args) {
        ConexionBasica objeto1 = new ConexionBasica();
        objeto1.Leer("nombre", "wenas123");
    }

}

    
   
    
    


    
}
