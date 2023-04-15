/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide3_ej1_extra;

import static java.lang.Math.round;

/**
 *
 * @author alanr
 */
public class Guide3_Ej1_EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Dado un tiempo en minutos, calcular su equivalente en días y horas. 
        //Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

        
        
        int minutos, dias, horas;
        
        minutos = 3200;
        
        horas = round(minutos / 60);
        
        dias = round(horas / 24);
        
         System.out.println(dias + " dias, " + (horas-round(dias*24)) + " horas.");
        
        
        
    }
    
}
