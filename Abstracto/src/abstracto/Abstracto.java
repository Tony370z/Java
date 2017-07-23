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
public class Abstracto extends ClaseAstracta{

    @Override
    public void saludar() {
        System.out.println("Te saludo");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Abstracto().saludar();
        
        new Abstracto().holaMundo();
        
        String numero = "123";
        
        Abstracto referencia = new Abstracto();
        referencia = (Abstracto) numero;
        System.out.println();
    }
    
}
