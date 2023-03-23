/*
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.

Clase Date
 */
package pooej10;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class POOej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double[] vector = new double [50];
        double [] vector2=new double [20];
       for(int i=0;i<vector.length;i++){
        vector[i]=Math.random()*100;
        }
        for(int i=0;i<50;i++){
        System.out.println("["+ vector[i] +"]");
        }
        System.out.println("");
       for(int i=0;i<10;i++){
           Arrays.fill(vector2, i, i+1, vector[i]);
       }
       Arrays.fill(vector2, 10, 20,0.5);
            Arrays.sort(vector);
          System.out.println("los numeros oredenado de menor a mayor queda asi: "+ Arrays.toString(vector));
        System.out.println("el arreglo combinado queda asi: "+Arrays.toString(vector2));
    }
    
    
}
