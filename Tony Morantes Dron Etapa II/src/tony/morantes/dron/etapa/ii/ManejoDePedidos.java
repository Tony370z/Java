/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tony.morantes.dron.etapa.ii;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Tony
 */
public class ManejoDePedidos {
    
    private Path p;
    private boolean exist;
    private FileWriter input;
    private FileReader fr;
    private PrintWriter writer;
    private String line;
    private int counter;
    private BufferedReader reader;
    private int orderQuantity;
    private FileWriter fl;
    private PrintWriter pr;

    public ManejoDePedidos(){
        counter = 0;
        line = null;
        orderQuantity=3;
    }
    
    public ManejoDePedidos(String numero) throws IOException{
        this();
        String in = ("in"+numero+".txt");
        String out = ("out"+numero+".txt");
        p = Paths.get(in);
        exist = p.toUri().getPath().endsWith(in);
        input = exist ? new FileWriter(in, true) : new FileWriter(in);
        fr = new FileReader(in);
        reader = new BufferedReader(fr);
        fl = new FileWriter(out);
        pr = new PrintWriter(fl);
    }
    
    public void pedido(Barrio bar) throws IOException{
        
        if(reader.ready()){
            while((line = reader.readLine()) != null && counter < orderQuantity){
                System.out.println(line);
                Dron dron = new Dron();
                counter++;
                for(char c : line.toCharArray()){
                    Movimiento.avanzar(dron, bar, c);
                }
                if(Movimiento.isvalid){
                    pr.println("(" + dron.getCoordenadaX() + ", " + dron.getCoordenadaY() + ") " + "dirección " + dron.getOrientacion());
                }else{
                    pr.println("Direccion fuera de zona de despacho");
                }
                System.out.println(dron.getCoordenadaX()+ " " + dron.getCoordenadaY());
            }
            pr.close();
            reader.close();
        }else{
            System.err.println("No hay pedidos");
        }
        
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }
    
}