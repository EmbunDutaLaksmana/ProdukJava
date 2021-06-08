package Praktikum_PBO_6.Latihan.Nomor1;
public class Lingkaran extends BangunDatar{
    String nama;
    double r;
    public Lingkaran(String nama, double r) {
        this.nama = nama;
        this.r = r;
    }
    public Lingkaran() {
        this.r =0;
    }
    @Override
    public double luas(){
        super.luas();
        return 3.14*r*r;
    }
    @Override
    public double keliling(){
        super.keliling();
        return 3.14*2*r;
    }
}