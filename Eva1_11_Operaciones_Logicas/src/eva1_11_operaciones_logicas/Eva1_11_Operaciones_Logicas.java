
package eva1_11_operaciones_logicas;

public class Eva1_11_Operaciones_Logicas {

   
    public static void main(String[] args) {
        int radio =5;//DEcalaramos e Incializamos
        boolean resu;
        //Operaciones Logicas: Comparaciones
        //Resultados: Verdadero o Falso
        resu = radio > 0;//Radio es mayor a cero?
        System.out.print("radio 5 > 0 es: ");
        System.out.println(resu);
        
        resu = radio == 0;//Radio es igual a cero?
        System.out.print("radio 5 igual 0 es: ");
        System.out.println(resu);
        
        resu = radio != 0;//Radio es diferente a cero?
        System.out.print("radio 5 es diferente a 0 es: ");
        System.out.println(resu);
        
        
    }
    
}
