/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_6_automovil;

/**
 *
 * @author KarimAP
 */
public class Autos {

    private String marca;
    private String modelo;
    private int placas;
    private int ano;
    private String dueno;
    private int adeudo;

    public Autos() {
        marca = "";
        modelo = "";
        placas = 0;
        ano = 0;
        dueno = "";
    }

    public Autos(String M, String Mo, int pl, int a, String D) {
        marca = M;
        modelo = Mo;
        placas = pl;
        ano = a;
        dueno = D;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String valor) {
        marca = valor;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String valor) {
        modelo = valor;
    }

    public int getplacas() {
        return placas;
    }

    public void setplacas(int valor) {
        placas = valor;
    }

    public int getano() {
        return ano;
    }

    public void setano(int valor) {
        ano = valor;

    }

    public int calcularadeudo() {
        if (ano <= 2000) {
            adeudo = 1500;
        } else if (ano >= 2001 && ano <= 2005) {
            adeudo = 2000;
        } else if (ano >= 2006 && ano <= 2010) {
            adeudo = 2500;
        } else if (ano >= 2011 && ano <= 2015) {
            adeudo = 3000;
        } else if (ano >= 2016 && ano <= 2023) {
            adeudo = 4000;
        }
        return adeudo;
    }

    public String getdueno() {
        return dueno;
    }

    public void setdueno(String valor) {
        dueno = valor;
    }

    public void Imprimirdatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placas: " + placas);
        System.out.println("Ano :" + ano);
        System.out.println("Dueno: " + dueno);
        System.out.println("El adeudo total es: " + adeudo);
    }
}
