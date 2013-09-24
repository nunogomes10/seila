/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bets;

import Interface.Principal;
import Negocio.Desporto;
import Negocio.NegDesportos;
import Persistencia.Desportos;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Nuno
 */
public class Bets {

    /**
     * @param args the command line arguments
 
    public void guardar(Liga x) {
   
        try {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Ligas.dat"));
                out.writeObject(x);
                out.flush();

        }
        catch(IOException e) {System.out.println(e.getMessage());}
    
    }
    
    public void ler (Liga x) {
          try {
       
           ObjectInputStream in = new ObjectInputStream(new FileInputStream("Ligas.dat"));
           x = (Liga) in.readObject();
           in.close();
       
       }
       catch (IOException e) {System.out.println(e.getMessage());}
       catch (ClassNotFoundException e) {System.out.println(e.getMessage());}
    

    
    }
        */
    
    public static void main(String[] args) throws IOException, SQLException {
        /* TODO code application logic here
        try {
    System.out.println("Loading driver...");
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver loaded!");
} catch (ClassNotFoundException e) {
    throw new RuntimeException("Cannot find the driver in the classpath!", e);
}
        */
         
      Principal nova = new Principal();
      
      nova.setVisible(true); 

    
} }
