/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_califas;

/**
 *
 * @author KarimAP
 */
public class EVA1_11_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(calificaciones(71));
    }

    public static String calificaciones(int calif) {
        String califas = "";
        if (calif <= 70) {
            califas = "D";
        } else if (calif >= 91 && calif <= 100) {
            califas = "A";
        } else if (calif >= 81 && calif <= 90) {
            califas = "B";
        } else if (calif >= 71 && calif <= 80) {
            califas = "C";
        }
        return califas;
    }
}
