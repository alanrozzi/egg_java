/*
 * 
 */
package guide8_ej2;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;

/**
 *
 * @author alanr
 */
public class Guide8_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CafeteraServicio cafeSer = new CafeteraServicio();
        
        Cafetera cafe = new Cafetera(100);
        
        cafeSer.llenarCafetera(cafe);
        
        cafeSer.servirTaza(cafe, 50);
        cafeSer.servirTaza(cafe, 30);
        cafeSer.servirTaza(cafe, 30);
        cafeSer.servirTaza(cafe, 30);
        
        
    }
    
}
