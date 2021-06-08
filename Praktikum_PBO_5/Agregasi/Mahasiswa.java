package Praktikum_PBO_5.Agregasi;
public class Mahasiswa {
  private String Nama;
  private String NIM;
  private int jumlh;
  private String[] mahas;
  Jurusan juru;
  Mahasiswa(String nama, String Nim, Jurusan jur) {
    this.Nama = nama;
    this.NIM = Nim;
    this.juru = jur;
  }
  public String getNama() {
    return this.Nama;
  }
  public void setNama(String Nama) {
    this.Nama = Nama;
  }
  public String getNIM() {
    return this.NIM;
  }
  public void setNIM(String NIM) {
    this.NIM = NIM;
  }
  public int getJumlh() {
    return this.jumlh;
  }
  public void setJumlh(int jumlh) {
    this.jumlh = jumlh;
  }
  public String getMahas(int jumlh) {
    return this.mahas[jumlh];
  }
  public void setMahas(String mahas) {
    if (this.jumlh < this.mahas.length) {
      this.mahas[this.jumlh] = mahas;
      this.jumlh++;
    } 
  }
}
