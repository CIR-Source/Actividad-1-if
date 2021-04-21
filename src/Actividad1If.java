
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Actividad1If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Programa para leer el año y decir cuanto tiempo a pasado o falta
        
        Scanner año = new Scanner(System.in);
        
        System.out.println("Introduzca el año actual");
        int añoActual = año.nextInt();
        
        System.out.println("Introduzca el año que quiera");
        int añoACalcular = año.nextInt();
        
        int difTiempo = añoACalcular - añoActual;
        int difTiempoP = difTiempo * -1;
        
        if (difTiempo > 0)
            System.out.println("Faltan " + difTiempo + " años");
        else if (difTiempo < 0)
            System.out.println("Han pasado " + difTiempoP + " años" );
        
    }
    
}
