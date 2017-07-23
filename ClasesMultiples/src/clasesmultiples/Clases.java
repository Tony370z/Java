/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesmultiples;

/**
 *
 * @author Tony
 */
public class Clases {
    
    float value1 = 102;
    float value2 = (int)102.0;
    float value3 = 1f * 0.0;
    float value4 = 1f * (short)0.0;
    float value5 = 1f * (boolean)0;
    
}

class Alumnos {
    // En la practica solo 1 clase puede ser publica. 1 Archivo puede tener tantas
    // Clases como le de la gana al programador siempre y cuando lo anterior
    // se cumpla.
    
    /**
     * Variable hola que contiene "Hola Mundo"
     */
    String hola = "Hola Mundo";
        /**
         * Escribe hola mundo, pertenece a la clase Alumnos
         * dentro del archivo Clases.
         */
    public void holamundo(){
        System.out.println(hola);
    }
}
