
package eva1_13_if;

import java.util.Scanner;


public class Eva1_13_If {

   
    public static void main(String[] args) {
        
            int edad, año;
            
        Scanner captu=new Scanner(System.in);//Declarar Scanner
        System.out.println("En que año nacio");
        año=captu.nextInt();//Captura la edad
        edad=2025-año;
        
        //Estructura If
        //bloque verdadero si(If)
        if(edad >=18){
            System.out.println("Tienes "+edad+" años. Eres mayor de edad, puede adquirir alchohol");
            
        
        }else{
           System.out.println("Tienes "+edad+" años. Eres menor de edad, no puede adquirir alcohol"); 
        }
       
    }
    
}
