/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charat;

import java.util.ArrayList;

/**
 *
 * @author Tony
 */
public class CharAt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        String hola = "hola"; 
//        System.out.println(hola.charAt(4));// StringIndexOutOfBoundsException

//        Integer array[] = {1,2};
//        System.out.println(array[3]);// java.lang.ArrayIndexOutOfBoundsException

//        ArrayList<String> x = new ArrayList<>();
//        System.out.println(x.get(0));// java.lang.IndexOutOfBoundsException

        String x = "hola";
        int unicode = (int) 'H';
        System.out.println(x.indexOf(unicode));
        
    }
    
}
