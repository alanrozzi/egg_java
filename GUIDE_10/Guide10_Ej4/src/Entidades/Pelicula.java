/*
 * 
 */
package Entidades;

/**
 *
 * @author alanr
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private Float duracionHoras;

    public Pelicula(String titulo, String director, float duracionHoras) {
        this.titulo = titulo;
        this.director = director;
        this.duracionHoras = duracionHoras;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Float getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(Float duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionHoras=" + duracionHoras + '}';
    }
    
    
    
}
