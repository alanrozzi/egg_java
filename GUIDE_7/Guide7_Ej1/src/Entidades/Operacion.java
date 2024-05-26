/*
 * 
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Operacion {
    
    private int num1, num2;

    public Operacion() {
    }
    
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion()
    {
        Scanner read = new Scanner(System.in);
        
        this.setNum1(read.nextInt());
        this.setNum2(read.nextInt());
    }
    
    public int sumar()
    {
        return this.getNum1() + this.getNum2();
    }
    
    public int restar()
    {
        return this.getNum1() - this.getNum2();
    }
    
    public int multiplicar()
    {
        int multiplicacion;
        multiplicacion = 0;
        if(this.getNum2() != 0)
        {
            multiplicacion = this.getNum1() * this.getNum2();
        }
        return multiplicacion;
    }
    
    public int dividir()
    {
        int division;
        division = 0;
        if(this.getNum2() != 0)
        {
            division = this.getNum1() / this.getNum2();
        }
        return division;
    }
    
}
