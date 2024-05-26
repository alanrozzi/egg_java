/*
 * 
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class ServicioAlumno {
    
    private Scanner read;
    private ArrayList<Alumno> alumnos;

    public ServicioAlumno() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList();
    }
    
    public void crearAlumnos()
    {
        String nombre;
        ArrayList<Integer> notas;
        String respuesta = "";
        
        do
        {   
            notas = new ArrayList();
            
            System.out.println("Ingrese el nombre del alumno: ");
            nombre = read.next();

            for (int i = 0; i < 3; i++)
            {
                System.out.println("Ingrese la nota " + (i+1));
                notas.add(agregarNota());
            }

            this.alumnos.add(new Alumno(nombre, notas));
            
            System.out.println("Alumno agregado, desea otro?: 's' / 'otro'");
            respuesta = read.next();
            
        } while (respuesta.equals("s"));
        
    }
    
    public Integer agregarNota()
    {
        int notaIngresada;
        
        do
        {   
            System.out.println("Ingrese nota valida: ");
            notaIngresada = read.nextInt();
            
        } while (notaIngresada < 0 || notaIngresada > 10);
        
        return notaIngresada;
        
    }
    
    public void calcularNotaFinal()
    {
        boolean encontro = false;
        System.out.println("Ingrese el nombre del alumno para su nota final: ");
        String nombre = read.next();
        
        for (int i = 0; i < alumnos.size(); i++)
        {
            Alumno alumno = alumnos.get(i);
            if(nombre.equals(alumno.getNombre()))
            {
                System.out.println("La nota final del alumno: " + alumno.getNombre() + "es: " + notaFinal(alumno));
                encontro = true;
                break;
            }
        }
        
        if(!encontro)
        {
            System.out.println("No se ha encontrado alumno");
        }
        
    }
       
    public float notaFinal(Alumno alumno)
    {
        int sumaNotas = 0;
        
        for (int i = 0; i < alumno.getNotas().size(); i++)
        {
            sumaNotas = sumaNotas + alumno.getNotas().get(i);
        }
        
        return (float) sumaNotas / alumno.getNotas().size();
    }
    
    public void mostrarAlumnos()
    {
         this.alumnos.forEach((a) -> System.out.println(a));
    }
    
    
}
