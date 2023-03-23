/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5.servicios;

import java.util.Scanner;
import pooej5.newpackage.Cuenta;

/**
 *
 * @author franco
 */
public class cuentaServicios {

    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {
        Cuenta c = new Cuenta();
        System.out.println("ingrese numero de cuenta");
        c.setNumeroDeCuenta(leer.nextInt());
        System.out.println("ingrese su DNI");
        c.setDNI(leer.nextLong());
        System.out.println("ingrese su saldo actual");
        c.setSaldoActual(leer.nextInt());
        return c;
    }

    public void ingresar(Cuenta c) {
        double ingreso;
        System.out.println("ingrese cantidad");
        ingreso = leer.nextDouble();
        double sumaringreso = ingreso + c.getSaldoActual();
        System.out.println("su saldo actual es: " + sumaringreso);
    }

    public void retiro(Cuenta c) {
        /*Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.*/
        double retiro;
        System.out.println("ingrese cantidad de dinero a retirar");
        retiro = leer.nextInt();
        double restarRetiro = c.getSaldoActual() - retiro;
        if (c.getSaldoActual() == 0) {
            System.out.println("su saldo actual es 0");
        } else {
            System.out.println("su saldo actual es: " + restarRetiro);
        }

    }

    public void extraccionRapida(Cuenta c) {
        /*Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.*/
        double extraccion;
        extraccion = 20 * c.getSaldoActual() / 100;
        if (extraccion > extraccion) {
            System.out.println("no puede sacar mas del 20%");
        }
    }

    public void consultarSaldo(Cuenta c) {
        /*Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.*/
        double consultar = c.getSaldoActual();
    }

    public void consultarDatos(Cuenta c) {
        System.out.println(c);
    }
}
