package projectoteste;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul.Lima
 */
public class Cliente {
    int pCodigo;
    String pNome;
    
    Cliente(int Cod, String Nom) {
        pCodigo = Cod;
        pNome = Nom;
    }
    
    @Override
    public String toString() {
        return pCodigo + ": " + pNome;
    }
}
