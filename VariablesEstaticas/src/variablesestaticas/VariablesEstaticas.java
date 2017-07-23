/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesestaticas;

/**
 *
 * @author Tony
 */
public class VariablesEstaticas {
    
    //private static final String variable; //debe ser iniciada en la linea o
    //                                      en un bloque de codigo estatico
    final String chao;
    
    {
        //variable = "hola"; debe ser estatico el bloque de codigo {}
        chao = "chao";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*static{
            variable = "hola"; Esto no sirve
        }*/
    }
    
}
