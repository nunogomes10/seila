/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.Equipa;
import Negocio.Liga;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;

/**
 *
 * @author Nuno
 */
public class Equipas {
    
    
      public static TreeMap<String,Equipa> getEquipas() throws SQLException {
       
        TreeMap<String,Equipa> equipas;
        equipas = new TreeMap<>();

        String query = "select * from Equipa";
        Connection con = DBconection.novaConecao();

        Statement stmt = con.createStatement(); 
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
        
            Equipa eq = new Equipa(Integer.parseInt(rs.getString(1)),rs.getString(2));
            equipas.put(eq.getNome(), eq);
            
        } 
        DBconection.fecharconecao(con);
        
        return equipas;     
        } 
         
    
    
    
    
    
}
