/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide4_ej2;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide4_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las 
       //personas ingresadas por teclado e indique si son mayores o menores de edad. 
       //Después de cada persona, el programa debe preguntarle al usuario si quiere 
       //seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

       Scanner read = new Scanner(System.in);
       
       String respuesta;
       String nombre;
       int edad;
      
        do
        {
            
            System.out.println("Ingrese nombre y edad de la persona: ");
            nombre = read.next();
            edad = read.nextInt();
            
            ImprimirPersona(nombre, edad);
            
            System.out.println("Desea continuar?: 'No' para parar, otro para seguir: ");
            respuesta = read.next();
            
        } while (!"No".equals(respuesta));
        
        System.out.println("Gracias! Nos vemos");
       
        
    }
    
    public static void ImprimirPersona(String nombre, int edad)
    {
        System.out.print("Nombre: " + nombre + ". Edad: " + edad + " anios.");
        if(edad > 17)
        {
            System.out.println(" Es mayor de edad.");
        }
        else
        {
            System.out.println("");
        }
        
    }
    
}
