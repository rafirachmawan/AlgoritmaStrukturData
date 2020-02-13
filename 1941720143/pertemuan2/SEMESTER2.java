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
public class SEMESTER2 {
    public static void main (String []args){
    double tugas,uts,uas,nilai,hasilakhir;
    Scanner rafi =new Scanner (System.in);
    
System.out.println("masukan nilai tugas");
tugas = rafi.nextDouble();
System.out.println("masukan nilai uts");
uts = rafi.nextDouble();
System.out.println("masukan nilai uas");
uas =rafi.nextDouble();

nilai = tugas*0.2 + uts*0.35 + uas*0.45 ;

    if (tugas >=0 && tugas <=100 ){
        tugas =tugas*0.2;
           
    }else if (uts >=0 && uts<=100 ) {
        uts = uts*0.35;
        
    }else if (uas >=0 && uas<=100 ) {
        uas = uas*0.45;
        
        hasilakhir= tugas + uts + uas;
                System.out.println("nilai anda ="+hasilakhir);
        
  
            
            
    

            }
    }
}

    
   


