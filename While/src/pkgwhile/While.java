/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

/**
 *
 * @author Tony
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x = 0;
        while(++x < 5) { x+=1; }
        String message = x > 5 ? "Greater than" : "Less Than";
        System.out.println(message+","+x);
    }
    
}
