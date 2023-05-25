
package guia3frase;

import java.util.Scanner;


public class Guia3Frase {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una contraseña");
        String frase = leer.next();
        
        if (frase.equals("eureka")) {
            System.out.println("la contraseña es correcta");
        }else{
            System.out.println("contraseña incorrecta");
        }
    }
    
}
