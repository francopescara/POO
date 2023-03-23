/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2.servicios;

import java.util.Scanner;
import pooej2.newpackage.Circunferencia;

/**
 *
 * @author franco
 */
public class serviciocircunferencia {
    Scanner leer=new Scanner(System.in);
    public Circunferencia CrearCircunferencia(){
        Circunferencia r = new Circunferencia();
        System.out.println("ingrese el radio");
        r.setRadio(leer.nextDouble());
        
        return r;
    }
    public void CalcularArea(Circunferencia r){
        double area=Math.PI*Math.pow(r.getRadio(), 2);
        System.out.println("el area de la circunferencia es: "+area);
       } 
    public void CalcularPerimetro(Circunferencia r){
        double perimetro=2*Math.PI*r.getRadio();
        System.out.println("el perimetro de la circunferencia es: "+perimetro);
    }
}
