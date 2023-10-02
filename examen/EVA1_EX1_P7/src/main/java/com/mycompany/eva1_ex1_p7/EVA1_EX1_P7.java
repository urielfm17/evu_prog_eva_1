/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_ex1_p7;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA1_EX1_P7 {

    public static void main(String[] args) {
        double X1;
        double X2;
        double Y1;
        double Y2;
        double Pendiente;
       //Declaramos variables para la pendiente.
       double DY;
       double DX;
       double ADPendiente;
       //Declaramos variables para el area.
       
       Scanner input = new Scanner (System.in);
       
        System.out.println("Ingrese el valor de X1 para calcular su pendiente:");
        X1 = input.nextDouble();
        System.out.println("Ingreese el valor de X2 para calcular su pendiente");
        X2 = input.nextDouble();
        Y1 = (X1*X1);
        Y2 = (X2*X2);
        Pendiente = (Y2-Y1)/(X2-X1);
        System.out.println("El valor de la pendiente es:" + " " + Pendiente);
        //Calculamos y presentamos la pendiente.
        
        DY = Y2-Y1;
        DX = X2-X1;
        ADPendiente = (DY*DX)/2;
        System.out.println("El valor del area es:" + " " + ADPendiente);
        //Calculamos y presentamos el area.
        
        
        
       
        
       
    }
}
