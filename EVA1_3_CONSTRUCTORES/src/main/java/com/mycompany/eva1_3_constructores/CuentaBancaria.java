/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_3_constructores;

/**
 *
 * @author KarimAP
 */
public class CuentaBancaria {

    private double saldo;
    private String numerodecuenta;
    private String nombredelcliente;
    
    //CONSTRUCTOR:
    //MODIFICADOR DE ACCESO DE NOMBRE DE LA CLASE (ARGUMENTOS)
        public CuentaBancaria(){//CONSTRUCTOR DEFAULT
        numerodecuenta = "";
        saldo = 0;
        nombredelcliente = "";
    }
    public CuentaBancaria(String Nombre, double cant, String nuDeCuenta){
        nombredelcliente = Nombre;
        numerodecuenta = nuDeCuenta;
        saldo = cant;
        
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        saldo = valor;
    }

    public String getNumerodecuenta() {
        return numerodecuenta;
    }

    public void setNumerodecuenta(String valor) {
        numerodecuenta = valor;
    }

    public String getNombredelcliente() {
        return nombredelcliente;
    }

    public void setNombredelcliente(String valor) {
        nombredelcliente = valor;
    }

    /*public void Imprimirdatos() {
        System.out.println("Nombre del cliente: " +nombredelcliente);
        System.out.println("Numero de cuenta: " +numerodecuenta);
        System.out.println("Saldo: " +saldo);
    }*/
}
