/*
 * 
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Libro {
    
    int isbn;
    String titulo;
    String autor;
    int numeroPaginas;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    public Libro CargarLibro()
    {
        Scanner read = new Scanner(System.in);
        
        return new Libro(read.nextInt(), read.next(), read.next(), read.nextInt());
        
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }
    
    
    
}
