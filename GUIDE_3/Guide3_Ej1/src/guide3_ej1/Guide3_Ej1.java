/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide3_ej1;

/**
 *
 * @author alanr
 */
public class Guide3_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un programa que dado un número determine si es par o impar.
        
        int numero = 3;
        
        System.out.print(numero + " ");
        
        if (numero%2 == 0)
        {
            System.out.println("Es par!");
        } else
        {
            System.out.println("Es impar!");
        }

    }
    
}
