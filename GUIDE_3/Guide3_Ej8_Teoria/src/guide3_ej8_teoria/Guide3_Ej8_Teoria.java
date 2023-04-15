/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide3_ej8_teoria;

import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class Guide3_Ej8_Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/
        Scanner read = new Scanner(System.in); //System.in, keyboard inputs
        int nota;

        System.out.println("Nota: ");
        nota = read.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota Incorrecta, reingrese: ");
            nota = read.nextInt();
        }
        System.out.println("Nota: " + nota);

    }

}
