/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2.newpackage;

/**
 *
 * @author franco
 */
public class Circunferencia {
    private double radio;
    private double area;
    private double perimetro;
    public Circunferencia(){
        }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    

    

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
}
 
