/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysyconstructores;

import java.util.*;

/**
 *
 * @author Tony
 */
public class ArraysYConstructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Constructor> lista = new ArrayList<>();
        lista.add(new Constructor("Tony", "Morantes", 24));
        lista.add(new Constructor("Liliana", "Bejarano", 41));
        
        for (Constructor muestra : lista){
            System.out.println(muestra.getNombre() +
                    " " + muestra.getApellido() +
                    " " + muestra.getEdad());
        }
    }
    
}
