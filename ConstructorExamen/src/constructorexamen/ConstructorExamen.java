/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorexamen;

class PequeñoConstructor{
    public PequeñoConstructor(int age){
        System.out.println(1);
    }
}

/**
 *
 * @author Tony
 */
public class ConstructorExamen extends PequeñoConstructor{

    public ConstructorExamen() {
        System.out.println(2);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
