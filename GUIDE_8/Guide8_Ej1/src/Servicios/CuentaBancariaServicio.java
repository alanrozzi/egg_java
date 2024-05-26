/*
 * 
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author alanr
 */
public class CuentaBancariaServicio {
    
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta()
    {
        int numeroCuenta;
        int dniCLiente;
        double saldoActual;
        
        System.out.println("Ingrese numero de cuenta: ");
        numeroCuenta=read.nextInt();
        
        System.out.println("Ingrese DNI de cliente: ");
        dniCLiente=read.nextInt();
        
        System.out.println("Ingrese el saldo actual: ");
        saldoActual=read.nextDouble();
        
        return new CuentaBancaria(numeroCuenta, dniCLiente, saldoActual);
        
    }
    
    public void ingresarDinero(CuentaBancaria cuenta, double cantidadIngresar)
    {
        cuenta.setSaldoActual(cuenta.getSaldoActual()+cantidadIngresar);
    }
    
    public void retirarDinero(CuentaBancaria cuenta, double cantidadRetirar)
    {
        double saldoRestante = cuenta.getSaldoActual()-cantidadRetirar;
        
        if(saldoRestante > 0 || saldoRestante > cantidadRetirar)
        {
            cuenta.setSaldoActual(saldoRestante);
        }
        else
        {
            cuenta.setSaldoActual(0);
        }
        
    }
    
    public void extraccionRapida(CuentaBancaria cuenta)
    {
        cuenta.setSaldoActual(cuenta.getSaldoActual()*0.80);
    }
    
    public void consultaSaldo(CuentaBancaria cuenta)
    {
        System.out.println("El saldo actual del usuario es: " + cuenta.getSaldoActual());
    }
    
    public void consultaCuenta(CuentaBancaria cuenta)
    {
        System.out.println(cuenta.toString());
    }
        
}
