/*
 * 
 */
package Entidades;

/**
 *
 * @author alanr
 */
public class Cuenta {
    
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirarDinero(double cantidadARetirar)
    {
        double saldoRestante = this.getSaldo()-cantidadARetirar;
        if(saldoRestante > 0 || saldoRestante > cantidadARetirar)
        {
            this.setSaldo(saldoRestante);
            System.out.println("Saldo restante: " + this.getSaldo());
        }
        else
        {
            System.out.println("No se puede retirar mas dinero, saldo: " + this.getSaldo());
        }
    }
}
