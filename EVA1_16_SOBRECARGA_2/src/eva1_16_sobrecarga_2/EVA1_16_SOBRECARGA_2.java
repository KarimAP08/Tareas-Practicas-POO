/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_sobrecarga_2;

/**
 *
 * @author invitado
 */
public class EVA1_16_SOBRECARGA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //suma(int, int
        System.out.println("SUMA: " + suma(4, 9));
        System.out.println("SUMA: " + suma(2.5, 2.5));
        System.out.println("SUMA: " + suma("Hola ", "Mundo "));
        suma();
    }
    //SUMA DE 2 NUMERO ENTEROS

    public static int suma(int val1, int val2) {
        return val1 + val2;

    }
    //suma(double, double)
    public static double suma(double val1, double val2) {
        return val1 + val2;

    }
    //suma(String, String)
    public static String suma(String val1, String val2) {
        return val1 + val2;

    }
    public static void suma() {
        System.out.println("SUMA: sin argumentos");

    }

}
