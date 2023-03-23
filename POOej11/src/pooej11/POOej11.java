/*
 Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package pooej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class POOej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int dia,mes,anio;
        System.out.println("ingrese dia");
        dia=leer.nextInt();
        System.out.println("ingrese mes");
        mes=leer.nextInt();
        System.out.println("ingrese año");
        anio=leer.nextInt();
        anio=anio-1900;
        Date fecha=new Date(anio,mes,dia);
        Date fechaactual=new Date();
        
        
    }

   
    
}
