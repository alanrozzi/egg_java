/*
 * 
 */
package Entidades;

/**
 *
 * @author alanr
 */
public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    
    
    
    public void calcularAumento()
    {
        if(this.getEdad()>30)
        {
            this.setSalario(this.getSalario()*1.10);
        }
        else
        {
            this.setSalario(this.getSalario()*1.05);
        }
    }
    
}
