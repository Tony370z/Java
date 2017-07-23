/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliformismo6;

/**
 *
 * @author Tony
 */
public class Poliformismo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Object info = "Hola mundo";
        Metodos decir = new Metodos();
        decir.mensaje((String)info);
    }
    
}

class Metodos {
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }
}