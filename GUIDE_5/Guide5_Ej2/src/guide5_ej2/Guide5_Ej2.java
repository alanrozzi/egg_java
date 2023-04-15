/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide5_ej2;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide5_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
        //le pida al usuario un número a buscar en el vector. 
        //El programa mostrará dónde se encuentra el numero y si se encuentra repetido
        
        Scanner read = new Scanner(System.in);
         int [] numeros = new int[100];
         int numeroABuscar;
         
         llenarVectorAleatorio(numeros, 1);
        
        System.out.println("Ingrese un numero a buscar: ");
        numeroABuscar = read.nextInt();
        
        if (!esNumeroExistente(numeros, numeroABuscar))
        {
            System.out.println("No se encontro!");
        }
        
    }
    
    public static void llenarVectorAleatorio(int[] vector, int numeroMaximoPermitido){
        
        for (int i = 0; i < vector.length ; i++)     //filas
        {
            vector[i] = obtenerIntRandom(numeroMaximoPermitido);
        }
        
    }
    
    public static int obtenerIntRandom(int maximoSinIncluir) {
        return (int)(Math.random() * maximoSinIncluir);
    }       
    
    public static boolean esNumeroExistente (int[] vector, int numeroABuscar)
    {
        boolean encontro = false;
        
        for (int i = 0; i < vector.length; i++)
        {
            if (vector[i] == numeroABuscar)
            {
                encontro = true;
                System.out.println("Posicion: " + i);
            }
        }
        
        return encontro;
        
    }
    
}
