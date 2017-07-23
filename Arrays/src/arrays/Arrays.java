/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Tony
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arregloInt[] = {1,2,3,4,5};
        int arregloCopia[] = arregloInt;
        int arreglo[] = {1,2,3,4,5};
        
        System.out.println(arregloInt == arregloCopia);
        System.out.println(arregloInt.equals(arregloCopia));
        System.out.println(arregloInt==arreglo);
        System.out.println(arregloInt.equals(arreglo));
        
//        String[] arreglo1;
//        arreglo1{"",""};      Compiller error

        String[] arreglo1 = {"", ""};
        
        String[] arreglo2;
        arreglo2 = new String[] {"",""};
        
        String[] arreglo3 = new String[] {"","",""};
        
        String[] arreglo4 = new String[3];
        
    }
    
}
