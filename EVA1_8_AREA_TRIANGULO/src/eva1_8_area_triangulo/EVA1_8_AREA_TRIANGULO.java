/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA1_8_AREA_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double base;//double=numeros con parte decimal 
       double altura;
       double area;
       Scanner captu = new Scanner(System.in);
       System.out.println("introduce la base del triangulo:");
       base = captu.nextDouble();
       System.out.print("introduce la altura del triangulo:");
       altura = captu.nextDouble();
       area = (base*altura)/2;
       System.out.println("el area del triangulo es");
       System.out.println(area);
       
               
       
    }
    
}
