package Praktikum_PBO_8.Abstrak.Percobaan1;
/**
 *
 * @author Embun Duta Laksmana
 */
public class PersegiPanjang extends Pola {
 private int panjang,lebar;
 
 public PersegiPanjang (int panjang, int lebar){
     this.panjang=panjang;
     this.lebar=lebar;
 }
 @Override
 public double getluas(){
     return panjang*lebar;
 }

    @Override
    public String toString() {
        return "Persegi Panjang";
    }
}