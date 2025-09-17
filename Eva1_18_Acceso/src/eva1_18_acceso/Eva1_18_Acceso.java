
package eva1_18_acceso;

import java.util.Scanner;


public class Eva1_18_Acceso {
  
  final static String USUARIO = "fernando"; 
  final static String PWD = "1234";
  

    
    public static void main(String[] args) {
        
        String user, pass;    
        Scanner input = new Scanner(System.in);
        
         System.out.println("¡¡Bienvenido al sistema de acceso!!");
         
        System.out.println("Dame el usuario"); 
       
        user = input.nextLine();
        

        
        if(user.equals(USUARIO)){
        
                    System.out.println("Dame la contraseña"); 
       
                     pass = input.nextLine();
                     if(pass.equals(PWD)){
                     
                     System.out.println("ACCESO CONCEDIDO"); 
                     
                     }else{
                     
                     System.out.println("Acceso denegado, introduce una contraseña valida"); 
                     
                     }
                     
                     
            
        }else{
        
                   System.out.println("Acceso denegado, introduce un usuario valido");
        
        }
        
    }
    
}
