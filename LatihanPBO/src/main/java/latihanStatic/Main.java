/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanStatic;

public class Main {
    public static void main(String[] args) {
        //System.out.println(Mahasiswa.prodi);
        //System.out.println(Mahasiswa.nama);
        
        Mahasiswa st1 = new Mahasiswa("Mr X satu");
        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());
        
        Mahasiswa st2 = new Mahasiswa("Mr K dua");
        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());
       
        st1.setProdi("Teknologi RPL");
        st1.setNama("Agus");
        st2.setProdi("Teknologi Rekayasa Perangkat Lunak");
        st2.setNama("Budi");
        
        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());
        
        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());
        
        Mahasiswa.setProdi("Software Engineering Technology");
        
        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());
        
        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());
    }
    
}
