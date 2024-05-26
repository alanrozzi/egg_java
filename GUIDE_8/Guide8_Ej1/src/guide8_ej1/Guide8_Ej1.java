/*
 * 
 */
package guide8_ej1;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/**
 *
 * @author alanr
 */
public class Guide8_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBancariaServicio CBs = new CuentaBancariaServicio();
        
        CuentaBancaria cuenta = CBs.crearCuenta();
        
        CBs.consultaCuenta(cuenta);
        
    }
    
}
