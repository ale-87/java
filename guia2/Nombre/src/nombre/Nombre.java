
package nombre;

import java.util.Scanner;


public class Nombre {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String nom;
        System.out.println("Escriba su nombre");
        nom = leer.next();
        
        System.out.println("su nombre es: " + nom);
    }
    
}
