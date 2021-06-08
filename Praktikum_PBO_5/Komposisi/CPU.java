package Praktikum_PBO_5.Komposisi;
public class CPU {
 private String tipe;
 private String merk;
 
 public CPU(String tipe, String merk){
     this.tipe=tipe;
     this.merk=merk;
 }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return this.tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
 
}