/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leny_clase1;

/**
 *
 * @author Tony
 */
public class Leny_Clase1 {
    
    byte imAByte = -128; //8 bits number 256 
    short imShort; // 16 bit number
    int number = 25; // 32 bits number
    long greatNumber; // 64 bots number
   
    /* 
    
        Everything inside here is
        a multiline comment
    // Comment
    */
    
    float decimalNumber; // 32 bits decimal number
    double greaterDecimalNumber; // 64 bits decimal number
    
    char singleChar = 'A'; // A single character
    
    boolean isTrue = false; // 0
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello Leny you are suculento papy");
        
        System.out.println(Byte.MAX_VALUE + " Im a byte type");
        System.out.println(Short.MAX_VALUE + " Im a short type");
        System.out.println(Integer.MAX_VALUE + " Im a integer type");
        System.out.println(Long.MAX_VALUE + " Im a long type");
        System.out.println(Float.MAX_VALUE + " Im a float type");
        
    }
    
}
