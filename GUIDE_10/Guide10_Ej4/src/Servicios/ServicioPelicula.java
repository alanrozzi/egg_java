/*
 * 
 */
package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class ServicioPelicula {
    

    private Scanner read;
    private ArrayList<Pelicula> peliculas;

    public ServicioPelicula() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.peliculas = new ArrayList();
    }
    
    private Pelicula crearPelicula()
    {
        String titulo;
        String director;
        Float duracionHoras;
        
        System.out.println("Ingrese el titulo de la pelicula: ");
        titulo = read.next();
        
        System.out.println("Ingrese el director: ");
        director = read.next();
        
        System.out.println("Ingrese la duracion en horas: ");
        duracionHoras = read.nextFloat();
        
        return new Pelicula(titulo, director, duracionHoras);
        
    }
    
    public void agregarPeliculas()
    {
        String respuesta = "";
        
        do
        {
            this.peliculas.add(crearPelicula());
            
            System.out.println("Pelicula agregada, desea otra?: 's' / 'otro'");
            respuesta = read.next();
            
        } while (respuesta.equals("s"));
        
    }
    
    public void mostrarPeliculas()
    {
         this.peliculas.forEach((pelicula) -> System.out.println(pelicula));
    }
    
    public void mostrarPeliculasMasDeUnaHora()
    {
        System.out.println("Peliculas de mas de una hora: ");
        for (int i = 0; i < peliculas.size(); i++)
        {
            Pelicula pelicula = peliculas.get(i);
            if (pelicula.getDuracionHoras() > 1)
            {
                System.out.println(pelicula);
            }
        }
    }
    
    public void ordernarPorDuracionDesc()
    {
        Collections.sort(peliculas, Comparadores.ordenarDuracionDesc);
        mostrarPeliculas();
    }
    
    public void ordernarPorDuracionAsc()
    {
        Collections.sort(peliculas, Comparadores.ordenarDuracionAsc);
        mostrarPeliculas();
    }
    
    public void ordernarPorTituloAsc()
    {
        Collections.sort(peliculas, Comparadores.ordenarTituloAsc);
        mostrarPeliculas();
    }
    
    public void ordernarPorDirectorAsc()
    {
        Collections.sort(peliculas, Comparadores.ordenarDirectorAsc);
        mostrarPeliculas();
    }
    
}
