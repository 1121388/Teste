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
public class Menu {

    void ShowMenu() {
        System.out.println("Registar despesa (s/n)?\n");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i == 1) {
            RegistarDespesasUI UIReg = new RegistarDespesasUI();
            UIReg.PedeDados();
        }
    }
    
}
