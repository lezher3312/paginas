/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LORENZO
 */
public class conexionSQL {
    Connection conectar=null;    
    
    public Connection conexion(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar= DriverManager.getConnection("jdbc:mysql://localhost/proyecto","root","");    
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error de conexion "+e.getMessage());
              
        }
        
        return conectar;
        
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class conectar {

        public conectar() {
        }
    }

}
