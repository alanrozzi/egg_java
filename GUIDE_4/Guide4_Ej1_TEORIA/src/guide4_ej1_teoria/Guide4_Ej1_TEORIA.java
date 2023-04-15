/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide4_ej1_teoria;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide4_Ej1_TEORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner read = new Scanner(System.in);
        String fraseIngresada;
        
        System.out.println("Ingrese una frase para codificar: ");
        fraseIngresada = read.nextLine(); //toma el espacio como caracter, no como corte
        
        System.out.println(fraseIngresada);
        
        fraseIngresada =  CodificarFrase(fraseIngresada, "a", "@");
        fraseIngresada =  CodificarFrase(fraseIngresada, "e", "#");
        fraseIngresada =  CodificarFrase(fraseIngresada, "i", "$");
        fraseIngresada =  CodificarFrase(fraseIngresada, "o", "%");
       fraseIngresada =  CodificarFrase(fraseIngresada, "u", "*");
        
        System.out.println("");
        System.out.println(fraseIngresada);
        
    }
    
    public static String CodificarFrase (String fraseOriginal, String charOriginal, String charParaCambiar)
    {
        String fraseAuxiliar = "";
        
        for (int i = 0; i < fraseOriginal.length(); i++)
        {
            if (charOriginal.equals(fraseOriginal.substring(i, i+1)))
            {
                fraseAuxiliar = fraseAuxiliar.concat(charParaCambiar);
            }
            else
            {
                fraseAuxiliar = fraseAuxiliar.concat(fraseOriginal.substring(i, i+1));
            }
        }
        
        return fraseAuxiliar;
    }
    
    
}
