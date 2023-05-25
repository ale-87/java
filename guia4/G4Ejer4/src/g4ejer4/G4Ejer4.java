/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4ejer4;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class G4Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int n; 
        
        System.out.println("ingresa un numero");
        n = leer.nextInt();
        System.out.println(Esprimo(n));
    }
   public static boolean Esprimo (int n) {
       int i = 1;
        int c = 0;
       while (i <= n){
            if (n % i == 0){
                c++;
            }
            i++;
        }
        if (c == 2){
            return true;
        }else{
           return false;
        } 
       
 } 
}
