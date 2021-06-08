package Praktikum_PBO_4.Latihan;
import java.util.Scanner;
public class PersegiPanjang {
    Scanner in=new Scanner(System.in);
 private int panjang,lebar;
 
 public PersegiPanjang(){
     this.panjang=0;
     this.lebar=0;
 }
    @Override
    public String toString() {
        return panjang+"\t"+lebar+"\t"+2*(panjang*lebar)+"\t\t"+(panjang*lebar);
    }

    public int getPanjang() {
        return panjang;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public int getLebar() {
        return lebar;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }    
}