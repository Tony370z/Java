/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swan;

/**
 *
 * @author Tony
 */
public class Swan {

    int numeroDeHuevos;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Swan mama = new Swan();
        mama.numeroDeHuevos = 4;
        System.out.println(mama.numeroDeHuevos);
    }
    
}
