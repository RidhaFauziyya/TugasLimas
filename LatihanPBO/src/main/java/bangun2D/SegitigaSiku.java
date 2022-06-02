/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun2D;
import master.Matematika;

public class SegitigaSiku extends Segitiga{

    public SegitigaSiku(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double getKeliling() {
        return getAlas()+ getTinggi() + getSisiMiring();
    }
    
    public double getSisiMiring(){
        return Matematika.getMiring(getAlas()/2, getTinggi());
    }

    @Override
    public String toString() {
        return "SegitigaSiku{" + "a=" + getAlas()+", t=" + getTinggi()+ '}';
    }
    
}
