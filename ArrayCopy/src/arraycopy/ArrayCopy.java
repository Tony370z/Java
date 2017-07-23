/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraycopy;

/**
 *
 * @author Tony
 */
public class ArrayCopy {
    
    //Declaracion sin instanciacion ni inicializacion
    static int array[];
    
    //Declaracion mas inicializacion (no usa "new" y debe ser en la misma linea)
    static int arrayIni[] = {4,5,6};
    
    //Declaracion mas instanciacion (puede ser en la misma linea)
    static int arrayInsta[] = new int[3];
    
    /*Declaracion + instaciacion + inicializacion 
        Puede o no tener valores
        La instaciacion no puede establecer el tamaño (1)
        La inicializacion si puede establecer el tamaño (2)*/
    static int arrayFull[] = new int[]{};// 1
    static int arrayFull2[] = new int[]{7,8,9};// 2

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Al usar el objeto fuera de la linea de declaracion
            DEBEMOS user "new" o sea la instanciacion*/
        array = new int[3];
        
        /*Para inicializar los valores de un array con un tamaño pre-establecido
        fuera de la misma linea debemos hacerlo posicion por posicion*/
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        // array[3] = 4; error no existe dicha posicion
        
        /*Para inicializar los valores de un array
        fuera de la misma linea debemos hacerlo posicion por posicion
        para hacerlo mas comodo usamos un ciclo "for" */
        for(int x=0; x<arrayInsta.length; x++){
            arrayInsta[x] = x+1;
        }
        
       System.out.println(arrayFull + " FULL es la posicion en memoria");
       System.out.println(arrayFull2[0] + " FULL2 valor en la posicion 0");
       
       System.out.println(arrayInsta[0] + " INSTA valor en la posicion 0");      
       
       /*INICIO DEL EJEMPLO DE ARRAY COPY*/
       int[] arrayCopy = {10, 15 , 20, 25};
       int[] arrayCopied = {0,0,0,0,0};
       
       /*Decimos desde que posicion queremos copiar de la fuente,
        luego decimos a partir de que posicion queremos que se copien
       los valores en el destino. El ultimo valor indica la cantidad de
       de elementos que queremos copiar
       */
       System.arraycopy(arrayCopy, 2, arrayCopied, 0, 1); // 1 Elemento a copiar
       
       for(int x : arrayCopy){
           System.out.print(x + " ");
       }System.out.print("FIN");
       
        System.out.println("");
        
        for(int x : arrayCopied){
           System.out.print(x + " ");
       }System.out.print("FIN");
    }
    
}
