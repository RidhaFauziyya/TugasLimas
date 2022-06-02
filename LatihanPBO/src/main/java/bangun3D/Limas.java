/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun3D;
import bangun2D.*; 

public class Limas {
    private Bangun2D alas;
    private double tinggi;

    public Limas(Bangun2D alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        
    }

    public Bangun2D getAlas() {
        return alas;
    }

    public void setAlas(Bangun2D alas) {
        this.alas = alas;
    }
    

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public String getVolume(){
        if (alas instanceof Persegi){
            return "Volume Limas: " + alas.getLuas() * tinggi * 1/3;
        }
        else if(alas instanceof PersegiPanjang){
            return "Volume Limas: " + alas.getLuas() * tinggi * 1/3;
        }
        else if(alas instanceof Lingkaran){
            return "Volume Limas: " + alas.getLuas() * tinggi * 1/3;
        } 
        else if(alas instanceof SegitigaSiku){
            return "Volume Limas: " + alas.getLuas() * tinggi * 1/3;
        }
        else if(alas instanceof SegitigaSamaKaki){
            return "Volume Limas: " + alas.getLuas() * tinggi * 1/3;
        }
        else if(alas instanceof SegitigaSamaSisi){
            return "Volume Limas: " + alas.getLuas() * tinggi * 1/3;
        }
        else{
            return "Volume Limas: " + alas.getLuas() * tinggi * 1/3;
        }
    }
    
    public String getDetailAlas(){
        if (alas instanceof Persegi){
            return "Alas: Persegi";
        }
        else if (alas instanceof PersegiPanjang){
            return "Alas: Persegi Panjang";
        }
        else if (alas instanceof Lingkaran){
            return "Alas: Lingkaran";
        }
        else if (alas instanceof SegitigaSiku){
            return "Alas: Segitiga Siku-Siku";
        }
        else if (alas instanceof SegitigaSamaSisi){
            return "Alas: Segitiga Sama Sisi";
        }
        else if (alas instanceof SegitigaSamaKaki){
            return "Alas: Segitiga Sama Kaki";
        }
        else{
            return "Alas: Tidak Diketahui";
        }
    }

    @Override
    public String toString() {
        return "Informasi Limas:" +"\n"+ 
                "alas = " + alas + ", tinggi = " + tinggi;
    }
    
   
}
