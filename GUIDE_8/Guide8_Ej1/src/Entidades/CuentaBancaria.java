/*
 * 
 */
package Entidades;

/**
 *
 * @author alanr
 */
public class CuentaBancaria {
    
    private int numeroCuenta;
    private int dniCLiente;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, int dniCLiente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCLiente = dniCLiente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDniCLiente() {
        return dniCLiente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCLiente(int dniCLiente) {
        this.dniCLiente = dniCLiente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Datos de la cuenta bancaria: " + "\nNumero de cuenta = " + numeroCuenta + "\nDNI de cliente = " + dniCLiente + "\nSaldo disponible = " + saldoActual;
    }
    
    
    
}
