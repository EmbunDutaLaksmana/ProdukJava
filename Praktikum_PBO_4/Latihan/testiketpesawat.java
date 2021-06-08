package Praktikum_PBO_4.Latihan;
import java.util.Scanner;
public class testiketpesawat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i,id=0,no=0;
        String pen,mas,jam,harga;
        
        System.out.println("masukkan jumlah data");
        n=input.nextInt();
        tiketpesawat p[] = new tiketpesawat[n];
        
        for ( i = 0; i <n; i++) {
            p[i]= new tiketpesawat();
        }
        
        for (i = 0; i < n; i++) {
            System.out.println("masukkan data manusia ke-"+(i+1));
            System.out.println("masukkan id");
            id=input.nextInt();
            p[i].setId(id);
            
            System.out.println("masukkan nama penumpang");
            pen=input.next();
            p[i].setNama_pen(pen);
            System.out.println("masukkan nama maskapai");
            mas=input.next();
            p[i].setNama_mas(mas);
            System.out.println("masukkan no kursi");
            no=input.nextInt();
            p[i].setN_kur(no);
            System.out.println("masukkan jam penerbangan");
            jam=input.next();
            p[i].setJam(jam);
            System.out.println("masukkan harga");
            harga=input.next();
            p[i].setPrice(harga);
        }
        
        System.out.println("");
        System.out.println("ID\tNAMA PENUMPANG\tNAMA MASKAPAI\tNO KURSI\tJAM PENERBANGAN\tHARGA\tKONFIRMASI");
        for (i = 0; i < n; i++) {
            p[i].tampil();
        }
    }
}
