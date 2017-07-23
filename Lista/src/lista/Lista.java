/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tony
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> lista = new ArrayList<>(1);
        lista.add("Tony");
        lista.add("Liliana");
        lista.add("Yasmin");
        System.out.println(lista.get(2));
    }
    
}
