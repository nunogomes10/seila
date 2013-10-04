/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.Desporto;
import Negocio.Liga;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author nunogomes
 */
public class Desportos {
    
    /**
     *
     * @return
     * @throws SQLException
     */
    public static ArrayList<Desporto> getDesportos() throws SQLException {
    
        String query = "SELECT * from Desportos";
        
        Connection con = DBconection.novaConecao();
        ArrayList<Desporto> desp;
        desp = new ArrayList<>();
        Desporto novoD;   
        
        try (Statement stmt = con.createStatement(); 
             ResultSet rs = stmt.executeQuery(query); ) {
        
              while (rs.next()) { 
            
            String queryLiga = "SELECT * from Liga where idDesporto = '" + rs.getString(1) + "'";
            ArrayList<Liga> liga;
            liga = new ArrayList<>();
            Statement st = con.createStatement();
            ResultSet rss = st.executeQuery(queryLiga);
            
                while (rss.next()) {
                
                    Liga l = new Liga(Integer.parseInt(rss.getString(1)),rss.getString("Nome"),Integer.parseInt(rss.getString(3)));
                    liga.add(l);
                }
            
            novoD = new Desporto(Integer.parseInt(rs.getString(1)),rs.getString("Nome"),liga);
            desp.add(novoD);
            }
        }
        
        DBconection.fecharconecao(con);
        
        return desp;
    }
    
    
    public static void insertDesporto (String desp) throws SQLException {
        
        String query = "insert into Desportos (Nome) values ('"+ desp +"');";
        Connection con = DBconection.novaConecao();
        
        Statement stmt = (Statement) con.createStatement(); 
        stmt.executeUpdate(query);
        
        DBconection.fecharconecao(con);
    
    
    }
    
    
    public static void insertLiga (int idDesp, String liga) throws SQLException {
    
         String query = "insert into Liga (Nome,idDesporto) values ('" + liga + "','"+ idDesp +"')";
         
         Connection con = DBconection.novaConecao();
         Statement stmt = (Statement) con.createStatement(); 
         
         stmt.executeUpdate(query);
         
         DBconection.fecharconecao(con);
    
    
    }

    public static Liga getLigaByString(String liga) throws SQLException {
       
        Liga l;

        String query = "select * from Liga where Nome = '" + liga + "'";
        Connection con = DBconection.novaConecao();

        Statement stmt = con.createStatement(); 
        ResultSet rs = stmt.executeQuery(query);

        rs.next();
        
        l = new Liga(Integer.parseInt(rs.getString(1)),rs.getString("Nome"),Integer.parseInt(rs.getString(3)));

        DBconection.fecharconecao(con);
        
        return l;     
        } 
         
}
