/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces2;

/**
 *
 * @author Tony
 */
public class Interfaces2 implements interfaz, interfaz2{

    public Interfaces2() {
        regard();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Interfaces2 mensaje = new Interfaces2();
    }

    @Override
    public void name() {
    }
    
    @Override
    public String name(String x) {
        return null;
    }
    
}

interface interfaz{
    public static final int MIXUMUM = 2;
    
    public abstract void name();
}

interface interfaz2{
    public abstract String name(String chain);
    
    public default void regard(){
        System.out.println("Hello!");
    }
    
    public default String message(){
        return "Hey!!";
    }
}
