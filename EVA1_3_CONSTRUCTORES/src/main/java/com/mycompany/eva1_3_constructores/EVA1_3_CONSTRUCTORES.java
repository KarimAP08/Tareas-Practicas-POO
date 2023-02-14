/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva1_3_constructores;

/**
 *
 * @author KarimAP
 */
public class EVA1_3_CONSTRUCTORES {

    public static void main(String[] args) {
        //CLASE IDENTIFICADOR = new CONSTRUCTOR
        CuentaBancaria Cliente1 = new CuentaBancaria("Carlos Slim", 1000000, "100");
        /*Cliente1.setNombredelcliente("Ramon Armendaris");
        Cliente1.setNumerodecuenta("789678765512");
        Cliente1.setSaldo(5500.45);*/
        System.out.println("DATOS DEL CLIENTE");
        //Cliente1.Imprimirdatos();
        System.out.println(Cliente1.getNombredelcliente());
        System.out.println(Cliente1.getNumerodecuenta());
        System.out.println(Cliente1.getSaldo());
        CuentaBancaria Cliente2 = new CuentaBancaria("Ramon", 1233222, "144");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(Cliente2.getNombredelcliente());
        System.out.println(Cliente2.getNumerodecuenta());
        System.out.println(Cliente2.getSaldo());
        //Cliente2.Imprimirdatos();
    }
}
