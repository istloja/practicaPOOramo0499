/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_de_datos;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ISTLOJA1
 */
class conexion_Basica {

    public void leer(String usuario, String clave) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/persona?characterEncoding=latin1&useConfigs=maxPerformance", usuario, clave);
            System.out.println(conexion.getCatalog());
            Statement variable = conexion.createStatement();
            //ponemos las consultas 
            ResultSet result = variable.executeQuery("Select * from persona");
            while(result.next()) {
                System.out.println(result.getString("nombre")+result.getString("apellido"));
            }
        } catch (Exception e) {
            System.out.println("se produjo un eror en" + e);
        }

    }

    public static void main(String[] args) {
        conexion_Basica obj = new conexion_Basica();
        obj.leer("Ander", "1234");

    }
}
