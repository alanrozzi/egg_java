/*
 * 
 */
package Entidades;

/**
 *
 * @author alanr
 */
public class Libro {
    
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + '}';
    }
    
}
