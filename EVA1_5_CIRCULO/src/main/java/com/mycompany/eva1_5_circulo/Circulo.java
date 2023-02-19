/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_5_circulo;

/**
 *
 * @author KarimAP
 */
public class Circulo {

    private double Area;
    private double Perimetro;
    private double Radio;

    public Circulo() {
        Area = 0;
        Perimetro = 0;
        Radio = 0;
    }
    public Circulo(double area, double perimetro, double R) {
        Area = area;
        Perimetro = perimetro;
        Radio = R;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double valor) {
        Area = 3.1416 * Math.pow(Radio,2);
    }

    public double getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(double valor) {
        Perimetro = 2*Math.PI*Radio;
        
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double valor) {
        Radio = valor;
    }

    /*public void ImprimirDatos() {
        System.out.println("El area es: " +Area);
        System.out.println("El perimetro es: " +Perimetro);
        System.out.println("El radio es: " +Radio);
    }*/
}
