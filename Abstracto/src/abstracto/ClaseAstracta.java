/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto;

/**
 *
 * @author Tony
 */
public abstract class ClaseAstracta {

    public ClaseAstracta() {
    }

    private ClaseAstracta numero;

    public ClaseAstracta getNumero() {
        return numero;
    }

    public void setNumero(ClaseAstracta numero) {
        this.numero = numero;
    }
    
    
    
    public abstract void saludar();
    
    public void holaMundo(){
        System.out.println("Hola Mundo");
    }

}
