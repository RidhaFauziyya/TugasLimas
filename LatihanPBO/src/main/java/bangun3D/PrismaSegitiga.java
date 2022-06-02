/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun3D;
import bangun2D.Segitiga;
import bangun2D.SegitigaSamaKaki;
import bangun2D.SegitigaSamaSisi;
import bangun2D.SegitigaSiku;

/**
 *
 * @author Lenovo
 */
public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggi;

    public PrismaSegitiga(Segitiga alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Segitiga getAlas() {
        return alas;
    }

    public void setAlas(Segitiga alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double getVolume(){
        return alas.getLuas() * tinggi;
    }
    
    public double getLuas(){
        return 2*alas.getAlas()+ alas.getKeliling()*tinggi;
    }
    
    public String getDetailAlas(){
        if (alas instanceof SegitigaSiku){
            return "Segitiga Siku-Siku";
        }
        else if (alas instanceof SegitigaSamaKaki){
            return "Segitiga Sama Kaki";
        }
        else if (alas instanceof SegitigaSamaSisi){
            return "Segitiga Sama Sisi";
        }
        else{
            return "Segitiga";
        }
    }

    @Override
    public String toString() {
        return "PrismaSegitiga{" + "alas=" + alas + ", tinggi=" + tinggi + '}';
    }
    
    
    
}
