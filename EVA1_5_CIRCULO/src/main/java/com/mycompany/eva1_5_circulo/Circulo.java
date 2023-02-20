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
        Radio = 0;
    }
    public Circulo(double R) {
        Radio = R;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double valor) {
        Radio = valor;
    }
    public double CalcularArea(){
        Area = 3.1416 * Math.pow(Radio,2);
        return Area;
    }
    public double CalcularPerimetro(){
        Perimetro = 2*Math.PI*Radio;
        return Perimetro;
    }

    /*public void ImprimirDatos() {
        System.out.println("El area es: " +Area);
        System.out.println("El perimetro es: " +Perimetro);
        System.out.println("El radio es: " +Radio);
    }*/
}
