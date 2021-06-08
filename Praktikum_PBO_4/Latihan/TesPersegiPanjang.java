package Praktikum_PBO_4.Latihan;
import java.util.Scanner;
public class TesPersegiPanjang {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,k,panjang=0,lebar=0;
        System.out.println("masukkan jumlah data");
        k= in.nextInt();
        
        PersegiPanjang PP[]=new PersegiPanjang[k];
        
        for (i = 0; i < k;i ++) {
            PP[i]=new PersegiPanjang();
        }
        for (i = 0; i < k; i++) {
            System.out.println("masukkan data ke-"+(i+1));
            System.out.println("panjang"+(i+1));
            panjang=in.nextInt();
            PP[i].setPanjang(panjang);
            System.out.println("lebar"+(i+1));
            lebar=in.nextInt();
            PP[i].setLebar(lebar);
        }
        System.out.println("");
        System.out.println("Output");
        System.out.println("panjang\tlebar\tkeliling\tluas");
        for (i = 0; i < k;i ++) {
            System.out.println(PP[i]);
        }
    }
}