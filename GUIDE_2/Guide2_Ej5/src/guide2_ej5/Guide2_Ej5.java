/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide2_ej5;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide2_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
        //Nota: investigar la función Math.sqrt().

        Scanner read = new Scanner(System.in); //System.in, keyboard inputs
        double numeroIngresado;
        
        System.out.println("Ingrese un numero");
        numeroIngresado = read.nextDouble();
        
        System.out.println("");
        System.out.println("Doble: " + numeroIngresado*2);
        System.out.println("Triple: " + numeroIngresado*3);
        System.out.println("Raiz: " + Math.sqrt(numeroIngresado));
           
        
        
        
        
    }
    
}
