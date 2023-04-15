/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guide3_ej8;

/**
 *
 * @author alanr
 */
public class Guide3_Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cantidad = 10;
        
        for (int i = 0; i < cantidad; i++)
        {
            for (int j = 0; j < cantidad; j++)
            {
                
                if(i>0 && i<cantidad-1 && j>0 && j<cantidad-1)
                {
                    System.out.print("   ");
                }
                else
                {
                    System.out.print(" * ");
                }
                
            }
            System.out.println(" ");
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
