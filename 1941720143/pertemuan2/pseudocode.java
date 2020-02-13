/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester.pkg2;
import java.util.Scanner ;
/**
 *
 * @author Raffi
 */
public class pseudocode {
    public static void main (String [] args){
      Scanner rafi = new Scanner (System.in);
      int y ;
      System.out.print("masukan angka yang anda inginkan =");
      y=rafi.nextInt();
      
      if (y%2 == 0 && y%6 !=0 && y%15 != 0) {
          System.out.println("bilangan kelipatan 2");
      }else if (y%6 ==0 && y%15 !=0){ 
          System.out.println("bilangan kelipatan 6 ");
      }else if (y%15==0){
          System.out.println("bilangan kelipatan 16");
          
      }else {
          System.out.println("bilangan bukan kelipatan 2,6,dan 15");
      }
        
      
        
            
        
    }
    
}
