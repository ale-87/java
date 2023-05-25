
package frasemayusculaminuscula;

import java.util.Scanner;


public class FraseMayusculaMinuscula {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba una frase");
        String frase = leer.nextLine();
        
        System.out.println("frase en mayuscula "+ frase.toUpperCase());
        System.out.println("frase en minuscula " + frase.toLowerCase());
    }
    
}
