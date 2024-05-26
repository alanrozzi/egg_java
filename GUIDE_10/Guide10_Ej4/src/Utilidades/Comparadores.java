/*
 * 
 */
package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author alanr
 */
public class Comparadores {
    
    public static Comparator<Pelicula> ordenarDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracionHoras().compareTo(t.getDuracionHoras());
        }
    };
            
    public static Comparator<Pelicula> ordenarDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracionHoras().compareTo(t1.getDuracionHoras());
        }
    };
    
    public static Comparator<Pelicula> ordenarTituloAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
            
    public static Comparator<Pelicula> ordenarDirectorAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
    
}
