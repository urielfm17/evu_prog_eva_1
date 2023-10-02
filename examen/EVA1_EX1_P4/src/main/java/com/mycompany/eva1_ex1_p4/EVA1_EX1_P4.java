/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_ex1_p4;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA1_EX1_P4 {

    public static void main(String[] args) {
        double VR1;
        double VR2;
        double VR3;
        double VR4;
        double VR5;
        double Voltaje;
        double REquivalente;
        double ICorriente;
        double ICR1;
        double ICR2;
        double ICR3;
        double ICR4;
        double ICR5;
        //Declaracion de variables.
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese los valores de la resistencia 1:");
        VR1 = input.nextDouble();
        System.out.println("Ingrese los valores de la resistencia 2:");
        VR2 = input.nextDouble();
        System.out.println("Ingrese los valores de la resistencia 3:");
        VR3 = input.nextDouble();
        System.out.println("Ingrese los valores de la resistencia 4:");
        VR4 = input.nextDouble();
        System.out.println("Ingrese los valores de la resistencia 5:");
        VR5 = input.nextDouble();
        //Capturamos el valor de cada resistencia.
       
            
        System.out.println("Ingrese el voltaje:");
        Voltaje = input.nextDouble();
        //Capturamoa el voltaje.
        
        
        double SVR;
        SVR = ((1/VR1)+(1/VR2)+(1/VR3)+(1/VR4)+(1/VR5));
        //Declaramos la sumatoria de los valores de las resitencias para sacar la 
        //resistencia equivalente.
        
        REquivalente = 1/SVR;
        System.out.println("Su resistencia equivalente es:");
        System.out.println(REquivalente + " " + "omegas");
        //Calculamos y presentamos resultados.
        
        ICorriente = Voltaje/REquivalente;
        System.out.println("Su intensidad de corriente es:");
        System.out.println(ICorriente + " " + "amperios");
        //Calculamos y presentamos resultados.
        
        ICR1 = Voltaje/VR1;
        ICR2 = Voltaje/VR2;
        ICR3 = Voltaje/VR3;
        ICR4 = Voltaje/VR4;
        ICR5 = Voltaje/VR5;
        //Calculamos resultados.
        System.out.println("La intensidad de corriente en la resistencia 1 es:");
        System.out.println(ICR1+ " " + "amperios");
        System.out.println("La intensidad de corriente en la resistencia 2 es:");
        System.out.println(ICR2+ " " + "amperios");
        System.out.println("La intensidad de corriente en la resistencia 3 es:");
        System.out.println(ICR3+ " " + "amperios");
        System.out.println("La intensidad de corriente en la resistencia 4 es:");
        System.out.println(ICR4+ " " + "amperios");
        System.out.println("La intensidad de corriente en la resistencia 5 es:");
        System.out.println(ICR5+ " " + "amperios");
        //Presentamos resultafdos.
        
    }
}
