/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide3_ej3_extra;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide3_Ej3_EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
        //Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

        Scanner read = new Scanner(System.in);
        String letraIngresada;
        
        System.out.println("Ingrese una letra: ");
        letraIngresada = read.next();
        
        while (letraIngresada.length()!=1)
        {
              System.out.println("Ingrese una letra: ");
              letraIngresada = read.next();
        }
        
        
        
        
        System.out.println(letraIngresada);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
