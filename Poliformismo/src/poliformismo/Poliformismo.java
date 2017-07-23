/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliformismo;

/**
 *
 * @author Tony
 */
public class Poliformismo extends SuperClass{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Poliformismo poliForme = new Poliformismo();
        poliForme.saludo();
        
        Interfaz interfaz = poliForme;// Acceso a la interfaz de forma directa
        interfaz.saludo();
        
        SuperClass superClass = (SuperClass) interfaz;
        superClass.saludo();
        superClass.adios();
        //superClass.nombre(); Compiler error porque en este nivel no tenemos acceso
        
        System.out.println("");
        
        SuperClass superObjeto = poliForme;
        superObjeto.saludo();
        
        Interfaz interfaz2 = superObjeto;// Acceso a la interfaz desde una referencia
        interfaz2.saludo();//               de la super clase del objeto
    }
    
    @Override
    public void saludo() {
        System.out.println("Hola a todos desde la Clase Poliformismo");
    }
    
    public void nombre() {
        System.out.println("Mi nombre es Tony desde la Clase Poliformismo");
    }
    
}

abstract interface Interfaz{
    public abstract void saludo();
}

class SuperClass implements Interfaz{

    @Override
    public void saludo() {
        System.out.println("Hola Mundo desde la clase SuperClass");
    }
    
    public void adios() {
        System.out.println("Hasta luego desde la clase SuperClass");
    }
    
}