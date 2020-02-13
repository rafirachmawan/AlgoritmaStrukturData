/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester.pkg2;

/**
 *
 * @author Raffi
 */
public class array {
    ublic static void main(String[] args) {
    char[] huruf = {'M','I','S','S','I','S','S','I','P','I'};
    int hurufM = 0;
    int hurufI =0;
    int hurufS = 0;
    int hurufP = 0;
        for (int i=0; i<huruf.length; i++) {	      
            if (huruf[i] == 'M') hurufM++;
            if (huruf[i] == 'I') hurufI++;
            if (huruf[i] == 'S') hurufS++;
            if (huruf[i] == 'P') hurufP++;
        }	   
            System.out.println("Total Huruf M : " + hurufM);
            System.out.println("Total Huruf I : " + hurufI);
            System.out.println("Total Huruf S : " + hurufS);
            System.out.println("Total Huruf P : " + hurufP);
    }
}
