/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.*;
import java.nio.file.*;

/**
 *
 * @author Tony
 */
public class Archivos {
    
    static Path p;
    static boolean exist;
    static FileWriter input;
    static FileReader reader;
    static PrintWriter writer;
    static String line;
    static BufferedReader bWriter;

    public Archivos() throws IOException{
        
        line = null;
        p = Paths.get("input.txt");
        exist = p.toUri().getPath().endsWith(".txt");
        input = exist ? new FileWriter("input.txt", true) : new FileWriter("input.txt");
        writer = new PrintWriter(input);
        
        if(exist){
            reader = new FileReader("input.txt");
            bWriter = new BufferedReader(reader);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException{
        // TODO code application logic here
        
        Archivos arc = new Archivos();
        
        arc.writer.println("AAAAIAAD");
        arc.writer.println("DDAIAD");
        arc.writer.println("AAIADAD");
        
        arc.writer.close();
        
        while((line = bWriter.readLine()) != null){
            System.out.println(line);
        }

    }
    
}
