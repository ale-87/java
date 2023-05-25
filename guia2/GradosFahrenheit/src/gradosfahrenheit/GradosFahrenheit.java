
package gradosfahrenheit;

import java.util.Scanner;


public class GradosFahrenheit {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Coloque cantidad de grados centigrados");
        int centigrado = leer.nextInt();
        
        int fahre = 32 + (9 * centigrado / 5);
        System.out.println("Su equivalente en grados fahrenheit es: " + fahre);
        
    }
    
}
