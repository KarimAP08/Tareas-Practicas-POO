/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_sobrecarga_areas;

/**
 *
 * @author invitado
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Circulo es igual: " + CalcularArea(5));
        System.out.println("Triangulo: " + CalcularArea(2, 5));
        System.out.println("Trapecio: " + CalcularArea(2, 5, 3));
    }

    public static double CalcularArea(double radio) {
        return Math.PI * (radio * radio);
    }

    public static double CalcularArea(double base, double altura) {
        return base * altura / 2;
    }

    public static double CalcularArea(double altura, double basem, double basema) {
        return altura * (basem + basema) / 2;
    }

}
