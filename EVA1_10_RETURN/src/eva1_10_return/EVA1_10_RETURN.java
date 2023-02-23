/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_return;

/**
 *
 * @author KarimAP
 */
public class EVA1_10_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        square(10);
        int resu;
        resu = square(5);
        System.out.println(resu);
    }

    public static int square(int num) {
        return num * num;
    }
}
