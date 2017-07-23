/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostatic;

/**
 *
 * @author Tony
 */
public class Estatica {
    
    public static String variableStatica = "Soy la variable estatica";
    public String variableNoStatica = "Soy la variable no estatica";
    
    public static void soyStatic(){
        System.out.println("Soy Static");
        System.out.println(variableStatica);
        //System.out.println(variableNoStatica); error por no ser static
        //noSoyStatic(); igual que la linea de arriba
    }
    
    public void noSoyStatic(){
        System.out.println("No soy Static");
        System.out.println(variableNoStatica);
        System.out.println(variableStatica);
        soyStatic();
    }
    
}
