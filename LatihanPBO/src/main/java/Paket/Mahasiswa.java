/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paket;

public class Mahasiswa extends Manusia{
    
    private String nama;

    public Mahasiswa(String nama) {
        super(nama);
        this.nama = nama;
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama+nama);
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nama=" + nama + '}';
    }
   
}
