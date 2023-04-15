/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide2_ej1;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide2_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma */
        
        Scanner read = new Scanner(System.in);
        
        int numIngresado1, numIngresado2, sumaTotal;
                
        System.out.println("Ingrese dos numeros");
        numIngresado1 = read.nextInt();
        numIngresado2 = read.nextInt();
        
        sumaTotal = numIngresado1 + numIngresado2;
        
        System.out.println("La suma total de " + numIngresado1 + " y " + numIngresado2 + " es: " + sumaTotal);
        
        
        
        
        
        
        
        
        
        
    }
    
}
