/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tony.morantes.dron.etapa.i;

/**
 *
 * @author Tony
 */
public class Movimiento implements Mapa{
    
    private static String orientacion;
    private static int giro;
    private static int posicionX;
    private static int posicionY;
    public static boolean isvalid;
    
    public static void avanzar(Dron dron, Barrio bar, char direccion){
        
        switch(direccion){
            case 'A':
                isvalid = movimientoValido(dron, bar);
                if(isvalid){
                    avanzar(dron, bar);
                }
                break;
            case 'I':
                giro = dron.getGrado() + I <= G360 ? dron.getGrado() + I : G90;
                actualizarCoordenadas(dron, giro);
                break;
            case 'D':
                giro = dron.getGrado() + D  >= G0  ? dron.getGrado() + D : G270;
                actualizarCoordenadas(dron, giro);
                break;
            default:
                break;
        }
    }
    
    public static void actualizarCoordenadas(Dron dron, int giro){
        switch(giro){
                case G0:
                    dron.setOrientacion(ESTE);
                    dron.setGrado(giro);
                    break;
                case G90:
                    dron.setOrientacion(NORTE);
                    dron.setGrado(giro);
                    break;
                case G180:
                    dron.setOrientacion(OESTE);
                    dron.setGrado(giro);
                    break;
                case G270:
                    dron.setOrientacion(SUR);
                    dron.setGrado(giro);
                    break;
                case G360:
                    dron.setOrientacion(ESTE);
                    dron.setGrado(giro);
                    break;
                default:
                    break;
            }
    }
    
    public static void avanzar(Dron dron, Barrio bar){
         orientacion = dron.getOrientacion();
         posicionX = dron.getPosicionX();
         posicionY = dron.getPosicionY();
         
         switch(orientacion){
            case NORTE:
                 bar.setGrilla(posicionX, posicionY, false);
                 posicionY = posicionY + Y_MAS_UNO;
                 
                 bar.setGrilla(posicionX, posicionY, true);
                 dron.setPosicionY(posicionY);
                 dron.setCoordenadaY(posicionY - bar.getRadio());
                 break;
            case SUR:
                 bar.setGrilla(posicionX, posicionY, false);
                 posicionY = posicionY + Y_MENOS_UNO;
                 
                 bar.setGrilla(posicionX, posicionY, true);
                 dron.setPosicionY(posicionY);
                 dron.setCoordenadaY(posicionY - bar.getRadio());
                 break;
            case ESTE:
                 bar.setGrilla(posicionX, posicionY, false);
                 posicionX = posicionX + X_MAS_UNO;
                 
                 bar.setGrilla(posicionX, posicionY, true);
                 dron.setPosicionX(posicionX);
                 dron.setCoordenadaX(posicionX - bar.getRadio());
                 break;
            case OESTE:
                 bar.setGrilla(posicionX, posicionY, false);
                 posicionX = posicionX + X_MENOS_UNO;
                 
                 bar.setGrilla(posicionX, posicionY, true);
                 dron.setPosicionX(posicionX);
                 dron.setCoordenadaX(posicionX - bar.getRadio());
                 break;
         }
    }
    
        public static boolean movimientoValido(Dron dron, Barrio bar){
            boolean retorno = false;
            switch(dron.getOrientacion()){
                case NORTE:
                case SUR:
                    retorno = Math.abs(dron.getCoordenadaY()) < bar.getRadio();
                    break;
                case ESTE:
                case OESTE:
                    retorno = Math.abs(dron.getCoordenadaX()) < bar.getRadio();
                    break;
            }
            return retorno;
    }
}