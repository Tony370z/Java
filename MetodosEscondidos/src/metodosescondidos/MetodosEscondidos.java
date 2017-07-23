/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosescondidos;

/**
 *
 * @author Tony
 */
public class MetodosEscondidos extends Escondidos{
    
    public static void escondido(){
        System.out.println("Metodo Escondido Hijo");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MetodosEscondidos var = new MetodosEscondidos();
        var.escondido();                //Hijo
        MetodosEscondidos.escondido();  //Hijo
        
        Escondidos.escondido();//Padre
        
//        MetodosEscondidos hijo = (MetodosEscondidos)new Escondidos(); Class cast exception

        Escondidos hijo = new MetodosEscondidos();
        hijo.escondido();               //Padre
        
    }
    
}
