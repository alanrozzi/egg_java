/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide2_ej2;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide2_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in); //System.in, keyboard inputs
        
        String nombre;
        
        //write a line in console, print line -> print l n
        System.out.println("Ingresa tu nombre: ");
        
        //read an input (string) by keyboard 
        nombre = read.next();
        
        System.out.println("Tu nombre es: " + nombre);
        
        
        
        
        
        
    }
    
}
