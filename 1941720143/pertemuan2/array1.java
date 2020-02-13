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
public class array1 {
    public static void main (String [] args ){
        int bil =0 ;
        int [] angka =new int [15];
        Scanner rafi = new Scanner (System.in);
        
    //    System.out.println(angka);
        for( int i = 0; i < angka.length; i++ ){
            System.out.print("angka ke-" + i + ": ");
            angka[i] = rafi.nextInt();
            
            if ( angka[i] % 2 == 0){
                System.out.println("bilangan genap");
                
            }else{
                System.out.println("bilangan ganjil");
            }
                
            }
        
        }
    
        
    }
