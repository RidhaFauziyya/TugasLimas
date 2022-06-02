/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanpboapril;

import bangun3D.Balok;
import bangun3D.Kubus;
import bangun2D.Persegi;

public class LatihanApril {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Balok b1 = new Balok(5, 10, 7);
        System.out.println(b1);
        Double c = b1.getLuasAlas();
        System.out.println(c);
        
        Persegi p1 = new Persegi(10);
        System.out.println(p1.getLuas());
        
        Kubus k1 = new Kubus(5);
        System.out.println(k1);
        Double d = k1.getLuasAlas();
        System.out.println(d);
        System.out.println(k1.getLuas());
        
    }
}
