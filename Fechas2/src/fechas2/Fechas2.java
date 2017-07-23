/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author Tony
 */
public class Fechas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LocalDate fecha = LocalDate.now();
        fecha = fecha.plusDays(0);
        fecha = fecha.plusWeeks(0);
        fecha = fecha.plusMonths(0);
        fecha = fecha.plusYears(0);
        System.out.println(fecha);
        
        LocalDateTime dateTime = LocalDateTime.now();
        dateTime = dateTime.plusHours(0);
        dateTime = dateTime.plusMinutes(0);
        dateTime = dateTime.plusSeconds(0);
        dateTime = dateTime.plusNanos(0);
        System.out.println(dateTime);   
        
        Period periodo = Period.ZERO;
        
        Duration duracion = Duration.ZERO;
        
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime2 = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime2.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        
        System.out.println("");        
        
//        DateTimeFormatter formatea = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        DateTimeFormatter formatea = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
//        DateTimeFormatter formatea = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);        
        
        //System.out.println(formatea.format(fecha));
        
        System.out.println("");        
        
        System.out.println(dateTime.format(formatea));
        
        System.out.println("");        
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd, MM, yy");
        LocalDate date2 = LocalDate.now();
        System.out.println(date2.format(f));
        
        DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        LocalTime tiempo = LocalTime.now();
        System.out.println(tiempo);
        System.out.println(tiempo.format(f2));
    }
    
}
