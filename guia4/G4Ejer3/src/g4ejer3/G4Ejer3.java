/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4ejer3;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class G4Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          System.out.println("Ingrese la cantidad a convertir");
        Scanner leer = new Scanner(System.in);
        double euros=leer.nextDouble();
        
        System.out.println("Elija la opción:\n1-Libras\n2-Dolares\n3-Yenes");
        int opcion=leer.nextInt();
        switch(opcion){
            case 1:
                libras(euros);
                break;
            case 2:
                dolares(euros);
                break;
            case 3:
             yenes(euros); 
            break;
          
        }
    }
    public static void libras(double euros){
        double libras=euros*0.86;
        System.out.println("La conversión es: "+ libras+  " libras.");
    
    } 
    public static void dolares(double euros){
        double dolares=euros*1.28611;
        System.out.println("La conversión es: "+ dolares+  " dolares.");
}
      public static void yenes(double euros){
        double yenes=euros*129.852;
        System.out.println("La conversión es: "+ yenes +  " yenes.");
      }
}
    

