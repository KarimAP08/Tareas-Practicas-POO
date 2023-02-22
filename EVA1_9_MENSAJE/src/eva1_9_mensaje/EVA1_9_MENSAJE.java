/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_mensaje;

/**
 *
 * @author KarimAP
 */
public class EVA1_9_MENSAJE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nPrintln("Hola", 5);//llamada a funcion
    }
    public static void nPrintln(String message, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
    
}
