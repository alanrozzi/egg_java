/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package guide5_ej4;

/**
 *
 * @author alanr
 */
public class Guide5_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] numeros = new int[4][4];
        
        llenarMatrizAleatorio(numeros, 20);
        
        mostrarMatriz(numeros);
        
        System.out.println("");
        
        mostrarMatrizTranspuesta(numeros);
        
        
    }
    
    ////////////////////  LLENAR ALEATORIO
    
     public static void llenarMatrizAleatorio(int[][] matriz, int numeroMaximo){
        
                                //fila 0 de la matriz la cantidad
        for (int i = 0; i < matriz[0].length ; i++)     //filas
        {
            for (int j = 0; j < matriz[0].length; j++)
            {
                matriz[i][j] = obtenerIntRandom(numeroMaximo);
            }
            
        }
        
    }
    
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
    
    public static void mostrarMatriz(int[][] matriz){
        
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
    
    public static void mostrarMatrizTranspuesta(int[][] matriz){
        
                                //fila 0 de la matriz la cantidad
        for (int i = 0; i < matriz[0].length ; i++)     //filas
        {
            for (int j = 0; j < matriz[0].length; j++)
            {
                System.out.print("[ " + matriz[j][i] +" ]");
            }
            System.out.println("");
        }
        
    }
    
}
