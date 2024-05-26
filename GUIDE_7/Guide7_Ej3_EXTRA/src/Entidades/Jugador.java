/*
 * 
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author alanr
 */
public class Jugador {
    
    private int numeroElegido;
    private int intentos;

    public Jugador() {
        intentos = 3;
    }

    public int getNumeroElegido() {
        return numeroElegido;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setNumeroElegido(int numeroElegido) {
        this.numeroElegido = numeroElegido;
    }
    
    public void elegirNumero()
    {
        Random rand = new Random();
        this.setNumeroElegido(rand.nextInt(11));
    }
    
    public void adivinar(int numeroParaAdivinar)
    {
        for (int i = 0; i < this.intentos; i++)
        {
            this.elegirNumero();
            
            if(this.getNumeroElegido() > numeroParaAdivinar)
            {
                System.out.println("ES MAS BAJO!");
            }
            else
            {
                if(this.getNumeroElegido() < numeroParaAdivinar)
                {
                    System.out.println("ES MAS ALTO!");
                }
                else
                {
                    System.out.println("ADIVINO");
                    break;
                }
            }
        }
    }
    
}
