/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej9.newpackage1;

import pooej9.newpackage.Matematica;

/**
 *
 * @author franco
 */
public class MatematicaServicios {
    /*Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor*/
    public Matematica devolvermayor(Matematica m){
        System.out.println("el primer numero es: "+m.getNum1());
        System.out.println("el segundo numero es: "+m.getNum2());
        System.out.println("el numero mayor entre los dos numeros es: " +Math.max(m.getNum1(), m.getNum2()));
        return m;
    }
    /* Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.*/
    public void calcularPotencia(Matematica m){
        System.out.println("lo numeros sin redondear son: "+m.getNum1()+" /// "+m.getNum2());
        long redondear=  Math.round(m.getNum1());
       long redondear2= Math.round(m.getNum2());
        System.out.println("los numeros redondeados quedaron asi: "+redondear+" /// "+redondear2);
     long mayor= Math.max(redondear, redondear2);
      long menor=Math.min(redondear, redondear2);
        System.out.println("el numero redondeado mayor es: "+mayor);
        System.out.println("el numero redondeado menor es: "+menor);
      double elevar=  Math.pow(mayor,menor);
        System.out.println("la potencia del mayor valor de la clase elevado al menor número es: "+elevar);
    }
    /*Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
    public void calcularRaiz(Matematica m){
      double mayor= Math.max(m.getNum1(),m.getNum2());
      double menor=Math.min(m.getNum1(),m.getNum2());
     double absoluto =Math.abs(menor);
        System.out.println("el numero menor pasado a valor absoluto: "+absoluto);
     double raiz=Math.pow(absoluto,2);
        System.out.println("la raiz cuadrada del menor numero es: "+raiz);
    }
}

