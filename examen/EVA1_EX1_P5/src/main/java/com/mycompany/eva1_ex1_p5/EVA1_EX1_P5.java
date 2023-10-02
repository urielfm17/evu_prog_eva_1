/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_ex1_p5;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA1_EX1_P5 {

    public static void main(String[] args) {
        double angulo = 0.785398;
        double Vinicial;
        double HMax;
        double DCaida;
        double Gravedad = 9.81;
        //Declaramos variables.
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese la velocidad inicial en m/s");
        Vinicial = input.nextDouble();
        //Capturamos la informacion necesaria.
        
        HMax = (Vinicial*Vinicial)*(Math.sin(angulo)*Math.sin(angulo))/(2*Gravedad);
        System.out.println("La altura maxima que el proyectil alcanza es:");
        System.out.println(HMax + " " + "m");
        //Calculamos y imprimimos resultados.
        
        DCaida = ((Vinicial*Vinicial)/Gravedad)*Math.sin(2*angulo);
        System.out.println("La distancia que el objeto alcanzo a caer es:");
        System.out.println(DCaida + " " + "m");
        //Calculamos y imprimimos resultados.
        
        
        
        
        
    }
}
