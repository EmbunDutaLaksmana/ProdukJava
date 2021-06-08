package Praktikum_PBO_6.Latihan.Nomor1;
public class Persegi extends BangunDatar{
    String nama;
    double sisi;

    public Persegi(String nama, double sisi) {
        this.nama = nama;
        this.sisi = sisi;
    }
    public Persegi() {
        this.sisi =0;
    }
    @Override
    public double luas(){
        super.luas();
        return sisi*sisi;
    }
    @Override
    public double keliling(){
        super.keliling();
        return 4*sisi;
    }
}