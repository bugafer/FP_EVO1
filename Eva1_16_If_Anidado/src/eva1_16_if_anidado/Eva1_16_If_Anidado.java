
package eva1_16_if_anidado;

import java.util.Scanner;


public class Eva1_16_If_Anidado {

  
    public static void main(String[] args) {
        
         int num;       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el numero de la semana"); 
        //Captura de datos del numero de la semana:
        num = input.nextInt();
        
        
        //comparacion de los dos numeros
        if(num == 1){
        
            
            System.out.println("El dia de la semana es Domingo "); 
           
        }
        else  if(num == 2){
        
            
            System.out.println("El dia de la semana  Lunes"); 
           
        }
        else  if(num == 3){
        
            
            System.out.println("El dia de la semana  Martes"); 
           
        }
        else  if(num == 4){
        
            
            System.out.println("El dia de la semana  Miercoles"); 
           
        }    
         else  if(num == 5){
        
            
            System.out.println("El dia de la semana  Jueves"); 
           
        }   
        else  if(num == 6){
        
            
            System.out.println("El dia de la semana  Viernes"); 
           
        }
        else  if(num == 7){
        
            
            System.out.println("El dia de la semana  Sabado"); 
           
        }
        else{
        
            System.out.println("El numero no es valido");
            
        }
    }
    
}
