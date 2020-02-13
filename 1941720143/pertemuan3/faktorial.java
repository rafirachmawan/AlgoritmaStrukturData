/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Raffi
 */
public class faktorial {
    public int  nilai ; 
    public int faktorialbf(int n){
        int fakto  = 1 ;
        for ( int i = 1; i<n; i++){
            fakto = fakto * i ;
        }
        return fakto ;
    }
    public int faktorialdc(int n ){
        if (n==1) { 
            return 1;
        }
        else{
            int fakto = n * faktorialdc(n-1);
            return fakto ;
        } 
    }
    
}
