
package eva1_19_antro;

import java.util.Scanner;


public class Eva1_19_Antro {
  
  
  
  

    
    public static void main(String[] args) {
        
        int edad;
        boolean id;
        
        Scanner input = new Scanner(System.in);
        
         System.out.println("¡¡Bienvenido al antro!!");
         
        System.out.println("¿Cuantos años tienes?"); 
        
       
        edad = input.nextInt();
        
        System.out.println("Tienes Identificacion");
        
        System.out.println("true o false"); 
        
        id = input.nextBoolean();

        
        if((edad >= 18)&&(id== true)){
        
                     
       
                   
                     
                     System.out.println("ACCESO AL ANTRO CONCEDIDO"); 
                     
                     }else{
                     
                     System.out.println("ACCESO AL ANTRO DENEGADO"); 
                     
                     }
                     
                     
            
        
        
    }
    
}
