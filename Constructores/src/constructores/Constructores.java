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
public class Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConstructorPorDefecto constructorDefecto = new ConstructorPorDefecto();
        constructorDefecto.saludo();
        
        /*
         * Sobrecarga de constructor String para asignarle un valor
         * a la variable persistente (static)
         */
        ConstructorPorDefecto constructorString = 
                new ConstructorPorDefecto("Nuevo saludo");
        constructorString.saludo();
        
        //Bloque de codigo que invoca a la variable persistente y le agrega
        //un complemento
        PruebaDePersistencia prueba = new PruebaDePersistencia();
        prueba.saludoViejo();
        
        //Bloque de codigo repetido que demuestra la pesistencia
        constructorDefecto = new ConstructorPorDefecto();
        constructorDefecto.saludo();
    }
    
}
