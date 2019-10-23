/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan63.gradiengarislurus;

/**
 *	
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program dengan konsep abstraksi untuk menghitung
 * gradien
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat g1, g2;
        
        g1 = new Koordinat(2, 10, 5, 7);
        g2 = new Koordinat(5, 1, 3, 12);
        
        tampilHasil(g1.getX1(), g1.getX2(), g1.getY1(), g1.getY2(), g1.hitungGradien());
        tampilHasil(g2.getX1(), g2.getX2(), g2.getY1(), g2.getY2(), g2.hitungGradien());
    }
    public static void tampilHasil(int x1,int y1,int x2,int y2, int gradien){
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d, %d)%n"
                + "memiliki gradien sebesar %d%n", x1, y1, x2, y2, gradien);
    }
}
