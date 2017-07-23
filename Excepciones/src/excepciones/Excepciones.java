/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Tony
 */
public class Excepciones {
    
    static int numero = 0;
    static String string;
    
    static Object variable = new Integer(numero);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        string = (String) variable;

    }
    
}
