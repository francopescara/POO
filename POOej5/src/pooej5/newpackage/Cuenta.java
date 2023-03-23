/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5.newpackage;

/**
 *
 * @author franco
 */
public class Cuenta {

    private int numeroDeCuenta;
    private long DNI;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroDeCuenta, long DNI, int saldoActual) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroDeCuenta=" + numeroDeCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + '}';
    }

}
