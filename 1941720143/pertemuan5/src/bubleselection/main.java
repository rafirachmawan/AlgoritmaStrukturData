/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubleselection;
import java.util.Scanner ;
/**
 *
 * @author Raffi
 */
public class main {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in );
        Scanner s1 = new Scanner (System.in);
        daftarMahaSiswa data = new daftarMahaSiswa();
        int jummhs = 5 ;
        
        for (int i=0; i<jummhs; i++){
            System.out.println("nama = ");
            String nama = s1.nextLine ();
            System.out.println("thn masuk = ");
            int thn = s.nextInt();
            System.out.println("umur");
            int umur = s.nextInt ();
            System.out.println("IPK");
            double ipk = s.nextDouble ();
            
            mahasiswa m = new mahasiswa (nama ,thn,umur,ipk);
            data.tambah (m);
        }
        System.out.println("data mahasiswa sebelum shorting =");
        data.tampil() ;
        
        System.out.println("data mahasiswa setelah shorting desc berdasar ipk =");
        data.bubleshort();
        data.tampil();
        
        System.out.println("data mahasiswa setelah sorting asc berdasar ipk= ");
        data.selectionsort ();
        data.tampil ();
        
        System.out.println("data setelah di insertion sort  = ");
        data.insertionsort ();
        data.tampil();
        
    }
}
