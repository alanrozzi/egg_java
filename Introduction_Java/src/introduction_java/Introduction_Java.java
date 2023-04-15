/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction_java;

//IDE -> entorno integrado de desarrollo
//Java is a compile lenguaje
//importa el Scanner, como el uso de 'Using' para utilizar librerias solo que para Clases
import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Introduction_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Data reader, Scanner object type, Java does not have a default input so community created it
        Scanner read = new Scanner(System.in); //System.in, keyboard inputs
        
        String name;
        
        //write a line in console, print line -> print l n
        System.out.println("Enter your name: ");
        
        //read an input (string) by keyboard 
        name = read.next();
        
        System.out.println("Your name: " + name);
        
        
        
        
        
    }
    
}
