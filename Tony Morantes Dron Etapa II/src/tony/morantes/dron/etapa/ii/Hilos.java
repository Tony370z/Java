/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tony.morantes.dron.etapa.ii;

import java.io.IOException;

/**
 *
 * @author Tony
 */
public class Hilos extends Thread{
    
    private int dronNmero;
    private int cantidadPedido;
    
    public Hilos(String numero) {
        super(numero);
    }

    @Override
    public void run(){
        try {
            ManejoDePedidos pedido = new ManejoDePedidos(convert2Digits(dronNmero));
            pedido.setOrderQuantity(cantidadPedido);
            Barrio bar = new Barrio();
            pedido.pedido(bar);
        } catch (IOException ex) {
            System.err.println("Ha ocurrido un error con dron#"+ this.getName());
        }
        System.out.println("El dron #"+ this.getName() + " ha terminado");
    }
    
    private String convert2Digits(int numero){
        StringBuilder num = new StringBuilder("0");
        if(String.valueOf(numero).length()<2){
            num.append(numero);
        }else{
            return String.valueOf(numero);
        }
        return num.toString();
    }

    public int getDronNmero() {
        return dronNmero;
    }

    public void setDronNmero(int dronNmero) {
        this.dronNmero = dronNmero;
    }

    public int getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(int cantidadPedido) {
        this.cantidadPedido = cantidadPedido;
    }
    
}