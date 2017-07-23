/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosescondidos2;

/**
 *
 * @author Tony
 */
public class MetodosEscondidos2{
    
    private void metodoEscondido(){
        System.out.println("Metodo Escondido Padre");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MetodosEscondidos2 var = new Hijo();
        var.metodoEscondido();

//        Hijo hijo = new MetodosEscondidos2();
//        hijo.metodoEscondido();

//        public void estoyEnElMain(){
//            System.out.println("");
//        }

//        StringBuilder sb1 = new StringBuilder(3);
//        sb1.append("hola").append("Mundo").append(" ").append("!");
//        System.out.println(sb1.toString());
    }
    
}
