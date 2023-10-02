/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exa1_ex1_p2;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EXA1_EX1_P2 {

    public static void main(String[] args) {
        double GFarenheit;
        double GKelvin;
        double GCentigrados;
        // Declaramos las variables del problema.
        
        Scanner input = new Scanner (System.in);
        // Ponemos la declaracion del input para que funcione la captura de datos.
        
        System.out.println("Ingrese los grados Farenheit:");
        GFarenheit = input.nextDouble();
        // Capturamos los grados farenheit que el usuario quiere convertir.
        
        GKelvin =(GFarenheit-32)*(.55)+273.15;
        GCentigrados = (GFarenheit*(1.8))+32;
        // Ponemos como variables las formulas de conversion.
        
        System.out.println("Conversion en grados kelvin:" + " " + GKelvin);
        System.out.println("Conversion en grados centigrados:" + " " + GCentigrados);
        // Imprimimos los resultados para mostrarle al usuario la conversion.
    }
}
