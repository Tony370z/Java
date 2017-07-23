/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobox;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tony
 */
public class AutoBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String args []) {
        // TODO code application logic here
        
        List<Integer> wrapper = new ArrayList<>();
        
        int age = 3;
        
        switch(age){
            case 1: System.out.println("Tengo 1 año"); break;
            case 2:
        }
        
        try{
            throw new ArithmeticException();
        }catch(RuntimeException e){
            
        }
        
        String letter = "abcde";
        letter = letter.charAt(2);
        System.out.println(letter);
    }
    
}
