/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoteste;

/**
 *
 * @author Raul.Lima
 */
public class ProjectoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c = new Cliente(1, "Raul");
        System.out.printf("%s\n", c.toString());
    }
}
