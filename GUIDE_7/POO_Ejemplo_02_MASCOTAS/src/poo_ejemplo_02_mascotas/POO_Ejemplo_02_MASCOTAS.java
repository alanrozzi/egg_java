/*
 * 
 */
package poo_ejemplo_02_mascotas;

import Entidades.Mascota;
import Entidades.Usuario;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class POO_Ejemplo_02_MASCOTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        Mascota m1 = new Mascota("Chikito", read.next(), "Perro", "Tricolor", 14, true, "Beagle");
        Usuario u1 = new Usuario("Fernando", "Valle", 1444444, Date.from(Instant.MAX), "Nosa");
        
        //No se pueden acceder a los atributos por punto por modificadores de acceso privados
        //System.out.println(m1.apodo + " " + m1.edad);
        
    }
    
}
