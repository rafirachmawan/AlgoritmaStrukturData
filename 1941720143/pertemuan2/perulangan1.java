/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester.pkg2;
import java.util.Scanner;
/**
 *
 * @author Raffi
 */
public class perulangan1 {
    public static void main (String []args){
     Scanner rafi = new Scanner (System.in);
        System.out.println("masukan bilangan :");
   int a;
   a=rafi.nextInt();
   
     for (int i=5; i>0; i--){
         a -= 3 ;
         System.out.println(a);
     }
     if (a % 2 == 0 ){
         System.out.println("bilangn anda termasuk genap ");
     }else {
         System.out.println("bilangan anda termasuk ganjil ");
     }
     
   
    }
}
