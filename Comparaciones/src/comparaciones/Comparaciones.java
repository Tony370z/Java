/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparaciones;

/**
 *
 * @author Tony
 */
public class Comparaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StringBuilder sb1 = new StringBuilder("comparacion");
        StringBuilder sb2 = new StringBuilder("comparacion");
        //StringBuilder sb2 = sb1;
        String s1 = "comparison";
        String s2 = new String("comparison");
        String s3 = "comparacion";
        
        System.out.println((sb1==sb2));
        System.out.println(sb1.equals(sb2));
        System.out.println((sb1.toString()).equals(sb2.toString()));
        System.out.println((sb1.toString()) == (sb2.toString()));
        
        System.out.println("\n");
        
        System.out.println((sb1.toString()).equals(s3));
        System.out.println((sb1.toString()) == s3);
        System.out.println(sb1.equals(s3));
        System.out.println(sb1.equals(new StringBuilder(s3)));
        
        //System.out.println(sb1 == s3); Error esta forma no es compatible
    }
    
}
