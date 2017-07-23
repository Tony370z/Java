/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoporreferencia;

/**
 *
 * @author Tony
 */
public class MetodoPorReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String referencia = "Hola";
        referencia = cambiar("chao");
        System.out.println(referencia);

    }
        public static String cambiar(String ref){
            return ref;
        }
    
}
