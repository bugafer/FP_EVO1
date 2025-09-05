
package eva1_10_captura;

import java.util.Scanner;


public class Eva1_10_Captura {

   
    public static void main(String[] args) {
           
        double velocidad, distancia, tiempo;//Declarar variables
        
        Scanner captu = new Scanner(System.in);//Declarar Scanner
        
        System.out.println("Introduce la distancia"); 
        distancia = captu.nextDouble();//Captura distancia 
        System.out.println("Introduce el tiempo");
        tiempo = captu.nextDouble();//Captura el tiempo
        System.out.println("Captura el promedio de la preparatoria");
        velocidad = distancia/tiempo;//calcula la velocidad dividiendo distancia sobre tiempo
        System.out.println("La velocidad es ");
        System.out.print(velocidad);
        System.out.print(" m/s ");
    }
    
}
