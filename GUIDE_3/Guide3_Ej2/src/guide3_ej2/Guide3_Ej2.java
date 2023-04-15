/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide3_ej2;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide3_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
        //pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
        
        Scanner read = new Scanner(System.in);
        String frase;
        
        frase = read.nextLine();

        if (frase.equals("eureka"))
        {
            System.out.println("Correcto!");
        } else
        {
            System.out.println("Incorrecto!");
        }
        
        

    }
    
}
