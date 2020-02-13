/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import java.util.Scanner ;
/**
 *
 * @author Raffi
 */
public class mainsum {
    public static void main (String [] args){
        Scanner rafi = new Scanner (System.in);
        System.out.println("============================");
        System.out.println("progam menghitung keuntungan total (satuan juta , misal 5.9)");
        System.out.println("masukan jumblah bulan");
        int elm = rafi.nextInt();
        
        sum sm = new sum(elm) ;
        System.out.println("==============================");
        for (int i =0; i<sm.elemen; i++){
            System.out.println("masukan untung bulan ke - " + (i+1) +" - ");
            sm.keuntungan[i] =rafi.nextDouble();
        }
        System.out.println("============================");
        System.out.println("algoritma brute force");
        System.out.println("total keuntungan perusahaan selama " + sm.elemen + "bulan adalah =" + sm.totalbf(sm.keuntungan));
        System.out.println("=======================");
        System.out.println("algoritma divide conguer");
        System.out.println("total keuntungan perusahaan selama " + sm.elemen + "bulan adalah = " + sm.totaldc (sm.keuntungan,0,sm.elemen-1));
                  
        
    }
}
