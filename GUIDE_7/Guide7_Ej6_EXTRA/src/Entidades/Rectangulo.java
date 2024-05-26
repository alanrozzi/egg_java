/*
 * 
 */
package Entidades;

/**
 *
 * @author alanr
 */
public class Rectangulo {
    
    private int lado1;
    private int lado2;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }
    
    public int calcularArea()
    {
        return this.getLado1() * this.getLado2();
    }
    
}
