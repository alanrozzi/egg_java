/*
 * 
 */
package guide7_ej4_extra;

import Entidades.Cuenta;

/**
 *
 * @author alanr
 */
public class Guide7_Ej4_EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuentaNueva = new Cuenta("Loro", 120000);
        
        System.out.println("Saldo: " + cuentaNueva.getSaldo());
        
        do
        {
            cuentaNueva.retirarDinero(20000);
        } while (cuentaNueva.getSaldo()>20000);
        
        
        
    }
    
}
