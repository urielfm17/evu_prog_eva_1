/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_ex1_p3;

import java.util.Scanner;

/**
 *
 * @author frias

 */
public class EVA1_EX1_P3 {

    public static void main(String[] args) {
        double MCubicos;
        double RTuberia;
        double VFAgua;
        double ATuberia;
        // Declaramos variabes.
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese el radio de la tuberia:");
        RTuberia = input.nextDouble();
        System.out.println("Ingrese la velocidad dle flujo del agua en m/s:");
        VFAgua = input.nextDouble();
        // Capturamos la informacion necesaria
        
        ATuberia = ((3.1416)*(RTuberia*RTuberia));
        MCubicos = ATuberia*VFAgua;
        // Hacemos los calculos.
        
        System.out.println("La cantidad de m^3 que salen de su tuberia son:");
        System.out.println( MCubicos+ "m^3");
        //Presentamos resultados.
        
        
        
    }
}
