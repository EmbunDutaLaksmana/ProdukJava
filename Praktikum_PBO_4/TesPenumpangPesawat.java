package Praktikum_PBO_4;
import java.util.Scanner;
public class TesPenumpangPesawat {
    public static void main(String[] args) {
        int n,i;
        String nama,jk,tujuan,kelas;
        
        Scanner input=new Scanner (System.in);
        
        System.out.println("Masukkan jumlah "
                + "penumpang yang akan diinputkan");
        n=Integer.parseInt(input.nextLine());
        
        //deklarasi
        PenumpangPesawat penumpang[]=new PenumpangPesawat[n];
        
        //inisiasi
        for (i = 0;  i< n; i++) {
            penumpang[i]=new PenumpangPesawat();
        }
        
        //input data
        for ( i = 0; i < n; i++) {
        System.out.println("masukkan data penumpang ke-"+(i+1));
        System.out.println("masukkan nama penumpang");
        nama=input.nextLine();
        System.out.println("masukkan jenis kelamin penumpang");
        jk=input.nextLine();
        System.out.println("masukkan tujuan penumpang");
        tujuan=input.nextLine();
        System.out.println("masukkan kelas penumpang");
        kelas=input.nextLine();
        
        System.out.println();
        
        penumpang[i].setNama(nama);
        penumpang[i].setJk(jk);
        penumpang[i].setTujuan(tujuan);
        penumpang[i].setKelas(kelas);
        }
        
        //showdata
        System.out.println("Detil penupang yang telah diinputkan");
        System.out.println("Nama\tJK\tTujuan\tkelas");
        for (i = 0; i < n; i++) {
            System.out.println(penumpang[i].getNama()+"\t"+
                    penumpang[i].getJk()+
                    "\t"+penumpang[i].getTujuan()+"\t"+
                    penumpang[i].getKelas());
        }
    }
}
