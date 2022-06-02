/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun2D;
public class Persegi extends Bangun2D{
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double getLuas(){
        return sisi*sisi;
    }
    
    @Override
    public double getKeliling(){
        return 4*sisi;
    }

    @Override
    public String toString() {
        return "Persegi{" + "sisi=" + sisi + '}';
    } 
}
