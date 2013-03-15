/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoteste;

import java.util.Scanner;

/**
 *
 * @author Raul.Lima
 */
public class RegistarDespesasUI {

    void PedeDados() {
        RegistarDespesaController Controler = new RegistarDespesaController();
        Scanner scan = new Scanner(System.in);
        System.out.println("Indique o valor: ");
        float Valor = scan.nextFloat();
        System.out.println("Indique a descrição: ");
        String Descricao = scan.next();
        Controler.RegistarDespesa(Valor, Descricao);
        System.out.println("Despesa registada com sucesso");
    }
    
}
