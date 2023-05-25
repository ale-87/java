
package g3ejerptico1;

import java.util.Scanner;


public class G3EjerPtico1 {

    
    public static void main(String[] args) {
        
        int num;
        System.out.println("ingrese numero a evaluar");
        
        Scanner leer = new Scanner (System.in);
        num = leer.nextInt();
        
        if(num % 2 == 0){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");
        }
          
    }
    
}
