
package eva1_20_califas;

import java.util.Scanner;


public class Eva1_20_Califas {

   
    public static void main(String[] args) {
        
        
         int calif;
        
        
        Scanner input = new Scanner(System.in);
        
         System.out.println("Dame tu calificacion");
                 
       
        calif = input.nextInt();
        
       
        
   
        if((calif>=90)&&(calif<=100)){
        
            System.out.println("Tu calificacion es A"); }
            
        if((calif>=80)&&(calif<=89)){
        
                     
             System.out.println("Tu calificacion es B");}
                     
        if((calif>=70)&&(calif<=79)){
        
             System.out.println("Tu calificacion es C"); }
            
        if((calif>=60)&&(calif<=69)){
        
                     
             System.out.println("Tu calificacion es D"); }
                           
        if((calif>=0)&&(calif<=59)){
        
                     
             System.out.println("Tu calificacion es F"); }
                     
                                     
    
        
    }
    
}

        
    
    

