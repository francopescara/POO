/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4.servicios;

import java.util.Scanner;
import pooej4.newpackage.Rectangulo;

/**
 *
 * @author franco
 */
public class RectanguloServicios {
    Scanner leer=new Scanner(System.in);
    public Rectangulo crearRectangulo(){
        Rectangulo r=new Rectangulo();
        System.out.println("ingrese la base del rectangulo");
        r.setBase(leer.nextInt());
        System.out.println("ingrese la altura del rectangulo");
        r.setAltura(leer.nextInt());
        return r;
    }
    public void calcularSuperficie(Rectangulo r){
        int superficie=r.getBase()*r.getAltura();
    }
    public void calcularPerimetro(Rectangulo r){
        int perimetro=(r.getBase()+r.getAltura())*2;
    }
    public void dibujarRectangulo(Rectangulo r){
         for(int i=0;i<r.getBase();i++){
            System.out.print("*");
        }
        System.out.println("");
        for(int i=0;i<r.getAltura()-2;i++){
            System.out.print("*");
            for(int j=0;j<r.getBase()-2;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=0;i<r.getBase();i++){
            System.out.print("*");
        }
            
        }
        
    
}
