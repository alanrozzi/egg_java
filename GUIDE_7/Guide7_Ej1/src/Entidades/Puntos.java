/*
 * 
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Puntos {
    
    private int x1, x2;
    private int y1, y2;
    
    public void crearPuntos()
    {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Punto 1: ");
        this.x1 = read.nextInt();
        this.y1 = read.nextInt();
        System.out.println("Punto 2: ");
        this.x2 = read.nextInt();
        this.y2 = read.nextInt();
    }
    
    public double calcularDistancia()
    {
       return Math.sqrt((double)(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)));
    }
    
}