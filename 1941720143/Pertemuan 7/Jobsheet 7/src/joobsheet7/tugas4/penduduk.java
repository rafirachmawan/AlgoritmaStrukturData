/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joobsheet7;

/**
 *
 * @author Rafi Rachmawan
 */
public class penduduk {
  public int nik;
    public String nama, alamat, jenisK;

    public penduduk(int NIK, String nm, String al, String jk) {
        nik = NIK;
        nama = nm;
        alamat = al;
        jenisK = jk;
    }

    penduduk(int nik, String nama, String alamat, String jenisK) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
  

