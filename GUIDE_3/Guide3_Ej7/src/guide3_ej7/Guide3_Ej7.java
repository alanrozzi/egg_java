/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide3_ej7;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide3_Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                
         Scanner read = new Scanner(System.in);
         
        String cadenaIngresada;
        int contadorCorrectas, contadorIncorrectas;
         
        contadorCorrectas=0;
        contadorIncorrectas=0;
        
         do
        {            
            
            System.out.println("Ingrese cadenas de la serie, para finalizar: &&&&&");
            
            cadenaIngresada = read.next();
            
            while (cadenaIngresada.length()!=5 || 
                   (!"&&&&&".equals(cadenaIngresada) &&
                    !"X".equals(cadenaIngresada.substring(0, 1)) && 
                    !"O".equals(cadenaIngresada.substring(   cadenaIngresada.length()-1,cadenaIngresada.length()   )      )      ) )
            {
                    contadorIncorrectas ++;
                    System.out.println("DEBE CORRESPONDER DE 5 CARACTERES, EMPEZAR CON 'X' Y TERMINAR CON 'O'");
            
                    cadenaIngresada = read.next();
            }
            
            contadorCorrectas ++;
            
        } while (!"&&&&&".equals(cadenaIngresada));
         
         System.out.println("Ingresos incorrectos: " + contadorIncorrectas);
         System.out.println("Ingresos correctos: " + (contadorCorrectas-1));
    }
    
}