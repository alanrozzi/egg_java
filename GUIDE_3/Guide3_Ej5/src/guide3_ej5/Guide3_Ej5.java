/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide3_ej5;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide3_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escriba un programa en el cual se ingrese un valor límite positivo, 
        //y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        
        Scanner read = new Scanner(System.in);
        
        int limite, sumaTotal;
        
        sumaTotal = 0;
        
        do
        {            
            System.out.println("Ingrese un limite positivo");
            
            limite = read.nextInt();
            
        } while (limite < 0);
        
       while(sumaTotal < limite)
       {
            System.out.println("Ingrese numero para sumar hasta " + limite);
            
            sumaTotal += read.nextInt();
       }
        
         System.out.println(sumaTotal + " SUPERO A " + limite);

    }
    
}
