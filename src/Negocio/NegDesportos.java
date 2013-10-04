/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Persistencia.Desportos;
import Persistencia.Equipas;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeMap;

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

    public static Liga getLigaByString(String liga) throws SQLException {
        
        return Desportos.getLigaByString(liga);
    }
    
    public static TreeMap<String,Equipa> listaEquipas () throws SQLException {
    
    
        return Equipas.getEquipas();
    }

    
    
}
