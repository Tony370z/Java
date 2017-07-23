/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tony.morantes.dron.etapa.i;

import java.io.*;

/**
 *
 * @author Tony
 */
public class TonyMorantesDronEtapaI {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException{
        // TODO code application logic here
        
        ManejoDePedidos pedido = new ManejoDePedidos();
        
        Barrio bar = new Barrio();
        pedido.pedido(bar);
    }
}