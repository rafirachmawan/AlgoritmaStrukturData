/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joobsheet7;
import java.util.Scanner ;
/**
 *
 * @author Rafi Rachmawan
 */
public class searchingmain {
  
    
    public static void main(String[] args) {
        Scanner rafi = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data : ");
        int jumlah = rafi.nextInt();
        int data[] = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Data ke-" + (i + 1) + " : ");
            data[i] = rafi.nextInt();
        }
        
        searching pencarian = new searching(data, jumlah);
        mergeSorting ms = new mergeSorting();
        
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        
        System.out.print("Masukkan data yang dicari : ");
        int cari = rafi.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);
        pencarian.Tampilposisi(cari, posisi);
        
        System.out.println("====================================");
        System.out.println("Sorting dengan merge sort : ");
        ms.mergeSort(data);
        ms.printArray(data);
        System.out.println("menggunakan binary search");
        posisi = pencarian.FindBinarySearch(cari, data, 0, data.length - 1);
        pencarian.Tampilposisi(cari, posisi);
    }
}


