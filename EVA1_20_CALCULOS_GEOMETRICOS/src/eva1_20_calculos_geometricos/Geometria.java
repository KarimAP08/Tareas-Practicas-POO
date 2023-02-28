/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_20_calculos_geometricos;

/**
 *
 * @author KarimAP
 */
public class Geometria {

    public static final double PI = 3.1416;
    //final: significado para las clases, significado distintos para variable
    //solo se puede asignar el valor una vez

    //perimetro de un circulo
    public static double calcularCircuPerimetro(double radio) {
        return PI * (radio * 2);
    }

    //area de un circulo
    public static double calcularAreaCirculo(double radio) {
        return PI * (radio * radio);
    }

    public static double VolumenEsfera(double radio) {
        return (4.0 / 3.0) * (PI * (radio * radio * radio));
    }
}
