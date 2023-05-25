
package funciondepotencia;

import java.util.Scanner;


public class FunciondePotencia {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese numero a calcula su potencia y raiz");
        int num = leer.nextInt();
        
        double doble = Math.pow(num, 2);
        System.out.println("el doble es: " + doble);
        double triple = Math.pow(num, 3);
        System.out.println("el triple es: " + triple);
        double raiz = Math.sqrt(num);
        System.out.println("la raiz es: " + raiz);
    }
    
}
