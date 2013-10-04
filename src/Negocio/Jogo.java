/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Date;

/**
 *
 * @author Nuno
 */
public class Jogo {
    
    private int id;
    private String equipa1;
    private String equipa2;
    private Date data;
    private int idliga;

    public Jogo(int id, String equipa1, String equipa2, Date data, int idliga) {
        this.id = id;
        this.equipa1 = equipa1;
        this.equipa2 = equipa2;
        this.data = data;
        this.idliga = idliga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipa1() {
        return equipa1;
    }

    public void setEquipa1(String equipa1) {
        this.equipa1 = equipa1;
    }

    public String getEquipa2() {
        return equipa2;
    }

    public void setEquipa2(String equipa2) {
        this.equipa2 = equipa2;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdliga() {
        return idliga;
    }

    public void setIdliga(int idliga) {
        this.idliga = idliga;
    }
    
    
    
}
