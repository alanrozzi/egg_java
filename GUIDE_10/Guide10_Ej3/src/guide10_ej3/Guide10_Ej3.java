/*
 * 
 */
package guide10_ej3;

import Servicios.ServicioAlumno;

/**
 *
 * @author alanr
 */
public class Guide10_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAlumno sAlumno = new ServicioAlumno();
        
        sAlumno.crearAlumnos();
        
        sAlumno.mostrarAlumnos();
        
        sAlumno.calcularNotaFinal();
    }
    
}
