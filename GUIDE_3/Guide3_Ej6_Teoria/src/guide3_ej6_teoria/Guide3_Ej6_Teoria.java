/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide3_ej6_teoria;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide3_Ej6_Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.

         Scanner read = new Scanner(System.in); //System.in, keyboard inputs
        int numero1, numero2;
        
        System.out.println("Ingrese dos numeros mayores o menores a 25");
        numero1 = read.nextInt();
        numero2 = read.nextInt();
        
        if (numero1 > 25)
        {
            System.out.println(numero1 + " es mayor a 25");
        }
         if (numero2 > 25)
        {
            System.out.println(numero2 + " es mayor a 25");
        }
                
    }
    
}
