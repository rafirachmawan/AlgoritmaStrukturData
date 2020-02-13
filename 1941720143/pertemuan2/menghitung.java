/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester.pkg2;
import java.util.Scanner;
import static semester.pkg2.tugas1.harga;
/**
 *
 * @author Raffi
 */
public class menghitung {
    public static void main (String [] args ){
        
        int segitiga,segiempat,lingkaran,menu,pilihan = 0;
        
        System.out.println("1.menghitung luas segitiga");
        System.out.println("2.menghitung luas persegi");
        System.out.println("3.menghitung lingkaran");
        System.out.println("4.menu");
        
        
       
       Scanner rafi = new Scanner (System.in);
       pilihan =rafi.nextInt();
       
         switch (pilihan) {
         
    case 1:
       mengitungsegitga();
       System.out.println("apakah anda ingin menghitung kembali ? ");
        String pesan = rafi.next();
        
        if (pesan.equals("y") ){
          menu();
          
        }else {
            System.out.println(" ");
        }
        
        
            
        break;
    case 2 :
        luaspersegi();
        System.out.println("apakah anda ingin menghitung kembali ? ");
        String pilih = rafi.next();
        
        if (pilih.equals("y") ){
          menu();
          
        }else {
            System.out.println(" ");
        }
        
        break ;
       
    case 3 :
         luaslingkaran();
         System.out.println("apakah anda ingin menghitung kembali ? ");
        String pilih1 = rafi.next();
        
        if (pilih1.equals("y") ){
          menu();
          
        }else {
            System.out.println(" ");
        }
         break ;
        
    case 4 :
        menu();
        
        

    }
    }
    static void mengitungsegitga(){
    double alas ,tinggi ,luas ;
    int pilih ;
    Scanner rafi = new Scanner (System.in);
    
        System.out.println("mengitung luas segitiga");
        
        System.out.println("masukan alas");
        alas = rafi.nextDouble();
        System.out.println("masukan tinggi");
        tinggi = rafi.nextDouble();
        
        luas = (alas*tinggi)/2;
        System.out.println("luas segitiga :" + luas);
}
    static void luaspersegi(){
        double panjang,lebar,luas;
        
        Scanner rafi = new Scanner (System.in);
        
        System.out.println("menghitung luas persegi");
        
        System.out.println("masukan panjang");
        panjang = rafi.nextDouble();
        System.out.println("masukan lebar");
        lebar = rafi.nextDouble();
        
        luas = (panjang*lebar);
        System.out.println("luas persegi : " + luas);
        
    }
    static void luaslingkaran(){
        double phi =3.14,r,luas;
       Scanner rafi = new Scanner (System.in);
       
        System.out.println("menghitung luas lingkran");
        System.out.println("masukan jari jari");
        r=rafi.nextDouble();
        
        luas=phi*r*r;
        System.out.println("luas lingkaran : " + luas);
    }
 
    static void menu (){
int segitiga,segiempat,lingkaran,menu,pilihan = 0;
        
        System.out.println("1.menghitung luas segitiga");
        System.out.println("2.menghitung luas persegi");
        System.out.println("3.menghitung lingkaran");
        System.out.println("4.menu");
        
        
       
       Scanner rafi = new Scanner (System.in);
       pilihan =rafi.nextInt();
       
         switch (pilihan) {
         
    case 1:
       mengitungsegitga();
       System.out.println("apakah anda ingin menghitung kembali ? ");
        String pilih1 = rafi.next();
       if (pilih1.equals("y") ){
          menu();
          
        }else {
            System.out.println(" ");
        }
        menu();
        
            
        break;
    case 2 :
        luaspersegi();
        System.out.println("apakah anda ingin menghitung kembali ? ");
        String pilih2 = rafi.next();
        if (pilih2.equals("y") ){
          menu();
          
        }else {
            System.out.println(" ");
        }
        menu();
        break ;
       
    case 3 :
         luaslingkaran();
         System.out.println("apakah anda ingin menghitung kembali ? ");
        String pilih3 = rafi.next();
         if (pilih3.equals("y") ){
          menu();
          
        }else {
            System.out.println(" ");
        }
         menu();
         break ;
         
    case 4 :
       menu();
    }
}
}
