/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3.servicios;

import java.util.Scanner;
import pooej3.newpackage.Operacion;

/**
 *
 * @author franco
 */
public class OperacionServicio {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        Operacion r = new Operacion();
        System.out.println("ingrese el primer numero");
        r.setNumero1(leer.nextInt());
        System.out.println("ingrese el segundo numero");
        r.setNumero2(leer.nextInt());
        return r;
    }

    public void multiplicacion(Operacion r) {
        int multiplicacion = r.getNumero1() * r.getNumero2();
        if (r.getNumero1() == 0 || r.getNumero2() == 0) {
            System.out.println("no se permite multiplicacion por ceros");
        }
        System.out.println("la multiplicacion de los dos numeros es: "+multiplicacion);
    }
    public void division(Operacion r){
        int division=r.getNumero1()/r.getNumero2();
        if (r.getNumero1() == 0 || r.getNumero2() == 0) {
            System.out.println("no se permite division por ceros");
        }
        System.out.println("la division de los dos numeros es: "+division);
    }
    public void sumar(Operacion r){
        int sumar = r.getNumero1()+r.getNumero2();
        System.out.println("la suma de los dos numeros es: "+sumar);
    }
    public void restar(Operacion r){
        int restar=r.getNumero1()-r.getNumero2();
        System.out.println("la resta de los dos numeros es: "+restar);
    }
}
