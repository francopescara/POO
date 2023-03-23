/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package pooej9;

import java.util.Scanner;
import pooej9.newpackage.Matematica;
import pooej9.newpackage1.MatematicaServicios;

/**
 *
 * @author franco
 */
public class POOej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        MatematicaServicios r=new MatematicaServicios();
        Matematica m=new Matematica();
        System.out.println("-------------------------------------");
        m.setNum1(Math.random()*100);
        m.setNum2(Math.random()*100);
        System.out.println("-------------------------------------");
        r.devolvermayor(m);
        System.out.println("-------------------------------------");
        r.calcularPotencia(m);
        System.out.println("-------------------------------------");
        r.calcularRaiz(m);
    }
   
    
}
