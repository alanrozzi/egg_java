/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide3_ej6;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide3_Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner read = new Scanner(System.in);
         
         int numero1, numero2, respuesta;
        String respuestaSalir = "n";
         
         do
        {            
            System.out.println("Ingrese dos numero enteros POSITIVOS");
            
            numero1 = read.nextInt();
            numero2 = read.nextInt();
            
        } while (numero1 < 0 || numero2 < 0);
         
         do
        {            
            //Menu
             System.out.println("Menu: \n" + 
                                        "1. Sumar\n" +
                                        "2. Restar\n" +
                                        "3. Multiplicar\n" +
                                        "4. Dividir\n" +
                                        "5. Salir\n" +
                                        "Opcion: ");
             
             respuesta = read.nextInt();
            
             switch (respuesta)
            {
                case 1:
                    System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + (numero1+numero2));
                    break;
                    
                case 2:
                    System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + (numero1-numero2));
                    break;
                    
                case 3:
                    System.out.println("Multiplicacion: " + numero1 + " * " + numero2 + " = " + (numero1*numero2));
                    break;
                    
                case 4:
                    System.out.println("Division: " + numero1 + " / " + numero2 + " = " + (numero1/numero2));
                    break;
                    
                case 5:
                            System.out.println("Desea salir? S (si) otro (no)");
                            respuestaSalir = read.next();
                    break;
                    
            }
            
        } while (respuesta != 5 || !"S".equals(respuestaSalir));
         
         
         
         

    }
    
}
