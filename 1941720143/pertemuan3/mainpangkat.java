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
public class mainpangkat {
    public static void main (String [] args){
      Scanner rafi = new Scanner (System.in);
        System.out.println("==================================");
        System.out.println("masukan jumblah elemen yang ingin dihitung :");
        int elemen = rafi.nextInt();
        
        pangkat [] png = new pangkat [elemen];
        
        for (int i=0; i<elemen; i++){
            png[i] = new pangkat ();
            System.out.println("masukan nilai yang akan dipangkatkan ke - " +(i+1)+ " :" );
            png [i].nilai = rafi.nextInt();
            System.out.println("masukan nilai pemangkat ke- " + (i+1) + " :");
            png[i].pangkat = rafi.nextInt();
        }
        
        System.out.println("============================");
        System.out.println("hasil pangkat dengan burete force ");
        for(int i = 0 ; i<elemen; i++){
            System.out.println("nilai " + png[i].nilai + "pangkat " + png[i].pangkat + "adalah : "+ png[i].pangkatbf (png[i].nilai,png[i].pangkat));
            
        }
        System.out.println("============================");
        System.out.println("hasil pangkat dengan Divide and Conguer ");
        for(int i =0; i<elemen; i++){
            System.out.println("nilai "+ png[i].nilai + "pangkat " + png[i].pangkat + "adalah :" + png[i].pangkatdc(png[i].nilai,png[i].pangkat));
        }
    }
            
}
