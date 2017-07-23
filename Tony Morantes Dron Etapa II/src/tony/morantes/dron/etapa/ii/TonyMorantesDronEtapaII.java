/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tony.morantes.dron.etapa.ii;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tony
 */
public class TonyMorantesDronEtapaII {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException{
        // TODO code application logic here
        
        int cantidadPedidos = 10;
        int cantidadDrons = 20;
        
        List<Hilos> hilos = new ArrayList<>();
        
        for(int x = 1; x <= cantidadDrons; x++){
            Hilos hilo = new Hilos(String.valueOf(x));
            hilo.setDronNmero(x);
            hilo.setCantidadPedido(cantidadPedidos);
            hilos.add(hilo);
        }
        
        hilos.stream().forEach((h) -> {
            h.start();
        });

    }
}