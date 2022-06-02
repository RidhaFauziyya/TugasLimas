/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanpboapril;
import bangun2D.*; 
import bangun3D.Limas;

public class LatihanAprilLimas {

    public static void main(String[] args) {
        Bangun2D persegi = new Persegi(10);
        Bangun2D pp = new PersegiPanjang(4, 8);
        Bangun2D lingkaran = new Lingkaran(10);
        Bangun2D siku = new SegitigaSiku(3, 4);
        Bangun2D kaki = new SegitigaSamaKaki(3, 4);
        Limas limas1 = new Limas(persegi, 12);
        Limas limas2 = new Limas(pp, 5);
        Limas limas3 = new Limas(lingkaran,5);
        Limas limas5 = new Limas(kaki,5);
        
        System.out.println(limas1);
        System.out.println(limas1.getVolume());
        System.out.println(limas1.getDetailAlas());
        System.out.println("-------------------------");
        System.out.println(limas2);
        System.out.println(limas2.getVolume());
        System.out.println(limas2.getDetailAlas());
        System.out.println("-------------------------");
        System.out.println(limas3);
        System.out.println(limas3.getVolume());
        System.out.println(limas3.getDetailAlas());
        System.out.println("-------------------------");
        System.out.println(limas5);
        System.out.println(limas5.getVolume());
        System.out.println(limas5.getDetailAlas());
        System.out.println("-------------------------");
        
        try {
        Limas x = new Limas(null,4);
        System.out.println(x);
        System.out.println(x.getVolume());
        System.out.println(x.getDetailAlas());
        System.out.println("-------------------------");
        } catch (NullPointerException npe) {
        System.out.println("Nilai Alas Limas null");
        System.out.println("Nilai alas limas tidak boleh null");
        } finally{
        System.out.println("Program Selesai");
        }
        
    }
    
}
