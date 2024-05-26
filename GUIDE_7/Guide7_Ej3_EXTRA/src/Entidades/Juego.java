/*
 * 
 */
package Entidades;

/**
 *
 * @author alanr
 */
public class Juego {
    
    private Jugador jugador1;
    private Jugador jugador2;

    public Juego() {
        
        jugador1 = new Jugador();
        jugador2 = new Jugador();
        
    }
    
    public void iniciarJuego()
    {
        jugador1.elegirNumero();
        
        jugador2.adivinar(jugador1.getNumeroElegido());
    }
    
    
}
