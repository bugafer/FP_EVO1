package eva1_6_operaciones;


public class Eva1_6_Operaciones {

   
    public static void main(String[] args) {
        double pi, radio, area;
        //es lo mismo que :
        //double pi;
        //double radio;
        //double area;
        //inicializacion:
        pi = 3.1416;
        radio = 10;
        //operacion
        area = pi * (radio * radio); //igual que en algebra respeta el orden de los parentesis
        System.out.println("El area del circulo cuyo radio es 10 es:");
        System.out.println(area);
        
    }
    
}
