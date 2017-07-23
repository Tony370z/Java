/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tony.morantes.dron.etapa.i;

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

    public ManejoDePedidos() throws IOException{
        counter = 0;
        line = null;
        p = Paths.get("in.txt");
        exist = p.toUri().getPath().endsWith(".txt");
        input = exist ? new FileWriter("in.txt", true) : new FileWriter("in.txt");
        fr = new FileReader("in.txt");
        reader = new BufferedReader(fr);
        orderQuantity=3;
        fl = new FileWriter("out.txt");
        pr = new PrintWriter(fl);
    }
    
    public void pedido(Barrio bar) throws IOException{
        
        if(reader.ready()){
            while((line = reader.readLine()) != null && counter < orderQuantity){
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
            System.out.println(line);
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