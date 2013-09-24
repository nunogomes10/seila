/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.io.Serializable;

/**
 *
 * @author Nuno
 */
public class Liga implements Serializable {
    
    private int id;
    private String nome;
    private int idDesporto;

    public Liga(int id, String nome, int idDesporto) {
        this.id = id;
        this.nome = nome;
        this.idDesporto = idDesporto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDesporto() {
        return idDesporto;
    }

    public void setIdDesporto(int idDesporto) {
        this.idDesporto = idDesporto;
    }
    
    public Liga() {
        this.nome = "";
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
