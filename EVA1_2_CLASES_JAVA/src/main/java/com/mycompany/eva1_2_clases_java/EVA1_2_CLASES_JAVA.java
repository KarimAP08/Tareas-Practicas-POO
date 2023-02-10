/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva1_2_clases_java;

/**
 *
 * @author KarimAP
 */
public class EVA1_2_CLASES_JAVA {

    public static void main(String[] args) {
        /**
         * CREAR OBJETO INSTANCIACION INSTANCIAR --> DAR MEMORIA RAM NOMBRE DE
         * LA CLASE IDENTIFICADOR = new CONSTRUCTOR DE LA CLASE
         */
        Persona perso1 = new Persona();//Persona() Es el constructor
        System.out.println(perso1);
        /*perso1.nombre = "Ruben";
        perso1.apellidos = "Hernandez";
        System.out.println(perso1.nombre + "" + perso1.apellidos);*/
        perso1.setNombre("Ruben");
        //System.out.println(perso1.getNombre());
        perso1.setApellidos("Alonso");
        //System.out.println(perso1.getApellidos());
        perso1.setEdad(15);
        //System.out.println(perso1.getEdad());
        perso1.setGenero('I');
        //System.out.println(perso1.getGenero());
        perso1.imprimirDatos();
        //----           //CONSTRUCTOR
        Persona perso2 = new Persona();
        perso2.setNombre("Jorge");
        perso2.setApellidos("Nitales");
        perso2.setEdad(22);
        perso2.setGenero('H');
        perso2.imprimirDatos();     
    }
}
