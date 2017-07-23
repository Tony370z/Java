/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliformismo3;

/**
 *
 * @author Tony
 */
public class Poliformismo3 implements Padre{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Poliformismo3 objeto = new Poliformismo3();
        
        Padre padre = objeto;
        
        Poliformismo4 nuevoObjeto = (Poliformismo4) padre;
    }
    
}

class Poliformismo4 implements Padre{
    
}

abstract interface Padre {
    
}
