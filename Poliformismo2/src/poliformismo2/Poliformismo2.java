/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliformismo2;

/**
 *
 * @author Tony
 */
public class Poliformismo2 extends SuperClass implements Interfaz{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Poliformismo2().saludo();// Sorprendentemente no hace falta sobre-escribir el metodo heredado desde
        System.out.println("");//       la INTERFAZ ya que estamos heredando un metodo EXACTO en una SUPER CLASE
        
        Poliformismo2 poliForme = new Poliformismo2();
        poliForme.saludo();
        
        Interfaz interfaz = poliForme;// De abajo para arriba sin casting
        interfaz.saludo();
        
        SuperClass superClass = poliForme;// De abajo para arriba sin casting
        superClass.saludo();
        
        Poliformismo2 poliForme2 = (Poliformismo2) superClass;// De arriba para abajo necesitamos casting
        poliForme2.saludo();
        
        Interfaz interfaz2 = (Interfaz) superClass; // En el mismo nivel siendo la materia primera el hijo
        interfaz2.saludo();                         // necesitamos casting
        
        System.out.println("");
        
        /*  //Bloque de codigo generado para generar un ClassCastException
            //Genera dicha excepcion puesto que estamos intentado castear
            //Una clase a una interfaz
            //Si 
        
            SuperClass superObjeto2 = new SuperClass();
            superObjeto2.saludo();
        
            Interfaz interfaz3 = (Interfaz) superObjeto2; //Aqui es donde ocurre
        */   
        
        SuperClass padre = new Poliformismo2();
        
        SuperClass superObjeto = padre;
        superObjeto.saludo();
        
    }
    
    /* Este bloque de codigo se puede omitir y no causa ningun daño
    @Override
    public void saludo(){
        System.out.println("Hola a todos desde la clase Poliformismo2");
    }*/
}

abstract interface Interfaz {
    public abstract void saludo();
}

class SuperClass {
    public void saludo(){
        System.out.println("Hola a todos desde la super clase");
    }
}