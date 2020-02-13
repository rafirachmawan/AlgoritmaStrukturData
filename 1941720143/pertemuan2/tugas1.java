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
public class tugas1 {
    public static void main(String [] args ){
 //       for (int i = 0; i<=1;i++){
 //           System.out.println("paket chicken " + i);
            
   //     }
        System.out.println("1.paket chicken ");
        System.out.println("2.paket oke ");
        System.out.println("masukan menu paket yang di inginkan :");
        
        int pilihan,pilih;
        int chickenA =12000,chickenB=15000,chickenC=20000;
        
       String [] chicken = {"chicken A = Rp.12000", "Chicken B = Rp.15000 ", "Chciken C =Rp 20000 "};
       String [] oke     = {"oke A = Rp.10000","oke B = Rp. 12000","oke C =Rp.15000"};
        Scanner rafi = new Scanner (System.in);
       pilihan =rafi.nextInt();    
        switch (pilihan) {
         
    case 1:
        for (int i = 0; i < chicken.length; i++) {
                    System.out.println((i + 1) + ". " + chicken[i]);
                }
        System.out.println("paket chicken ");
        pilih=rafi.nextInt();
        harga ();
        
        
            
        break;
    case 2:
         for (int i = 0; i < oke.length; i++) {
                    System.out.println((i + 1) + ". " + oke[i]);
                }
        System.out.println("paket oke");
         pilih=rafi.nextInt();
        harga1();
        break;
    
    default:
        
}
        
    }
    
    static void  harga (){
   //    Scanner rafi = new Scanner (system.in);
    int pilih = 0;
    int chickenA         = 12000;
    int chickenB          = 15000;
    int chickenC         = 20000;
    int total,jumblah,hasil,peh ;
   // int hasil;
    Scanner rafi = new Scanner (System.in);
       pilih =rafi.nextInt();   
      switch (pilih) {
            case 1:
                    System.out.println("Harga chicken A : Rp." + chickenA);
                    total = chickenA ;
                     System.out.print("Masukan jumblah yang di pesan : ");
                 jumblah= rafi.nextInt();
            
                
                    hasil = jumblah *chickenA ;
                System.out.println("harga minuman : " + hasil);
                        
                
                peh = hasil ;
                    
        
                break;  
            case 2 : 
                   System.out.println("Harga chicken B : Rp." + chickenB);
                    total = chickenB ;
                     System.out.print("Masukan jumblah yang di pesan : ");
                 jumblah= rafi.nextInt();
           
                
                    hasil = jumblah *chickenB ;
                System.out.println("harga minuman : " + hasil);
                        
                
                peh = hasil ;
            case 3 : 
                    System.out.println("Harga chicken B : Rp." + chickenC);
                    total = chickenC ;
                     System.out.print("Masukan jumblah yang di pesan : ");
                 jumblah= rafi.nextInt();
             
                
                    hasil = jumblah *chickenC ;
                System.out.println("harga minuman : " + hasil);
                        
                
                peh = hasil ;
    }
}
    static void harga1 (){
    int pilih = 0;
    int okeA         = 10000;
    int okeB          = 12000;
    int okeC         = 15000;
    int total,jumblah,hasil,peh ;
   // int hasil;
    Scanner rafi = new Scanner (System.in);
       pilih =rafi.nextInt();   
        switch (pilih) {
            case 1:
                    System.out.println("Harga chicken A : Rp." + okeA);
                    total = okeA ;
                     System.out.print("Masukan jumblah yang di pesan : ");
                 jumblah= rafi.nextInt();
            
                
                    hasil = jumblah *okeA ;
                System.out.println("harga minuman : " + hasil);
                        
                
                peh = hasil ;
                    
        
                break;  
            case 2 : 
                   System.out.println("Harga chicken B : Rp." + okeB);
                    total = okeB ;
                     System.out.print("Masukan jumblah yang di pesan : ");
                 jumblah= rafi.nextInt();
           
                
                    hasil = jumblah *okeB ;
                System.out.println("harga minuman : " + hasil);
                        
                
                peh = hasil ;
            case 3 : 
                    System.out.println("Harga chicken B : Rp." + okeC);
                    total = okeC ;
                     System.out.print("Masukan jumblah yang di pesan : ");
                 jumblah= rafi.nextInt();
             
                
                    hasil = jumblah *okeC ;
                System.out.println("harga minuman : " + hasil);
                        
                
                peh = hasil ;
    }
        
    }
}
            

