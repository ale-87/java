/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4ejer2;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class G4Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner leer = new Scanner(System.in);
        
        String nombre;
        int edad;
        String respuesta;
        
        do{
          nombre = leer.next();
         edad = leer.nextInt(); 
         Usuario(nombre,edad);
          System.out.println("¿Desea continuar?");
          respuesta = leer.next();
        }while(!"no".equals(respuesta));
    } 
    
    public static void Usuario(String nombre, int edad){
        Scanner leer = new Scanner(System.in);
    
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    
    if (edad < 18){
        System.out.println("Es menor de edad");
       
    }else{
        System.out.println("Es mayor de edad");
    }
    }  
}
