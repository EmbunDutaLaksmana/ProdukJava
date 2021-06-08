package Praktikum_PBO_2;
import java.util.Scanner;
public class MainClass {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Lingkaran objLing1 = new Lingkaran();
        Lingkaran objLing2 = new Lingkaran();
        
        System.out.println("Masukkan jari-jari lingkaran: ");
        double jari_jari = input.nextDouble();
        
        objLing1.jari_jari=jari_jari;
        objLing2.jari_jari=jari_jari;
        
        System.out.println("Luas lingkaran"+objLing1.luasLingkaran());
        System.out.println("Keliling lingkaran"+objLing2.kelLingkaran());
        objLing1.status();
    }   
}