/*
 */
package Entidad;

/**
 *
 * @author alanr
 */
public class Persona {
        // atributos
    private String nombre;
    private int edad;
    private float altura;
        
    
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public float getAltura() {
        return altura;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    // constructores
    
    public Persona (String nombre, int edad, float altura)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    // métodos propios
    public void hablar(String frase)
    {
        System.out.println(frase);
    }
    
}
