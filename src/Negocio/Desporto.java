/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Nuno
 */
public class Desporto implements Serializable {
    
    private int id;
    private String nome;
    private ArrayList<Liga> liga;

    
    public Desporto(int id, String nome, ArrayList<Liga> liga) {
        this.id = id;
        this.nome = nome;
        this.liga = liga;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Liga> getLiga() {
        return liga;
    }

    public void setLiga(ArrayList<Liga> liga) {
        this.liga = liga;
    }
    
  
    


    
}
