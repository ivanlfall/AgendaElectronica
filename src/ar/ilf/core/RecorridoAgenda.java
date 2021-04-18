package ar.ilf.core;

public class RecorridoAgenda {
    
    public static final int ADELANTE = 1;
    public static final int ATRAS = -1;
    
    
    public static int recorrer(int posicionActual, int direccion, int tope ){
        
        int nuevaPosicion = posicionActual;
        
        if (direccion == ADELANTE ){
            if (posicionActual == tope ) {
                
            }else{
                nuevaPosicion++;
            }
        }else{
            if (posicionActual == 0 ) {    
            	
            }else{
                nuevaPosicion--;
            }
        }
        return nuevaPosicion;
    }
    
    
}
