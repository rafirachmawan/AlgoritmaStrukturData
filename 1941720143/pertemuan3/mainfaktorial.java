/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import java.util.Scanner;
/**
 *
 * @author Raffi
 */
public class mainfaktorial {
    public static void main (String [] args){
           Scanner rafi = new Scanner (System.in);
           
           System.out.println("===================");
           System.out.println("masukan jumblah elemen yang ingin dihitung :");
           int elemen = rafi.nextInt();
           
           
       faktorial [] fk = new faktorial[elemen];
       for (int i=0; i<elemen; i++){
           fk[i] = new faktorial();
           System.out.println("masukan nilai data ke - " + (i+1)+ ":");
           fk[i].nilai = rafi.nextInt();
       }
       
        System.out.println("============================");
        System.out.println("hasil faktorial dengan bruete force ");
        for ( int i= 0; i<elemen; i++){
            System.out.println("faktorial dari nilai  " + fk[i].nilai+ "adalah :" + fk[i].faktorialbf(fk[i].nilai));
            
        }
        System.out.println("============================");
        System.out.println("hasil faktorial dengan divide and conguer ");
        for (int i= 0; i<elemen; i++){
            System.out.println("faktorial dari nilai " + fk[i].nilai +"adalah :" + fk[i].faktorialdc(fk[i].nilai));
        }
    }
 
   
    
}
