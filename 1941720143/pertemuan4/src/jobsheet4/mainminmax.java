/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4;

import java.util.Scanner;
import static jobsheet4.mainmaxmin.max_min;

/**
 *
 * @author Raffi
 */
public class mainminmax {
public static void main(String[] args){
        minmax[] ppArray = new minmax[5];
        ppArray[0] = new minmax();
        Scanner rafi = new Scanner(System.in);
        
        for (int i=0; i<5; i++)
        {
            ppArray[i] = new minmax();
            System.out.println("NIlai Array Index ke-" + i);
            System.out.println("Masukkan Nilai : ");
            ppArray[i].nilaiaray =rafi.nextInt();
        }
        
        
    
        
        
        int min = ppArray[0].nilaiaray;
        int max = ppArray[0].nilaiaray;
        
        for(int i=0; i<5; i++)
        {
            if(ppArray[i].nilaiaray<min)
                min=ppArray[i].nilaiaray;
            else if(ppArray[i].nilaiaray>max)
                max=ppArray[i].nilaiaray;
        }
        System.out.println("Brute Force");
        System.out.println("Nilai Minimal : " + min);
        System.out.println("Nilai Maksimal : " + max);
        
        int arr [] = new int [5];
        for (int i = 0 ; i<5 ; i++){
            arr [i] =ppArray[i].nilaiaray ;
            
        }
            maxmin hasil = new maxmin ();
            max_min(arr,0,4,hasil);
           
            System.out.println("divide conguer");
            System.out.println("nilai minimal : " + hasil.minimum + "\nNilai maksimaly :" +hasil.maximum);
            System.out.println("\n");
        
    }
}

