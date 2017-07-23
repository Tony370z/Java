/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings_con_numeros;

import java.util.*;

/**
 *
 * @author Tony
 */
public class Strings_Con_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros = 300, rs = 0;
        String primero = "Hola", segundo = "40";
        
        rs = Integer.parseInt(segundo) + numeros;
        
        System.out.println(rs);
        
        List<Integer> ages = new ArrayList<>();
            ages.add(Integer.parseInt("5"));
            ages.add(Integer.valueOf("6"));
            ages.add(7);
            ages.add(null);
            
        for(int obj: ages){
            System.out.println(obj);
        }
    }
    
}
