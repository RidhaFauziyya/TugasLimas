/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun3D;
import master.Matematika;

public class Kerucut extends Tabung{

    public Kerucut(double r, double tinggi) {
        super(r, tinggi);
    }
    
    @Override
    public double getLuas(){
        return getLuasAlas() + Matematika.phi*getR()*getSisiMiring();
    }
    
    public double getSisiMiring(){
        double s = Matematika.getMiring(getR(), getTinggi());
        return s;
    }
    
    @Override
    public double getVolume(){
        return super.getVolume()/3;
    }

    @Override
    public String toString() {
        return "Kerucut{" + "r" + getR() + "tinggi=" + getTinggi()+ '}';
    }

}
