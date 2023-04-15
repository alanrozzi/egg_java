/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por 
parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.

 */
package guide4_ej4;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide4_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in);
        int numeroIngresado;
        
        System.out.println("Ingrese un numero para saber si es primo o no");
        numeroIngresado = read.nextInt();
        
        System.out.println("Es primo?: " + EsPrimo(numeroIngresado));
        
        
    }
    
    public static boolean EsPrimo(int numero)
    {
        int contador = 0;
        boolean retorno = false;
        
        for (int i = numero; i > 0; i--)
        {
            if (numero%i==0)
            {
                contador ++;
            }
        }
        
        if (numero==1 || contador == 2)
        {
            retorno = true;
        }
        
        return retorno;
        
    }
    
    
}
