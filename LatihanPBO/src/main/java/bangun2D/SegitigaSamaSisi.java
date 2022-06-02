/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun2D;
import master.Matematika;
public class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi(double sisi) {
        super(sisi,0);
        super.setTinggi(getTinggi());
    }    
    @Override
    public double getTinggi(){
        double sisi = getAlas();
        double t = sisi*sisi - (sisi/2)*(sisi/2);
        return Math.sqrt((t));
    }
    @Override
    public void setTinggi(double tinggi) {
        double alasBaru = Matematika.getLurus(getAlas(), getAlas()/2);
        setAlas(alasBaru);
    }  
    @Override
    public double getKeliling() {
        return 3 * getAlas();
    }
    @Override
    public String toString() {
        return "SegitigaSamaSisi{" + "sisi=" + getAlas()+ '}';
    } 
}
