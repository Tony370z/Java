/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compareto;

/**
 *
 * @author Tony
 */
public class CompareTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str1 = "Hola Mundo";
        String str2 = "Chao Mundo";
        String str3 = new String("Hola Mundo");
        String str4 = "Chao";
        
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(str1));
        System.out.println(str1.compareTo(str2));
        System.out.println(str4.compareTo(str1));
    }
    
}
