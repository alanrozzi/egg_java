/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide3_.ej7_teoria;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide3_Ej7_Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*        Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos que se trata del tipo de motor de una bomba para mover fluidos).
        Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
        o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
        o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
        o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
        o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
        o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”*/

         Scanner read = new Scanner(System.in); //System.in, keyboard inputs
        int tipoMotor;
        
        System.out.println("Indique tipo de motor (1 - 4): ");
        tipoMotor = read.nextInt();
        
        //snippet -> sw - tab
        
        switch (tipoMotor) {
            case 1:
                System.out.println("Es bomba de agua.");
                break;
            case 2:
                System.out.println("Es bomba de gasolina.");
                break;
            case 3:
                System.out.println("Es bomba de hormigón.");
                break;
            case 4:
                System.out.println("Es bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("Tipo de motor inexistente");
                //break;
        }
        
    }
    
}
