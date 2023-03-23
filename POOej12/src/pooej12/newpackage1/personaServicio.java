/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12.newpackage1;

import java.util.Date;
import java.util.Scanner;
import pooej12.newpackage.Persona;

/**
 *
 * @author franco
 */
public class personaServicio {
    Scanner leer=new Scanner(System.in);
    /*Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.*/
    public Persona crearPersona(){
        Persona r=new Persona();
        System.out.println("ingrese su nombre");
        String nombre=leer.next();
        System.out.println("ingrese dia de nacimiento");
        int dia=leer.nextInt();
        System.out.println("ingrese mes de su nacimiento");
        int mes=leer.nextInt()-1;
        System.out.println("ingrese año de su nacimiento");
        int anio=leer.nextInt()-1900;
        Date fecha=new Date();
        fecha.setDate(dia);
        fecha.setMonth(mes);
        fecha.setYear(anio);
        System.out.println(fecha);
        return new Persona(nombre, fecha);
    }
    /*Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.*/
    public void calcularEdad(Persona r){
        int calcular;
        
        Date fechaActual=new Date();
       calcular=fechaActual.getYear()-r.getFechaNacimiento().getYear();
        System.out.println("su edad es: "+calcular);
    }
    /*Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.*/
    public boolean menorQue(Persona r){
        int calcular;
        
        Date fechaActual=new Date();
       calcular=fechaActual.getYear()-r.getFechaNacimiento().getYear();
        System.out.println("ingrese edad");
        int edad=leer.nextInt();
        boolean menor = false;
        if(edad<calcular){
            menor=true;
        }else{
            
        }
        System.out.println(menor);
        return menor;
    }
}
