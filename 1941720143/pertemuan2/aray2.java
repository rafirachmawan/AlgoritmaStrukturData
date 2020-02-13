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
public class aray2 {
    public static void main(String[] args) {
         
         int array1[][]= new int[4][5];
         int total=0;
         int arr[][] = new int [4][5];
         int ok[]= new int[5];
        Scanner rafi = new Scanner(System.in);
        for (int i=0; i<array1.length; i++) {
            for (int j=0; j<array1[0].length; j++){
            System.out.println("Masukkan nilai array ke-"+"["+i+"]"+"["+j+"]");
            arr[i][j] = rafi.nextInt();
            }
}      
            for (int i=0; i<array1.length; i++) {
            int uye=0;
            for (int j=0; j<array1[0].length; j++){
            uye=uye+arr[i][j];   
                ok[j]=uye;
                total=ok[j]+total;
            }
        }
        System.out.println("total nilai semua array = "+total);
         
         
     }
}

