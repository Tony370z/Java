/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacionsb;

/**
 *
 * @author Tony
 */
public class ComparacionSB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RuntimeException{
        // TODO code application logic here
        
        String algo = "Hola";
        
        if("Hola".equals(algo)){
            System.out.println(algo);
        }
        
        StringBuilder sb1 = new StringBuilder("1");
        StringBuilder sb2 = sb1;
        
        System.out.println(sb1==sb2);
        
        StringBuilder sb3 = new StringBuilder(5);
        sb3.append("Hola");
        System.out.println("Tamaño " + sb3.length());
        System.out.println("Capacidad " + sb3.capacity());
        sb3.append(" Mundo!!!");
        System.out.println("Tamaño " + sb3.length());
        System.out.println("Capacidad " + sb3.capacity());
        sb3.append(" Estoy aqui!!!");
        System.out.println("Tamaño " + sb3.length());
        System.out.println("Capacidad " + sb3.capacity());
        
        StringBuilder sb4 = new StringBuilder("Hola");
        System.out.println(sb4);
        System.out.println(sb4.equals("Hola"));
        
        
        int entero = 5_000_000;
//        long largo = (long) entero * entero; Promocion numeroca
        long largo = entero * entero + entero * entero;
        
        System.out.println(largo);
        
        try {
            largo = largo / 0;
            
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        
        
//        throw new ClassCastException();
//            throw new IllegalArgumentException();
    }
    
}
