/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionpropagation;

/**
 *
 * @author Tony
 */
public class ExceptionPropagation {
    
    public static void metodo1(){
        int x = 50/0;
        System.err.println("Inicio de la propagacion");
    }
    
    public static void metodo2(){
        metodo1();
        System.err.println("La excepcion se propaga para este otro metodo");
    }
    
    public static void metodo3(){
        try {
            metodo2();
            System.err.println("finalmente se propaga hasta donde sea manejada");
        } catch (Exception e) {
            System.err.println("Excepcion manejada");
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        metodo3();
    }
    
}