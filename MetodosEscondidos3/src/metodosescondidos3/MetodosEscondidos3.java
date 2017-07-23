/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosescondidos3;

/**
 *
 * @author Tony
 */
public class MetodosEscondidos3 extends holaPadre{
    
    public static void holaPadre(){
        System.out.println("Hola soy el hijo");
    }
    
    public void sobreEscribir(){
        System.out.println("HE SIDO SOBRE ESCRITO");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        holaPadre mensaje = new MetodosEscondidos3();
        
        mensaje.holaPadre();
        holaPadre.holaPadre();
        MetodosEscondidos3.holaPadre();
        
        mensaje.sobreEscribir();
        
    }
    
}