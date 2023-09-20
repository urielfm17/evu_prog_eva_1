/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_tipos_de_datos;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author uriel 
 */
public class Eva1_11_tipos_de_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte califa;
        califa = 127;
        //califa = 200; 
        califa = -128;
        //califa = -200;
        //califa = 127 + 1;
        int valor;
        valor = Integer.MAX_VALUE  ;
        System.out.println(valor + 1);
        valor = Integer.MIN_VALUE;
        System.out.println(valor);
        
        
       // ------------------------------
       
       char caracter = '@';
        System.out.println(caracter);
        System.out.println(caracter + 0);
        
                
    }
    
}
