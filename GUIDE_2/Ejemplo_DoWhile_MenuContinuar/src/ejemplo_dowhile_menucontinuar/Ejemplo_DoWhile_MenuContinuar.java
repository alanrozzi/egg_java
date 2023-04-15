/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_dowhile_menucontinuar;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Ejemplo_DoWhile_MenuContinuar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        String respuesta;

        do {

              System.out.println("Desea continuar?");
              respuesta = leer.nextLine();

        } while (respuesta.equalsIgnoreCase("S"));

    }
    
}
