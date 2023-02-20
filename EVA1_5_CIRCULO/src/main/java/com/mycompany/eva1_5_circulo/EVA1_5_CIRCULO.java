/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_circulo;

/**
 *
 * @author KarimAP
 */
public class EVA1_5_CIRCULO {

    public static void main(String[] args) {
        Circulo Class1 = new Circulo(12);
        System.out.println("El area es: " +Class1.CalcularArea());
        System.out.println("El Perimetro: " +Class1.CalcularPerimetro());
        System.out.println("El Radio es: " +Class1.getRadio()); 
        //Class1.ImprimirDatos();
    }
}
