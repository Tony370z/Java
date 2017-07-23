/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto2;

/**
 *
 * @author Tony
 */
public class Abstracto2 extends segundaClaseAbstracta{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void metodoAbstracto1() {
    }

    @Override
    public void metodoAbstracto12() {
    }
    
}

abstract class primeraClaseAbstracta{
    public abstract void metodoAbstracto1();
}

abstract class segundaClaseAbstracta extends primeraClaseAbstracta{
    public abstract void metodoAbstracto12();
}
