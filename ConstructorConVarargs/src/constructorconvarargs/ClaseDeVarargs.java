/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorconvarargs;

/**
 *
 * @author Tony
 */
public class ClaseDeVarargs {
    
    protected String nombre= null;
    protected String apellido= null;
    protected String cedula= null;
    protected int edad;

    public ClaseDeVarargs(String... args) {
        this.nombre = args[0];
        this.apellido = args[1];
        this.cedula = args[2];
        this.edad = Integer.parseInt(args[3]);
    }
    
}
