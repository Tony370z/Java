/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliformismo4;

/**
 *
 * @author Tony
 */
public class Poliformismo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Poliformismo4 objeto = new Poliformismo4();
        //Poliformismo5 nuevoObjeto = (Poliformismo5) objeto;//Incomptabible por ende compiler error
        
        Poliformismo5 x = new Poliformismo5();
        Poliformismo6 y = (Poliformismo6) x;
        
    }
    
}

class Poliformismo5 {

}
abstract interface Poliformismo6{
    
}