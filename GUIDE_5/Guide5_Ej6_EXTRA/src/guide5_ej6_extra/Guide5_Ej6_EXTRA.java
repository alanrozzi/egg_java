/*
    Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación 
de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.

Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java substring(), Length() y Math.random().


 */
package guide5_ej6_extra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide5_Ej6_EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        char[][] sopaDeLetras = new char[20][20];
        
         //usa ascii para llenar de char la matriz
       // llenarMatrizAleatorioChar(sopaDeLetras, 20, 20);
        llenarMatriz(sopaDeLetras, 20, 20);
        
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Ingrese 5 palabras de 3 a 5 caracteres: ");
            String palabraIngresada;
             
            do
            {            
                 System.out.println("Palabra: " + (i+1));
                 palabraIngresada = read.nextLine();
                 
            } while (!(palabraIngresada.length()>=3 && palabraIngresada.length()<=5) );
            
            //sale, tiene una palabra y la coloca en la matriz
            
            colocarPalabraEnMatriz(sopaDeLetras, 20, 20, palabraIngresada);
            
        
        }
        
        
       
        mostrarMatriz(sopaDeLetras);
        
    }
    
    
    ///////////////
    
     public static void llenarMatriz(char[][] matriz, int filas, int columnas){
        
                                //fila 0 de la matriz la cantidad
        for (int i = 0; i < filas ; i++)     //filas
        {
            for (int j = 0; j < columnas; j++)  //columnnas
            {
                matriz[i][j] = ' ';
            }
            
        }
        
    }
    
    public static void llenarMatrizAleatorioChar(char[][] matriz, int filas, int columnas){
        
                                //fila 0 de la matriz la cantidad
        for (int i = 0; i < filas ; i++)     //filas
        {
            for (int j = 0; j < columnas; j++)  //columnnas
            {
                matriz[i][j] = (char)obtenerIntRandom(48, 57);
            }
            
        }
        
    }
    
    //usando obj Random
     public static int obtenerIntRandom(int minimo, int maximoSinIncluir)
     {
        Random rand = new Random();           //+1 hace que incluya el maximo
        int randomNum = rand.nextInt((maximoSinIncluir - minimo) + 1) + minimo;
        return randomNum;
    }
    
    public static void colocarPalabraEnMatriz(char[][] matriz,  int filas, int columnas, String palabra)
    {
        Random rand = new Random(); 
        
        //colocar la palabra en una fila random
        int filaRandom = rand.nextInt(filas);
        
        for (int i = 0; i < palabra.length(); i++)
        {
            matriz[filaRandom][i] = palabra.charAt(i);
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void mostrarMatriz(char[][] matriz){
        
                                //fila 0 de la matriz la cantidad
        for (int i = 0; i < matriz[0].length ; i++)     //filas
        {
            for (int j = 0; j < matriz[0].length; j++)
            {
                System.out.print("[ " + matriz[i][j] +" ]");
            }
            System.out.println("");
        }
        
    }
    
    
     
    
    public static void llenarVectorAleatorio(int[] vector, int numeroMaximo){
        
        for (int i = 0; i < vector.length ; i++)     //filas
        {
            vector[i] = obtenerIntRandom(numeroMaximo);
        }
        
    }
    
    public static int obtenerIntRandom(int maximoSinIncluir) {
        
        Random rand = new Random();
        return rand.nextInt(maximoSinIncluir);
        
        //return (int)(Math.random() * maximoSinIncluir);
    }   
    
   
    
    public static void llenarVectorPalabra(char[] vector, String palabra){
        
        for (int i = 0; i < vector.length ; i++)     //filas
        {
            vector[i] = palabra.charAt(i);
        }
        
    }
    
    
    public static void mostrarVector(int[] vector){
        
                                //fila 0 de la matriz la cantidad
        for (int i = 0; i < vector.length ; i++)     //filas
        {
                System.out.print("[ " + vector[i] +" ]");
        }
        
    }
    
}
