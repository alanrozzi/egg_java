/*
 * 
 */
package guide8_ej3;

import Entidades.Persona;
import Servicios.ServicioPersona;

/**
 *
 * @author alanr
 */
public class Guide8_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioPersona sp = new ServicioPersona();
        
        Persona persona1 = new Persona("Alancito", 15, 'H', 37.8, 1.75);
        Persona persona2 = new Persona("Rodolfo", 30, 'M', 40.5, 1.57);
        Persona persona3 = new Persona("Ester", 10, 'M', 50.4, 1.40);
        Persona persona4 = new Persona("Abel", 60, 'H', 80.9, 1.80);
        
        mostrarInformes(persona1);
        mostrarInformes(persona2);
        mostrarInformes(persona3);
        mostrarInformes(persona4);
        
        sp.agregarDatosMayorDeEdad(persona1, persona2, persona3, persona4);
        sp.agregarDatosIMC(persona1, persona2, persona3, persona4);
        
        System.out.println("----------------");
        
        sp.porcentajesIMC();
        System.out.println("");
        sp.porcentajesEdad();
        
    }
    
    public static void mostrarInformes(Persona p)
    {
        ServicioPersona sp = new ServicioPersona();
        
        sp.mostrarMayorDeEdad(p);
        sp.mostrarIMC(p);
        sp.calcularIMC(p);
        System.out.println("");
    }
    
}
