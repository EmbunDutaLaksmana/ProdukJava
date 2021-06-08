package Praktikum_PBO_8.Abstrak.Latihan;
public class Mahasiswa1 extends Nilai{
    private String nama,nmatkul;
    private double nilaiTinggi,nilaiRata2,nilai;

    public Mahasiswa1(String nama, String nmatkul, double nilaiTinggi, double nilaiRata2, double nilai) {
        this.nama = nama;
        this.nmatkul = nmatkul;
        this.nilaiTinggi = nilaiTinggi;
        this.nilaiRata2 = nilaiRata2;
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
        return nilaiTinggi;
    }

    @Override
    public double getnilaiRata2() {
        return nilaiRata2;
    }   
}
