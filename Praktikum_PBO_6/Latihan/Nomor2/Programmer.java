package Praktikum_PBO_6.Latihan.Nomor2;
public class Programmer extends Pegawai{
    protected double gajibonus;
    public Programmer() {
        this.gajibonus =2000000;
    }
    public void program(){
        super.pegawai();
        System.out.println("ini adalah class programmer");
    }
    public double getGajibonus() {
        return gajibonus;
    }
    public double getGajipokok() {
        return gajipokok;
    }
    public double getGajiTotal() {
        return gajipokok+gajibonus;
    }
    public void aturankhusus(){
        System.out.println("Programmer melakukan monitoring"
                + " sistem perusahaan");
        System.out.println("programmer melayani error complain");
    }
}