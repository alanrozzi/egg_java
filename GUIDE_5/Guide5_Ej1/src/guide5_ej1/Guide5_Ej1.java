/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide5_ej1;

/**
 *
 * @author alanr
 */
public class Guide5_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
        
        int [] numeros = new int[100];
        
        //llena
        
        llenarVector(numeros);
        
        //muestra
        mostrarVectorAlRevez(numeros);
        
        
        
    }
    
     public static void llenarVector(int[] vector){
        
        for (int i = 0; i < vector.length ; i++)     //filas
        {
            vector[i] = i+1;
        }
        
    }
     
      public static void mostrarVectorAlRevez(int[] vector){
        
          /*
        for (int i = 0; i < vector.length ; i++)     //filas
        {
            vector[i] = i+1;
        }*/
          
          for (int i = vector.length-1; i >= 0 ; i--)     //filas
        {
            System.out.println("[ " + i + " ] -> " + vector[i]);
        }
        
    }
    
    
    
}
