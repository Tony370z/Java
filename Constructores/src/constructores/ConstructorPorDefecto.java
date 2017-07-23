/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Tony
 */
public class ConstructorPorDefecto {
    
    static String hola = null;

    public ConstructorPorDefecto() {
    }
    
    public ConstructorPorDefecto(String nuevoSaludo) {
        this.hola = nuevoSaludo;
    }
    
    static void saludo(){
        System.out.println(hola);
    }
}
