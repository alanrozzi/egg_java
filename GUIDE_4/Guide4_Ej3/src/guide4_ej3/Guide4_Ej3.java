/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package guide4_ej3;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide4_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in);
        
        String moneda;
        float cantidadEuros;
        
        System.out.println("Ingrese cantidad de euros y moneda -> yenes / dolares / libras");
        cantidadEuros = read.nextFloat();
        moneda = read.next();
        
        ConvertirMoneda(cantidadEuros, moneda);
        
    }
    
    public static void ConvertirMoneda(float cantidadEuros, String monedaAConvertir)
    {
        switch (monedaAConvertir)
        {
            case "dolares":
                System.out.println("Para " + cantidadEuros + "€ equivalen " + cantidadEuros*1.28611 + " dolares.");
                break;
                
            case "yenes":
                System.out.println("Para " + cantidadEuros + "€ equivalen " + cantidadEuros*129.852 + " yenes.");
                break;
                
           case "libras":
               System.out.println("Para " + cantidadEuros + "€ equivalen " + cantidadEuros*0.86 + " libras.");
                break; 
                
            default:
                System.out.println("No es conversor valido");
        }
    }
    
    
}
