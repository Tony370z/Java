/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilder1;

/**
 *
 * @author Tony
 */
public class StringBuilder1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StringBuilder sb1 = new StringBuilder(3);
        
        System.out.println(sb1.capacity());
        
        sb1.append("anim");
        
        System.out.println("Longitud: " + sb1.length());
        System.out.println("capidad final: " + sb1.capacity());
        
        sb1.append("als");
        
        System.out.println("Longitud: " + sb1.length());
        System.out.println("capidad final: " + sb1.capacity());
    }
    
}
