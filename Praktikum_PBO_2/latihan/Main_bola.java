package Praktikum_PBO_2.latihan;
import java.util.Scanner;
public class Main_bola {
   public static void main(String[] args){
       Scanner obj = new Scanner(System.in);
        double ri;
        Prototipe_bola b1 = new Prototipe_bola();
        Prototipe_bola b2 = new Prototipe_bola();
        
        System.out.println("Luas Permukaan dan Volume Bola \n");
        System.out.println("Masukkan value Rusuk : ");
        ri = obj.nextDouble();
        
        System.out.println("Luas Permukaan = " +  b1.luasPermukaan(ri));
        
        System.out.println("Volume Bola = "+ b2.volumeBola(ri));
    }  
}