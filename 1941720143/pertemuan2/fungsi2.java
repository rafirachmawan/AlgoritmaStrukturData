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
public class fungsi2 {
    public static void main (String []args ){
        Scanner rafi = new Scanner(System.in);
      int n , j =0 ;
      System.out.println("masukan banyak deret fibonanci :");
      n = rafi.nextInt () ;
      System.out.println("hasil fibonanci : ");
      for (int i=0 ; i<n; i++ ){
          System.out.print(" "+ fibo(j));
          j++;
      }
        
    }
    static int fibo(int n ){
         Scanner rafi = new Scanner(System.in);
       if(n == 0 || n==1) {
           return n ;
       
       }else {
           return (fibo (n-1)+ fibo (n - 2));
       }
       
}
}

