/*
 * 
 */
package Servicios;

import Entidades.Cafetera;

/**
 *
 * @author alanr
 */
public class CafeteraServicio {
    
    public void llenarCafetera(Cafetera cafetera)
    {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera cafetera, int tamanioTaza)
    {
        if(tamanioTaza <= cafetera.getCantidadActual())
        {
            cafetera.setCantidadActual(cafetera.getCantidadActual()-tamanioTaza);
            System.out.println("Taza servida!");
        }
        else
        {
            System.out.println("Taza servida solo con " + cafetera.getCantidadActual() + "ml");
            this.vaciarCafetera(cafetera);
        }
    }
    
    public void vaciarCafetera(Cafetera cafetera)
    {
        cafetera.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera cafetera, int cantidadAgregar)
    {
        int cantidadTotal = cafetera.getCantidadActual()+cantidadAgregar;
        
        if(cantidadTotal >= cafetera.getCapacidadMaxima())
        {
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        }
        else
        {
             cafetera.setCantidadActual(cantidadTotal);
        } 
        
    }
    
}
