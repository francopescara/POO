/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej6.newpackage1;

import java.util.Scanner;
import pooej6.newpackage.Cafetera;

/**
 *
 * @author franco
 */
public class cafeteraServicios {

    Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {
        Cafetera r = new Cafetera();
        r.setCapacidadMaxima(10);
        r.setCantidadActual(5);

        return r;
    }

    public void llenarCafetera(Cafetera r) {
        /*Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.*/
        System.out.println("la cafetera en su estado actual: " + r.getCantidadActual());
        int llenado = -0;
        for (int i = r.getCantidadActual(); i < r.getCapacidadMaxima() + 1; i++) {
            llenado = i;
        }
        System.out.println("la cafetera una vez llenada: " + llenado);

        /*otro metodo para llenar
        public void llenarCafetera(Cafetera r){
        
        r.setCantidadActual(r.getCapacidadMaxima());
        r.setCantidadActual(r.getCapacidadMaxima());*/
    }

    public void servirTaza(Cafetera r) {
        /*Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.*/
        int taza = 2;
        if (r.getCantidadActual() < taza) {
            System.out.println("no alcanza para llenar la taza,su taza quedo llena hasta: " + r.getCantidadActual());
        } else if (r.getCantidadActual() >= taza) {
            System.out.println("la taza se lleno");
        }
    }
    public void vaciarCafetera(Cafetera r){
        /*Método vaciarCafetera(): pone la cantidad de café actual en cero.*/
        r.setCantidadActual(0);
    }
    public void agregarCafe(Cafetera r){
        /*Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
        int agregar;
        System.out.println("ingrese la cantidad de acafe a agregar");
        agregar=leer.nextInt();
        r.setCantidadActual(agregar);
        System.out.println("se agrego correctamente su cafe: "+r.getCantidadActual());
    }
}
