/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author frias
 */
public class EVA1_5_ENTRADA_SALIDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1.DECLARACION DE VARIABLES
        String nombre;
        String apellidos;
        int semestre;
        Scanner capturota=new Scanner(System.in);
            
        //3.CAPTURA DE VARIABLES
        System.out.println("introduce tu nombre:");
        nombre=capturota.nextLine();
        System.out.println("introduce tus apellidos:");
        apellidos=capturota.nextLine();
        System.out.println("introduce tu semestre:");
        semestre=capturota.nextInt();
                //java reconcoce mayusculas y  minusculas
                //es decir es diferente system a System
        //4.MOSTRAR LOS DATOS CAPTURADOS
        System.out.println("nombre");
        System.out.println("apellidos");
        System.out.println("semestre");
        
    }
    
}
