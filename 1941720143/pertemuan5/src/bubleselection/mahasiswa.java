/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubleselection;

/**
 *
 * @author Raffi
 */
public class mahasiswa {
    String nama ;
    int thnmasuk, umur ;
    double ipk ;
    
    mahasiswa(String n, int t , int u, double i){
        nama = n;
        thnmasuk = t ;
        umur = u;
        ipk = i ;
    }

    mahasiswa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void tampil (){
        System.out.println("nama = " + nama );
        System.out.println("tahun masuk " + thnmasuk);
        System.out.println("umur =" + umur);
        System.out.println("IPK" + ipk);
        
    }
}
