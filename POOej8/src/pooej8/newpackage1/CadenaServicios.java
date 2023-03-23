/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej8.newpackage1;

import java.util.Scanner;
import pooej8.newpackage.Cadena;

/**
 *
 * @author franco
 */
public class CadenaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.*/
    public Cadena mostrarVocales(Cadena r) {
        int cont = 0;
        for (int i = 0; i < r.getLenght(); i++) {
            if (r.getFrase().charAt(i) == 'a' || r.getFrase().charAt(i) == 'e' || r.getFrase().charAt(i) == 'i' || r.getFrase().charAt(i) == 'o' || r.getFrase().charAt(i) == 'u') {
                cont++;
            }
        }
        System.out.println("la cantidad de vocales que hay en la frase es: " + cont);
        return r;
    }

    /*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    public void invertirFrase(Cadena r) {
        String invertir = "";
        for (int i = r.getLenght() - 1; i >= 0; i--) {
            char actual = r.getFrase().charAt(i);
            invertir = invertir + actual;
        }
        System.out.println("la frase invertida queda asi: " + invertir);
    }

    /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    public void vecesRepetido(Cadena r) {
        System.out.println("ingrese un caracter");
        String letra = leer.next();
        int cont = 0;
        for (int i = 0; i < r.getLenght(); i++) {
            char repetir = letra.charAt(0);
            if (r.getFrase().charAt(i) == repetir) {
                cont++;
            }

        }
        System.out.println("el caracter ingresado se repite: " + cont);
    }
    /*Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(Cadena r){
        System.out.println("ingrese una frase");
        String frase=leer.next();
        int longitud=r.getLenght();
        int longitud2=frase.length();
        System.out.println("la longitud de la frase principal es de: "+longitud);
        System.out.println("la longitud de la segunda frase es de: "+longitud2);
    }
    /*Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    public void unirFrases(Cadena r){
        System.out.println("ingrese una frase");
        String frase=leer.next();
        System.out.println("la frase unida queda asi: "+r.getFrase()+" "+ frase);
    }
    /*Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.*/
    public void reemplazar(Cadena r){
        
        System.out.println("Ingrese el caracter por el que reemplazar");
        String cFrase = leer.next();

        String nuevaFrase = r.getFrase().replaceAll("a", cFrase);
        System.out.println(nuevaFrase);
    }
    
    
}
