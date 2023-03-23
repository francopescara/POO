/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package pooej2;
import java.util.Scanner;
import pooej2.newpackage.Circunferencia;
import pooej2.servicios.serviciocircunferencia;
/**
 *
 * @author franco
 */
public class POOEJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        serviciocircunferencia p1= new serviciocircunferencia();
   Circunferencia r=p1.CrearCircunferencia();
   p1.CalcularArea(r);
   p1.CalcularPerimetro(r);
    }
    
}
