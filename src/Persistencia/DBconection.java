/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nunogomes
 */
public class DBconection {
    
    public static Connection novaConecao() {
    
        String url = "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=convertToNull";  
        String username = "root";
        String password = "";
        Connection connection = null;
        
            try {
            System.out.println("Connecting database...");
            connection = (Connection) DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");

            } 
            catch (SQLException e) {
            throw new RuntimeException("Cannot connect the database!", e);
            
            }
        
            return connection;
    
        } 
    
    
    public static void fecharconecao(Connection connection) {
     
        System.out.println("Closing the connection.");
        if (connection != null) 
        try { connection.close(); } catch (SQLException ignore) {}

    }



}
