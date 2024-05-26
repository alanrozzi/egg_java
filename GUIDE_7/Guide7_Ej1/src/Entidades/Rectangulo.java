/*
 */
package Entidades;

/**
 *
 * @author alanr
 */
public class Rectangulo {
    
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public int superficie()
    {
        return this.getAltura() * this.getBase();
    }
    
    public int perimetro()
    {
        return 2 * (this.getAltura() + this.getBase());
    }
    
    public void dibujarRectangulo()
    {
        for (int i = 0; i < this.getBase(); i++)
        {
            for (int j = 0; j < this.getAltura(); j++)
            {
                System.out.println("*");
            }
            System.out.println("");
        }
    }
    
}
