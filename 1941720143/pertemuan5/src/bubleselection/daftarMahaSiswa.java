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
public class daftarMahaSiswa {
    mahasiswa listmhs [] = new mahasiswa [5];
    int idx ;
    
    void tambah (mahasiswa m){
        if(idx<listmhs.length){
            listmhs[idx] = m ;
            idx++ ;
            
        }else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil(){
        for (mahasiswa m : listmhs ){
            m.tampil();
            System.out.println("-------------------------");
        }
    }
    void bubleshort(){
        for (int i=0; i<listmhs.length-1; i++){
            for (int j=1; j<listmhs.length-i; j++){
                if(listmhs [j].ipk>listmhs[j-1].ipk){
                    
                    mahasiswa tmp = listmhs [j] ;
                    listmhs[j] = listmhs[j-1];
                    listmhs [j-1] = tmp ;
                    
                }
            }
        }
    }
    
    void selectionsort(){
        for (int i=0; i<listmhs.length-1; i++){
            int idxmin = i ;
            for (int j= i+1 ; j<listmhs.length;  j++ ){
                if (listmhs[j].ipk<listmhs [idxmin].ipk){
                    idxmin =j ;
                }
            }
            mahasiswa tmp = listmhs [idxmin];
            listmhs[idxmin] = listmhs [i] ;
            listmhs[i] = tmp ;
        }
    }
    
    void insertionsort(){
        int i,j;
        for (i=1; i<listmhs.length; i++){
            mahasiswa temp = new mahasiswa ();
            temp = listmhs[i];
            j = i ;
            while ((j>0) && (listmhs[j-1].ipk>temp.ipk)) {
                listmhs[j] = listmhs [j-1] ;
                j-- ;
            }
            listmhs [j] = temp ;
            
        }
    }
            
}
