 /*
 * 
 */
package guide10_ej5;

import Servicios.ServicioPais;

/**
 *
 * @author alanr
 */
public class Guide10_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioPais sPais = new ServicioPais();
        
        sPais.agregarPaises();
        sPais.mostrarPaises();
        
        sPais.eliminarPais();
        
        sPais.mostrarPaises();
    }
    
}
