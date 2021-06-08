package Praktikum_PBO_6.Latihan.Nomor2;
public class Pegawai {
    protected double gajipokok;
    protected String nama;
    public Pegawai(double gajipokok,String nama) {
        this.gajipokok = gajipokok;
        this.nama=nama;
    }
    public Pegawai() {
        this.gajipokok = 5000000;   
    }
    public void pegawai(){
        System.out.println("ini adalah class pegawai");
    }
    public void aturanumum(){
        System.out.println(nama+" datang tepat waktu");
        System.out.println(nama+" sudah mengisi absen");
        System.out.println(nama+" sudah melakukan meeting mingguan");
    }
    public double gajipokok(){
        return gajipokok; 
    } 
}