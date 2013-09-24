/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

/**
 *
 * @author Nuno
 */
public class CarregaTudo {
    
    private TreeMap<Date,ArrayList<Jogo>> jogos; // data para lista de jogos
    private ArrayList<Desporto> desportos;

    
    
    public CarregaTudo(TreeMap<Date, ArrayList<Jogo>> jogos, ArrayList<Desporto> desportos) {
        this.jogos = jogos;
        this.desportos = desportos;
    }
    
    
    public TreeMap<Date, ArrayList<Jogo>> getJogos() {
        return jogos;
    }

    public void setJogos(TreeMap<Date, ArrayList<Jogo>> jogos) {
        this.jogos = jogos;
    }

    public ArrayList<Desporto> getDesportos() {
        return desportos;
    }

    public void setDesportos(ArrayList<Desporto> desportos) {
        this.desportos = desportos;
    }
    
    
    
}
