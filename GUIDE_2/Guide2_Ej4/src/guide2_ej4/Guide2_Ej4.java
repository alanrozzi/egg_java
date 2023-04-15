/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide2_ej4;

import java.util.Scanner;



/**
 *
 * @author alanr
 */
public class Guide2_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        Scanner read = new Scanner(System.in); //System.in, keyboard inputs
        float gradosIngresados;
        float totalFaren;
        
        System.out.println("Ingrese cantidad de grados celsius: ");
        
        gradosIngresados = read.nextFloat();
        
        totalFaren = 32 + (9*gradosIngresados/5);
        
         System.out.println("Total Faren: " + totalFaren);
        
    }
    
}
