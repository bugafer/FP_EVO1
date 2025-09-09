
package eva1_14_descuento;
import java.util.Scanner;

public class Eva1_14_Descuento {

  
    public static void main(String[] args) {
        
          
        double compratotal;
        double compra;
        Scanner input = new Scanner(System.in);
        
        System.out.println("¿Cual es el monto total de la compra?"); 
        //Captura de datos:
        compra = input.nextDouble();//Captura el monto (nextDouble())
        if(compra > 1000){
        
            compratotal=compra-(compra*0.15);
            System.out.print("el monto con descuento es "); 
            System.out.println(compratotal); 
        }
        else{
            compratotal=compra;
            System.out.print("El monto total es ");
            System.out.println(compratotal);
        
        }
            
        
        
        
    }
    
}
