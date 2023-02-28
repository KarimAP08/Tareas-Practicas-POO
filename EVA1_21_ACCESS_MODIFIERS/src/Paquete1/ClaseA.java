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
public class ClaseA {

    //todas estas clases estan en paquete 1, en el mismo paquete, public y default son visibles
    public int publicA;
    int defaultA;
    private int privateA;

    public void prueba() {
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;

        ClaseC objC = new ClaseC();
        //objC.publicC;
        //objC.defaultC;

        ClaseD objD = new ClaseD();
        //objD.publicD;
        //objD.defaultD;
        //clases de paquete 2 
        //todo lo que sea default es ahora invisible
        ClaseE objE = new ClaseE();
        //objE.publicE;
        //claseF es default, y no es visible en otro paquete
        //ClaseF objF = new ClaseF();

    }
}

class ClaseB {

    public int publicB;
    int defaultB;
    private int privateB;
}
