/*
 * 
 */
package guide10_teoria_1;

import Entidades.Libro;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alanr
 */
public class Guide10_Teoria_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //Lista
        ArrayList<Libro> libros = new ArrayList();
        
        //Adds
        libros.add(new Libro("Lastimosamente"));
        libros.add(new Libro("Enteros"));
        libros.add(new Libro("Sera"));
        libros.add(new Libro("Alla"));
        
        //Iterator
        Iterator<Libro> iLibros = libros.iterator();
        
        //Usar iterator
        while(iLibros.hasNext())
        {
            //Utiliza el toString()
            System.out.println( iLibros.next() + " ");
        }
        
    }
    
}

/*
ArrayList<String> lista = new ArrayList();
//adds
Iterator<String>  iterator = lista.iterator();		//Iterador con el iterador de la lista.
while( iterator.hasNext() ){
	sout( iterator.next() + " " );
}
soutln();





*/