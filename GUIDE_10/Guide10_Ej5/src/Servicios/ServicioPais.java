/*
 * 
 */
package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class ServicioPais {
    
    private Scanner read;
    private HashSet<String> paises;

    public ServicioPais() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.paises = new HashSet();
    }
//    
//    El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//los servicios en la clase correspondiente)
    
    private String crearPais()
    {
        System.out.println("Ingrese el nombre del pais: ");
        return read.next();
    }
    
    public void agregarPaises()
    {
        String respuesta = "";
        
        do
        {
            this.paises.add(crearPais());
            
            System.out.println("Pais agregado, desea otro?: 's' / 'otro'");
            respuesta = read.next();
            
        } while (respuesta.equals("s"));
        
    }
    
    public void mostrarPaises()
    {
        //Ordena temporalmente, es solo de un critero, en este caso de String ASC los HASHSET NO SE PUEDEN ORDENAR
        ArrayList<String> sortedPaises = new ArrayList<>(paises);
        Collections.sort(sortedPaises);
       
        sortedPaises.forEach((pais) -> System.out.println(pais));
    }
//    
//    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.
    
    public void eliminarPais()
    {
        boolean eliminado = false;
        String paisEliminar;
        Iterator itPaises = paises.iterator();
        
        System.out.println("\n// [ELIMINAR] //");
        System.out.println("Ingrese el nombre del pais a eliminar: ");
        paisEliminar = read.next();
        
        //Usar iterator
        while (itPaises.hasNext())
        {            
            String aux = itPaises.next().toString();
            if (aux.equals(paisEliminar))
            {
                System.out.println("Se elimino el pais: " + paisEliminar);
                itPaises.remove();
                eliminado = true;
                break;
            }
        }
        
        if (!eliminado)
        {
            System.out.println("El pais no fue encontrado para eliminar");
        }
        
    }
    
}