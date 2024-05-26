/*
 * 
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class ServicioPersona {
    
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private boolean[] sonMayores = new boolean[4];
    private int[] IMCs = new int[4];

    public boolean[] getSonMayores() {
        return sonMayores;
    }

    public void setSonMayores(boolean[] sonMayores) {
        this.sonMayores = sonMayores;
    }

    public int[] getIMCs() {
        return IMCs;
    }

    public void setIMCs(int[] IMCs) {
        this.IMCs = IMCs;
    }
    
    
    
    public Persona crearPersona()
    {
        String nombre;
        int edad;
        char genero;
        String generoLargo;
        double peso;
        double altura;
        
        System.out.println("Ingrese el nombre: ");
        nombre = read.next();
        
        System.out.println("Ingrese la edad: ");
        edad = read.nextInt();
        
        System.out.println("Ingrese el genero: H, M, O");
        generoLargo = read.next();
        do
        {
            switch (generoLargo)
            {
                case "H":
                case"h":
                    genero = 'H';
                    break;

                case "M":
                case"m":
                    genero = 'M';
                    break;

                case "O":
                case"o":
                    genero = 'O';
                    break;

                default:
                    genero = ' ';
                    System.out.println("Genero no correcto?");
            }
        } while (genero == ' ');
        
        
        System.out.println("Ingrese el peso: ");
        peso = read.nextDouble();
        
        System.out.println("Ingrese la altura: ");
        altura = read.nextDouble();
        
        return new Persona(nombre, edad, genero, peso, altura);
    }
    
    public boolean esMayorDeEdad(Persona p)
    {
        boolean esMayor = false;
        if(p.getEdad()>=18)
        {
            esMayor = true;
        }
        return esMayor;
    }
    
    public int calcularIMC(Persona p)
    {
        int retorno;
        double pesoIdeal = p.getPeso() / Math.pow(p.getAltura(), 2);
        if (pesoIdeal < 20)
        {
            retorno = -1;
            //System.out.println("Bajopeso!");
        }
        else
        {
            if(pesoIdeal >= 20 && pesoIdeal <= 25)
            {
                retorno = 0;
                //System.out.println("Peso ideal!");
            }
            else
            {
                retorno = 1;
                //System.out.println("Sobrepeso!");
            }
        }
        
        return retorno;
    }
    
    public void mostrarIMC(Persona p)
    {
        if (this.calcularIMC(p) == -1)
        {
            //retorno = -1;
            System.out.println("Bajopeso!");
        }
        if (this.calcularIMC(p) == 0)
        {
            //retorno = -1;
            System.out.println("Peso ideal!");
        }
        if (this.calcularIMC(p) == 1)
        {
            //retorno = -1;
            System.out.println("Sobrepeso!");
        }
    }
    
    public void mostrarMayorDeEdad(Persona p)
    {
       if(this.esMayorDeEdad(p))
        {
            System.out.println("Es mayor de edad!");
        }
        else
        {
            System.out.println("Es menor!");
        } 
    }
    
    public void agregarDatosMayorDeEdad(Persona p1, Persona p2, Persona p3, Persona p4)
    {
        sonMayores[0] = this.esMayorDeEdad(p1);
        sonMayores[1] = this.esMayorDeEdad(p2);
        sonMayores[2] = this.esMayorDeEdad(p3);
        sonMayores[3] = this.esMayorDeEdad(p4);
    }
    
    public void agregarDatosIMC(Persona p1, Persona p2, Persona p3, Persona p4)
    {
        IMCs[0] = this.calcularIMC(p1);
        IMCs[1] = this.calcularIMC(p2);
        IMCs[2] = this.calcularIMC(p3);
        IMCs[3] = this.calcularIMC(p4);
    }
    
    public void porcentajesIMC()
    {
        int cantidadSobrePeso=0, cantidadIdeal=0, cantidadBajoPeso=0;
        double porcentajeSobrePeso, porcentajeIdeal, porcentajeBajoPeso;
        
        for (int i = 0; i < this.IMCs.length; i++)
        {
            if(this.IMCs[i] == 1)
            {
                cantidadSobrePeso++;
            }
            if(this.IMCs[i] == 0)
            {
                cantidadIdeal++;
            }
            if(this.IMCs[i] == -1)
            {
                cantidadBajoPeso++;
            }
        }
        
        System.out.println("Porcentaje sobre peso: " + (double)(cantidadSobrePeso*100) / this.IMCs.length);
        System.out.println("Porcentaje ideal: " + (double)(cantidadIdeal*100) / this.IMCs.length);
        System.out.println("Porcentaje bajo peso: " + (double)(cantidadBajoPeso*100) / this.IMCs.length);
        
    }
    
    public void porcentajesEdad()
    {
        int cantidadMayor=0, cantidadMenor=0;
        double porcentajeMayor, porcentajeMenor;
        
        for (int i = 0; i < this.IMCs.length; i++)
        {
            if(this.sonMayores[i] == true)
            {
                cantidadMayor++;
            }
            else
            {
                cantidadMenor++;
            }
        }
        
        System.out.println("Porcentaje mayor: " + (double)(cantidadMayor*100) / this.IMCs.length);
        System.out.println("Porcentaje menor: " + (double)(cantidadMenor*100) / this.IMCs.length);
        
    }
    
}
