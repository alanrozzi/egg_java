/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide3_ej3;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide3_Ej3 {

    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
        Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        */
        Scanner read = new Scanner(System.in); //System.in, keyboard inputs
        String frase;

        System.out.println("Ingrese una frase");
        frase = read.nextLine(); //toma hasta el salto de linea
        
        System.out.println("");
        System.out.println("min: " + frase.toLowerCase());
        System.out.println("MAY: " + frase.toUpperCase());

        


        
        
    }
    
}
