/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_ex1_p6;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA1_EX1_P6 {

    public static void main(String[] args) {
        double VIAngular;
        double VAFinal;
        double TRotacion;
        double RDRueda;
        double DAngular;
        double AAngular;
        double DMRecorridos;
        double VAPromedio;
        double AEM;
        double FGHertz;
        double VMRecorridos;
        //Declaramos variables.
        Scanner input = new Scanner (System.in);
        
        
        System.out.println("Ingrese la velocidad inicial angular en (radianes):");
        VIAngular = input.nextDouble();
        System.out.println("Ingrese la velocidad angular final (radianes):");
        VAFinal = input.nextDouble();
        System.out.println("Ingrese el tiempo de rotacion (segundos):");
        TRotacion = input.nextDouble();
        System.out.println("Ingrese el radio de la rueda (metros):");
        RDRueda = input.nextDouble();
        //Capturamos informacion;
        
        AAngular = VAFinal - VIAngular;
        DAngular = (0.5)/(AAngular)*(TRotacion*TRotacion);
        System.out.println("La distancia angular recorrida fue:");
        System.out.println(DAngular);
        //La formula que encontre es .5/aceleracion * t^2
        
        DMRecorridos = (2)*(3.1416)*(RDRueda);
        System.out.println("La distancia en metros recorrida fue:");
        System.out.println(DMRecorridos);
        //Calculamos y presentamos resultados.
        
        VAPromedio = ((.5)*(AAngular))*(TRotacion*TRotacion)/(TRotacion);
        System.out.println("La velocidad angular promedio recorrida es:");
        System.out.println(VAPromedio);
        //Calculamos y presentamos resultados.
        
        VMRecorridos = VAPromedio * RDRueda;
        System.out.println("La velocidad en m/s^2 es:");
        System.out.println(VMRecorridos);
        //Calculamos y imprimimos resultados.
        
        System.out.println("La aceleracion angular es:");
        System.out.println(AAngular);
        //La aceleracion ya la habiamos sacado.
        
        AEM = RDRueda * AAngular;
        System.out.println("La aceleracion en metros cuadrados es:");
        System.out.println(AEM);
        //Hacemos la conversion a metros cuadrados.
        
        FGHertz = 1/TRotacion;
        System.out.println("La frecuencia de giro en Hertz es:");
        System.out.println(FGHertz);
        //Calculamos y presentamos resultados.
        
        
        
        
    }
}
