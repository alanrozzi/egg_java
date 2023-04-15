/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide5_ej3;

/**
 *
 * @author alanr
 */
public class Guide5_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Recorrer un vector de N enteros contabilizando cuántos 
        //números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

        int[] numeros = new int[10];
        
        
        //lleno
         llenarVectorAleatorio(numeros, 200);
        
         
         //recorro, puedo cambiarlo a un metodo para cantidad total de digitos (?
        mostrarCantidadDeCiertosDigitos(numeros, 1);
        mostrarCantidadDeCiertosDigitos(numeros, 2);
        mostrarCantidadDeCiertosDigitos(numeros, 3);
        mostrarCantidadDeCiertosDigitos(numeros, 4);
        mostrarCantidadDeCiertosDigitos(numeros, 5);
        
        
    }
    
     public static void mostrarCantidadDeCiertosDigitos(int[] vector, int cantidadDigitos){
        
         int contador = 0;
         
        for (int i = 0; i < vector.length ; i++)     //filas
        {
            if (obtenerCantidadDigitos(vector[i]) == cantidadDigitos )
            {
                //contador de un digito suma
                contador++;
            }
        }
        
         if (contador>0)
         {
             System.out.println("Cantidad de " + cantidadDigitos + " digitos es: " + contador);
         }
         else
         {
             System.out.println("No hay de " + cantidadDigitos +" digitos");
         }
         
        
    }
    
    
    
    
    
    
    
    
      ////////////////////  OBTENER CANTIDAD DIGITOS
    
    public static int obtenerCantidadDigitos(int numero) {
        
        int contador = 0;
        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }
        return contador;
    }
    
    ////////////////////  LLENAR ALEATORIO
    
    public static void llenarVectorAleatorio(int[] vector, int numeroMaximo){
        
        for (int i = 0; i < vector.length ; i++)     //filas
        {
            vector[i] = obtenerIntRandom(numeroMaximo);
        }
        
    }
    
    public static int obtenerIntRandom(int maximoSinIncluir) {
        return (int)(Math.random() * maximoSinIncluir);
    }    
    
    ///////////////////
    
    
}
