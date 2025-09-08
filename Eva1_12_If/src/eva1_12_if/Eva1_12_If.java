
package eva1_12_if;
import java.util.Scanner;


public class Eva1_12_If {

  
    public static void main(String[] args) {
        int califa;
        Scanner captu=new Scanner(System.in);//Declarar Scanner
        System.out.println("Introduce la calificación");
        califa=captu.nextInt();//Captura calificación
        //Estructura If
        //bloque verdadero si(If)
        if(califa >=70){
            System.out.println("El alumno acredito la materia");
            
        
        }else{
           System.out.println("El alumno no acredito la materia"); 
        }
        
        
        
        
    }
    
}
