/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Persistencia.Desportos;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nunogomes
 */
public class NegDesportos {
    
    public static ArrayList<Desporto> todosDesportos() throws SQLException {
    
       
        return Desportos.getDesportos();
    }
    
    public static void inserirDesporto (String desporto) throws SQLException {
    
        Desportos.insertDesporto(desporto);
    }
    
    public static void inserirLiga (int idDesp, String liga) throws SQLException {
    
        Desportos.insertLiga(idDesp, liga);
    }
    
    
}
