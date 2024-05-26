/*
 * 
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunfenrencia()
    {
        Scanner read = new Scanner(System.in);
        
        this.setRadio(read.nextDouble());
        
    }
    
    public double area()
    {
        return Math.pow((Math.PI * this.getRadio()), 2);
    }
    
    public double perimetro()
    {
        return 2 * Math.PI * this.getRadio();
    }
    
}
