
package eva1_15_mayor;

import java.util.Scanner;

public class Eva1_15_Mayor {

 
    public static void main(String[] args) {
        
        double numero1;
        double numero2;
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero"); 
        //Captura de datos del primer numero:
        numero1 = input.nextDouble();
        System.out.println("Introduce el segundo numero"); 
        //Captura de datos del segundo numero:
        numero2 = input.nextDouble();
        
        //comparacion de los dos numeros
        if(numero1 > numero2){
        
            
            System.out.print("El numero mayor es "); 
            System.out.println(numero1); 
        }
        else{
            
            if(numero1<numero2 ){
                System.out.print("El numero mayor es ");
                System.out.println(numero2);
            
            }
            else{
            
                System.out.println("los dos numeros son igual a "+numero1);
            
            }
            
        
        }
       
    }
    
}
