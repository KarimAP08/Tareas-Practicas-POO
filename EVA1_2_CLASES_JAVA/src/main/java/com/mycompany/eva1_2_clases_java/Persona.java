package com.mycompany.eva1_2_clases_java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KarimAP
 */
public class Persona {
    //DATOS --> ATRIBUTOS DE LA CLASE
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;  
    //METODOS --> COMPORTAMIENTO DE LA CLASE
    //LEER Y ESCRIBIR LOS ATRIBUTOS DE LA CLASE
    //LEER --> GET
    //ESCRIBIR --> SET
    //modificador de acceso, valor de retorno nombre del metodo(argumentos){implementacion}
    public String getNombre(){//GET
        return nombre;
    }
    public void setNombre(String valor){//SET
        nombre = valor;
    }
        public String getApellidos(){//GET
        return apellidos;
    }
    public void setApellidos(String valor){//SET
        apellidos = valor;
    }
        public int getEdad(){//GET
        return edad;
    }
    public void setEdad(int valor){//SET
        edad = valor;
    }
        public char getGenero(){//GET
        return genero;
    }
    public void setGenero(char valor){//SET
        genero = valor;
    }
}
