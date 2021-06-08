package Praktikum_PBO_4.Latihan;
import java.util.Scanner;
public class mahasiswa {
 private String nama,nim,jurusan;
 
 public mahasiswa(){
     this.nama=" ";
     this.nim=" ";
     this.jurusan=" ";
 }

    public void getdata() {
      Scanner in=new Scanner(System.in);
      
        System.out.println("masukkan nama");
        nama=in.nextLine();
        System.out.println("masukkan nim");
        nim=in.nextLine();
        System.out.println("masukkan jurusan");
        jurusan=in.nextLine();
    }
    
    public void hasil (){
        System.out.println(nama+"\t"+nim+"\t"+jurusan);
    }
}