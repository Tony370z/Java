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
public class ClasesMultiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumnos alumno = new Alumnos();
        alumno.holamundo();;
        String saludo = alumno.hola;
        
        saludo = saludo + " " + "2";
        
        System.out.println(saludo);
    }
    
}
