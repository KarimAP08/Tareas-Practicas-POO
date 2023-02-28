/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author KarimAP
 */
public class ClaseC {

    public int publicC;
    int defaultC;
    private int privateC;

    //clases del mismo paquete
    public void prueba() {
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        //clase del paquete 2
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //clasef esta en otro paquete y es default, es invisible
        //ClaseF objF = new ClaseF();
    }

}

class ClaseD {

    public int publicD;
    int defaultD;
    private int privatD;
}
