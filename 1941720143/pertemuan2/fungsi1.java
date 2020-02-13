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
public class fungsi1 {
  public static void main (String [] args){
      Scanner rafi = new Scanner(System.in);
      int n;
      System.out.println("masukan banyak deret fibonanci :");
      n = rafi.nextInt () ;
      System.out.println("fibonanci : ");
      deretfibonanci(n);
  }  
  static void deretfibonanci(int n){
  int a = 0 ,b=1 ;
  for (int i=0; i<n ; i++){
      System.out.println(a + " ");
      a = a+b ;
      b = a-b ;
  }
      System.out.println();
}
}

