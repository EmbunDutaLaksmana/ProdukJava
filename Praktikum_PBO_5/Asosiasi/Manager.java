package Praktikum_PBO_5.Asosiasi;
public class Manager {
  private String nama;
  private String[] karyawan = new String[5];
  private int jmlh;
  
  public String getNama() {
    return this.nama;
  }
  public void setNama(String nama) {
    this.nama = nama;
  }
  public String getKaryawan(int karyawn) {
    return this.karyawan[karyawn];
  }
  public void setKaryawan(String karywan) {
    if (this.jmlh < this.karyawan.length) {
      this.karyawan[this.jmlh] = karywan;
      this.jmlh++;
    } 
  }
  public int getJmlh() {
    return this.jmlh;
  }
  public void setJmlh(int jmlh) {
    this.jmlh = jmlh;
  }
}