/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4ejer1;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class G4Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
              Scanner leer = new Scanner(System.in);
           
           System.out.println("Escriba dos numeros");
           int num1 = leer.nextInt();
           int num2 = leer.nextInt();
           System.out.println("¿Que desea hacer a continuacion?");
           System.out.println("1.Sumar");
           System.out.println("2.Restar");
           System.out.println("3.Multiplicar");
           System.out.println("4.Dividir");
           int selec = leer.nextInt();
           
           switch (selec){
               case 1:
                   System.out.println(sumar(num1, num2));
                   break;
               case 2:
                   System.out.println(resta(num1, num2));
                   break;
               case 3:
                   System.out.println(multiplicacion(num1, num2));
                   break;
               case 4:
                   System.out.println(divicion(num1, num2));
                   break;
           }
           
    }
    
    public static int sumar(int num1,int num2){
        int sumar = num1 + num2;
        return(sumar);
    }
    
    public static int resta(int num1, int num2){
        int restar = num1 - num2;
        return(restar);
    }
    
    public static int multiplicacion(int num1, int num2){
        int multiplicar = num1 * num2;
        return(multiplicar);
    }
    
    public static int divicion(int num1, int num2){
        int dividir = num1 / num2;
        return(dividir);
    }
    
}
