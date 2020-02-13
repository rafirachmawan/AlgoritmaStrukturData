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
public class perulangan2 {
    public static void main (String [] args){
        Scanner rafi = new Scanner(System.in);
        System.out.print("Masukkan jumlah saldo Anda: ");
        double saldoawal = rafi.nextInt();
        
        for (int i=1; i<=25; i++){
            saldoawal = saldoawal+20000;
            System.out.println("Saldo bulan ke-"+i+": "+saldoawal);
        }
        
        
    }
}
