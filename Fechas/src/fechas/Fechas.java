/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author Tony
 */
public class Fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String fechaS = "04-29-1992";
        String fecha = null;
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
//        DateTimeFormatter frm = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
//        DateTimeFormatter frm = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
//        DateTimeFormatter frm = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter frm = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        LocalDate date = LocalDate.parse(fechaS, format);
        fecha = frm.format(date);
        System.out.println(date);
        System.out.println(fecha);
        
    }
    
}
