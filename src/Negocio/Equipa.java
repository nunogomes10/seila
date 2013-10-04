/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Nuno
 */
public class Equipa {
    
    private int id;
    private String Nome;

    public Equipa(int id, String Nome) {
        this.id = id;
        this.Nome = Nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    
    
}
