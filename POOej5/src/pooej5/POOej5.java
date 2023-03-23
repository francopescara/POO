/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package pooej5;

import pooej5.newpackage.Cuenta;
import pooej5.servicios.cuentaServicios;

/**
 *
 * @author franco
 */
public class POOej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cuentaServicios o = new cuentaServicios();
        Cuenta c = o.crearCuenta();
        o.ingresar(c);
        o.extraccionRapida(c);
        o.retiro(c);
        o.consultarDatos(c);
        o.consultarSaldo(c);

    }

}
