/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orridemethod;

/**
 *
 * @author Tony
 */
public class OrrideMethod extends Metodos{

    public static String saludar() {
        return "Chao Mundo";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(saludar());
        
        new Otro().risa();
        new OrrideMethod().risa();
        
        System.out.println(new OrrideMethod().otroSaludo());
        System.out.println(new OrrideMethod().variable);
    }
    
}
