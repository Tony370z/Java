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
public class Barrio {
    
    private boolean grilla[][];
    private int altura;
    private int base;
    private int radio;

    public Barrio() {
        altura = 21;
        base = 21;
        radio = base / 2;
        grilla = new boolean[base][altura];
        
        for (int x = 0; x < grilla.length; x++){
            for (int y = 0; y < grilla[x].length; y++){
                grilla[x][y] = false;
            }
        }
        
    }

    public int getRadio() {
        return radio;
    }

    public boolean[][] getGrilla() {
        return grilla;
    }

    public void setGrilla(int x, int y, boolean valor) {
        this.grilla[x][y] = valor;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }
    
}