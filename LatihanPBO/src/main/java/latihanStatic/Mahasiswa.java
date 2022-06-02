/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanStatic;
public class Mahasiswa {
    private static String prodi="TRPL";
    private String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public static String getProdi() {
        return prodi;
    }

    public static void setProdi(String prodi) {
        Mahasiswa.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void gantiNama(String namaBaru){
        this.nama = nama;
    }
    
    public String tanyaNama(){
        return nama;
    }
    
    public static String tanyaProdi(){
        return prodi;
    }

    public String getDetail() {
        return "Mahasiswa{" + "nama=" + nama +
                "prodi" + prodi + '}';
    } 
}
