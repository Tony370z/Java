/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tony.morantes.dron.etapa.ii;

/**
 *
 * @author Tony
 */
public abstract interface Mapa {
    //Puntos Cardinales
    public static final String NORTE = "Norte";
    public static final String SUR = "Sur";
    public static final String ESTE = "Este";
    public static final String OESTE = "Oeste";
    //Grados y giros en grados
    public static final short G90 = 90;
    public static final short G180 = 180;
    public static final short G270 = 270;
    public static final short G360 = 360;
    public static final short G0 = 0;
    public static final short I = 90;
    public static final short D = -90;
    //Movimientos en el eje cartesiano
    public static final byte Y_MAS_UNO = 1;
    public static final byte Y_MENOS_UNO = -1;
    public static final byte X_MAS_UNO = 1;
    public static final byte X_MENOS_UNO = -1;
}
