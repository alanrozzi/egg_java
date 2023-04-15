/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria_arreglos;

/**
 *
 * @author alanr
 */
public class Teoria_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración y creación de un Vector
                //tipo[ ] arregloV = new tipo[Tamaño];
        //Declaración y creación de una Matriz
                //tipo[ ][ ] arregloM = new tipo[Filas][Columnas];
                //arregloM = { {1,2,3}, {2,3,4} }
                                        //fila      //fila



        //Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo 
        //y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.

        String[] arrayCompanieros = new String[10];
        
        
       //Asignación de un Vector
                 //vector[0] = 5;
        //Asignación de una Matriz
                 //matriz[0][0] = 6;

        //Asignación de una Matriz
        for (int i = 0; i < 3; i++)     //filas
        {
            for (int j = 0; j < 3; j++) //columnas
            {
                  //matriz[ i ][ j ] = 6;
            }
        }


        //Llenar de una Matriz
                           //cardinalidad, saca la cantidad de elementos de una fila
        //for (int i = 0; i < matriz[0].lenght; i++)     //filas
        {                            
            //for (int j = 0; j < 3; j++) //columnas
            {
                  //matriz[ i ][ j ] = 6;
            }
        }

        //Mostrar matriz
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {

                //System.out.print("[" + matriz[i][j] + "]");  

            }
            
            //System.out.println("");
        }

        
        
    }
    
    //subprogramas pa mostrar y llenar
    
    public static void llenarVector(int[] vector){
        
        
    }
    
    
    
public static void mostrarMatriz(int[][] matriz){
    
    
    
    }

//Se puede devolver matrices en subprogs

public static int[] devolverVector(){
    int[] vector = new int[5];
    return vector;
}
    
    
}
