/*
 Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package pooej7;

import pooej7.newpackage.Persona;
import pooej7.newpackage1.PersonaServicios;

/**
 *
 * @author franco
 */
public class POOej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicios p1 = new PersonaServicios();
        Persona r = p1.crearPersona();
        p1.calcularIMC(r);
        p1.esMayorDeEdad(r);
       /* Persona r2 = p1.crearPersona();
        p1.calcularIMC(r2);
        p1.esMayorDeEdad(r2);
        Persona r3 = p1.crearPersona();
        p1.calcularIMC(r3);
        p1.esMayorDeEdad(r3);
        Persona r4 = p1.crearPersona();
        p1.calcularIMC(r4);
        p1.esMayorDeEdad(r4);*/
        int[] imc = new int[4];
        imc[0] = p1.calcularIMC(r);
        /*imc[1] = p1.calcularIMC(r2);
        imc[2] = p1.calcularIMC(r3);
        imc[3] = p1.calcularIMC(r4);*/
        double contbajo, contideal, contalto;
        contbajo = 0;
        contideal = 0;
        contalto = 0;

        for (int i = 0; i < 4; i++) {
            switch (imc[i]) {
                case -1:
                    contbajo++;
                    break;
                case 0:
                    contideal++;
                    break;
                case 1:
                    contalto++;
                    break;
            }
        }

        System.out.println("");
        System.out.println("El porcentaje de personas por debajo de su peso ideal es: " + (contbajo / 4 * 100) + "%");
        System.out.println("El porcentaje de personas en su peso ideal es: " + (contideal / 4 * 100) + "%");
        System.out.println("El porcentaje de personas por encima de su peso ideal es: " + (contalto / 4 * 100) + "%");

        boolean ed1 = p1.esMayorDeEdad(r);
        /*boolean ed2 = p1.esMayorDeEdad(r2);
        boolean ed3 = p1.esMayorDeEdad(r3);
        boolean ed4 = p1.esMayorDeEdad(r4);*/
        double mayor, menor;
        mayor = 0;
        menor = 0;
        if (ed1 == true ) {
            mayor++;
        } else {
            menor++;
        }
       /* if (ed2 == true ) {
            mayor++;
        } else {
            menor++;
        }
        if (ed3 == true ) {
            mayor++;
        } else {
            menor++;
        }
        if (ed4 == true ) {
            mayor++;
        } else {
            menor++;
        }*/
        System.out.println("El porcentaje de personas mayores es: " + (mayor / 4 * 100) + "%");
        System.out.println("El porcentaje de personas menor es: " + (menor / 4 * 100) + "%");
    }
}
