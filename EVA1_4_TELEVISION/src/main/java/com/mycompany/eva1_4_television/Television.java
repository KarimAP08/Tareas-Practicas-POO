/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_4_television;

/**
 *
 * @author KarimAP
 */
public class Television {

    //atributos: estado
    private boolean power;
    private int volumen;
    private int canales;
    //motodos: comportamiento
    //constructor: 

    public Television() {//Constructor
        power = false;//apagado
        volumen = 10;
        canales = 98;

    }

    public void cambiarpower() {
        if (power == false) {//apagado
            power = true;//encendemos la TV
            System.out.println("TELEVISION ENCENDIDA");
        } else {
            power = false;
            System.out.println("TELEVISION APAGADA");
        }
    }

    public void subirvolumen() {
        if (power == true) {
            if (volumen < 100) {
                volumen = volumen + 5;
                System.out.println("Volumen :" + volumen);
            }
        }
    }

    public void bajarvolumen() {
        if (power == true) {
            if (volumen > 0) {
                volumen = volumen - 5;
                System.out.println("Volumen :" + volumen);
            }
        }
    }

    public void Subircanal() {
        if (power == true) {
            if (canales < 100) {
                canales = canales + 1;
            } else {
                canales = 0;
            }
            System.out.println("Canal : " + canales);
        }

    }

    public void Bajarcanal() {
        if (power == true) {
            if (canales > 0) {
                canales = canales - 1;
            } else {
                canales = 100;
            }
            System.out.println("Canal : " + canales);
        }

    }
}
