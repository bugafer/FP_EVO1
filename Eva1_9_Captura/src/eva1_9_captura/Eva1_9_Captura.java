
package eva1_9_captura;

import java.util.Scanner;


public class Eva1_9_Captura {

    public static void main(String[] args) {
        String nombre;
        double promedio;
        int edad;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Intruduce tu nombre"); 
        //Captura de datos:
        nombre = input.nextLine();//Captura el texto (nextLine())
        System.out.println("Introduce tu edad");
        edad = input.nextInt();//Captura numero enteros
        System.out.println("Captura el promedio de la preparatoria");
        promedio = input.nextDouble();//captura numeros con decimales
        
        System.out.print("El nombre es: ");  
        System.out.println(nombre);
        System.out.print("La edad es: ");  
        System.out.println(edad);
        System.out.print("El promedio es: ");  
        System.out.println(promedio);
    }
    
}
