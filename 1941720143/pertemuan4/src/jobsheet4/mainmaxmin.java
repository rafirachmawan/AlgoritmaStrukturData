/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4;

/**
 *
 * @author Raffi
 */
public class mainmaxmin {
    public static void max_min(int [] arr, int indekawal, int indekakhir, maxmin hasil){
        int indektengah ;
        maxmin hasil1 = new maxmin() ;
        maxmin hasil2 = new maxmin() ;
        
        if (indekawal == indekakhir ){
            hasil.minimum = hasil.maximum = arr[indekawal];
        }else if (indekakhir - indekawal == 1){
          if (arr[indekawal] > arr[indekakhir]){
              hasil.minimum = arr[indekakhir];
              hasil.maximum = arr[indekawal];
          }else {
              hasil.minimum = arr[indekawal];
              hasil.maximum = arr[indekakhir];
          }
          
        }else{
            indektengah = (indekawal + indekakhir)/2;
            max_min(arr,indekawal,indektengah,hasil1);
            max_min(arr,indektengah + 1,indekakhir,hasil2);
            
            hasil.minimum = (hasil1.minimum < hasil2.minimum) ? hasil1.minimum : hasil2.minimum ;
            hasil.maximum = (hasil1.maximum > hasil2.maximum) ? hasil1.maximum : hasil2.maximum ;
        }
        
 //       if (indekawal == indekakhir){
 //           hasil.minimum =hasil.maximum = arr[indekawal];
          
 //       }else if (indekakhir - indekawal ==1){
  //          if(arr[indekawal] > arr[indekakhir]){
   //             hasil.minimum = arr[indekakhir];
  //              hasil.maximum = arr[indekawal];
                
    //        }else {
     //           hasil.minimum = arr[indekawal];
     //           hasil.maximum = arr[indekakhir];
     //       }
    //    }else{
            
   //     }
        
    }
}
