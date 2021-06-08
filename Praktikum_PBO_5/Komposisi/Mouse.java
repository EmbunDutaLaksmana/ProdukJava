package Praktikum_PBO_5.Komposisi;
public class Mouse {
    private String merk;
    private String tipe;
    public Mouse(String merk,String tipe){
        this.merk=merk;
        this.tipe=tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
}