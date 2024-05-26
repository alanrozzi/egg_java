 /*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package guide10_ej1;

import Servicios.ServicioPerro;

/**
 *
 * @author alanr
 */
public class Guide10_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioPerro sPerro = new ServicioPerro();
        
        sPerro.menu();
        
        sPerro.mostrarRazas();

        sPerro.eliminarRaza();
        
        sPerro.mostrarRazas();
        
    }
    
    
    
}
