/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan44.hukumohm;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program :
 */
public class Baterai {
    
    private float kuatArus, hambatan;
    
    public Baterai() {
        System.out.println("=====Hukum Ohm=====" +
                "\nKuat arus yang mengalir pada suatu kawat pengantar" +
                "\nakan berbanding lurus dengan beda potensial" + 
                "\npada ujung-ujung kawat penghantar tersebut" +
                "\nasalkan suhu kawat dijaga konstan."
        );
    }
    
    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
        System.out.println("\nKuat Arus\t: " + kuatArus + " ampere");
        System.out.println("Hambatan\t: " + hambatan + " ohm");
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan() {
        System.out.println("Hasil Tegangan  : " + (kuatArus * hambatan) + " volt");
        return kuatArus * hambatan;
    }

}
