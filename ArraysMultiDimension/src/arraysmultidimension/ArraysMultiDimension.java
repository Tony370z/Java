/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysmultidimension;

import java.util.ArrayList;

/**
 *
 * @author Tony
 */
public class ArraysMultiDimension {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] uniDimensional = new String[2];
        String[][] biDimensional = new String[2][];
        String[][][] triDimensional = new String[2][][];
        String[][][][] cuartaDimension = new String[2][][][];
        
        String letras = "A B C D E";
        
        ArrayList<String> lista = new ArrayList<>();
        
        System.out.println(uniDimensional.length + " Soy un Array");
        System.out.println(lista.size() + " Soy un ArrayList");
        System.out.println(letras.length() + " Soy un String");
    }
    
}
