/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostatic;

import nuevoPaquete.EstaticaLejana;
import static ejerciciostatic.Estatica.soyStatic; //Llamadas a las cosas estaticas
                                                  //de esa clase

/**
 *
 * @author Tony
 */
public class EjercicioStatic {
    
    public static void metodoStatico(){
        //Solo se puede llamar a cosas estaticas
        Estatica.soyStatic();
        String nuevaVariableStatic = Estatica.variableStatica;
    }
    public void metodoNoStatico(){
        Estatica.soyStatic();
        Estatica llamada = new Estatica();
        llamada.noSoyStatic();
        llamada.soyStatic();
        String nuevaVariableStatica = Estatica.variableStatica;
        String nuevaVariableStatica2 = llamada.variableStatica;
        //Estatica.variableStatica; Si no se asigna a una variable da error
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estatica.soyStatic();
        
        Estatica estatico = new Estatica();
        estatico.noSoyStatic();
        
        //La referencia tambien puede llamar al metodo estatico
        estatico.soyStatic();//Aunque se puede muestra una alerta
        
        //Estatica.noSoyStatic();//Un metodo que no es static no puede
                                // ser llamado por una referencia static
                                
        soyStatic();
        
        System.out.println("Final " + EstaticaLejana.lejos);
    }
    
}
