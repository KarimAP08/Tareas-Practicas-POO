/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_static;

/**
 *
 * @author KarimAP
 */
public class EVA1_18_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj = new Prueba();
        obj.mensaje();
        Prueba.mensajeEstatico();
        System.out.println("PI: " +Math.PI);

    }

}

class Prueba {

    public void mensaje() {//SOLO AL CREAR OBJETOS
        System.out.println("Hola");
    }

    public static void mensajeEstatico() {//DIRECTAMENTE DE LA CLASE
        System.out.println("Hola (estatico)");
    }
}

class Otra {
}
