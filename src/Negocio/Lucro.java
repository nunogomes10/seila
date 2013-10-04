/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Nuno
 */
public class Lucro {
    
    private int id;
    private float valor;
    private char tipo;
    private int idjogo;

    public Lucro(int id, float valor, char tipo, int idjogo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
        this.idjogo = idjogo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getIdjogo() {
        return idjogo;
    }

    public void setIdjogo(int idjogo) {
        this.idjogo = idjogo;
    }
    
    
    
}
