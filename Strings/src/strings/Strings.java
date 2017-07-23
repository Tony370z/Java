/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.*;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Tony
 */
public class Strings {
    
    static String x = "x", y = "y", num = null;
    static String primerEjemplo = "hola";
    static String segundoEjemplo = null;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        x.concat("y");
        y = x.concat("y");
        
        num = "123";
        Integer numero = Integer.valueOf(num);
        
        StringBuilder reverso = new StringBuilder(y);
        reverso.reverse();
        
        segundoEjemplo = primerEjemplo.substring(0, 2) + "l" + "a";
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(primerEjemplo);
        System.out.println(segundoEjemplo+ "2");
        System.out.println(primerEjemplo == segundoEjemplo);
        System.out.println(primerEjemplo.equals(segundoEjemplo));
        String letras = "";
        
        for (char a = 'a'; a<= 'z'; a++){
            letras += a;
            System.out.print(letras + " ");
        }
        System.out.println(letras.length());
        
        System.out.println(" Hello World!!!".trim());
        
        List<String> birds = new ArrayList<>();
            birds.add("hawk"); // [hawk]
            birds.add(1, "robin"); // [hawk, robin]
            birds.add(0, "blue jay"); // [blue jay, hawk, robin]
            birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
            System.out.println(birds); // [blue jay, cardinal, hawk, robin]
        
        ArrayList<Integer> list = new ArrayList<>();
            list.add(numero);
            System.out.println(list);
             
            System.out.println(StringUtils.isNumeric(num));
    }
    
}
