/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platypus;

/**
 *
 * @author Tony
 */
public class Platypus extends Mammal{

    /**
     * @param args the command line arguments
     */
    
    public Platypus() {
        super(0);
        System.out.println("Platypus");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        new Mammal(5);
    }
    
}
