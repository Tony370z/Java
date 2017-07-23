/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto3;

/**
 *
 * @author Tony
 */
public class Abstracto3 extends Animal{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void caminar() {
    }
    
}

abstract class Animal{
    public abstract void caminar();
}

class pato extends Animal{

    //Si 2 clases concretas heredan de una abstracta deben implementar sus
    //metodos ajuro ya que se convierten en la "primera" clase concreta
    //aun cuando son 2 las que heredan de una misma clase abstracta
    
    //En cambio si cambiamos la herencia de "Animal" por "Abstracto3" no pasa
    //nada, no tenemos que implementar ni sobre-escribir nada
    @Override
    public void caminar() {
    }
    
}
