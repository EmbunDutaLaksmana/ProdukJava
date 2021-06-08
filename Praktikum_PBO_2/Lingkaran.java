package Praktikum_PBO_2;
public class Lingkaran {
     double jari_jari;
    final double pi=3.14;
    
    double luasLingkaran(){
        double luas=2*pi*jari_jari;
        return luas;
    }
    
    double kelLingkaran(){
        double kel=pi*jari_jari*jari_jari;
        return kel;
    }
    
    void status(){
        System.out.println("Program selesai...");
    }
}
