/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoabstracduplicado;

abstract interface uno{

    public abstract void repetido();

}

abstract interface dos{

    public abstract void repetido();

}

/**
 *
 * @author Tony
 */
public class MetodoAbstracDuplicado implements uno,dos{

    @Override
    public void repetido() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        dos x = new dos();
    }
    
}
