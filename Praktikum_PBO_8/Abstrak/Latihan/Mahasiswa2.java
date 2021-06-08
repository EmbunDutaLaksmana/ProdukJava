package Praktikum_PBO_8.Abstrak.Latihan;
public class Mahasiswa2 extends Nilai{
    private String nama,nmatkul;
    private double nilai;

    public Mahasiswa2(String nama, String nmatkul, double nilai) {
        this.nama = nama;
        this.nmatkul = nmatkul;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getNmatkul() {
        return nmatkul;
    }

    public double kalkulasi() {
        return nilai;
    }
    
    @Override
    public double getnilaiTinggi() {
        return ;
    }

    @Override
    public double getnilaiRata2() {
        return ;
    }   
}
