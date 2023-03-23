/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej7.newpackage1;

import java.util.Scanner;
import pooej7.newpackage.Persona;

/**
 *
 * @author franco
 */
public class PersonaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje*/
    public Persona crearPersona(){
        Persona r = new Persona();
        System.out.println("ingresa el nombre");
        r.setNombre(leer.next());
        System.out.println("ingresa la edad");
        r.setEdad(leer.nextInt());

        System.out.println("ingresa el sexo h,m, o(otros)");
        r.setSexo(leer.next());

        System.out.println("ingresa la altura");
        r.setAltura(leer.nextDouble());
        System.out.println("ingresa el peso");
        r.setPeso(leer.nextDouble());
        return new Persona();

    }

    /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.*/
    public int calcularIMC(Persona r) {
        int calcular;
        calcular = (int) (r.getPeso() / Math.pow(r.getAltura(), 2));
        System.out.println(calcular);
        if ((calcular >= 20 && calcular <= 25)) {
            System.out.println("peso ideal");
            calcular = 0;
        } else if (calcular < 20) {
            System.out.println("debajo del peso ideal");
            calcular = -1;
        } else if (calcular > 25) {

            System.out.println("sobrepeso");
            calcular = 1;
        }
        return calcular;
    }

    /* esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano*/
    public boolean esMayorDeEdad(Persona r) {
        boolean esMayor = false;

        if (r.getEdad() > 18) {
            System.out.println("es mayor de edad");
            esMayor = true;

        } else {
            System.out.println("es menor de edad");

        }
        return esMayor;
    }

}
