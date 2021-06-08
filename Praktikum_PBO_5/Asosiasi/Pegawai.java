package Praktikum_PBO_5.Asosiasi;
public class Pegawai {
  private String nama = "";
  private double gaji = 0;
  public void setNama(String nama) {
    this.nama = nama;
  }
  public void setGaji(double gaji) {
    this.gaji = gaji;
  }
  public String getNama() {
    return this.nama;
  }
  public double getGaji() {
    return this.gaji;
  }
}