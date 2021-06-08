package Praktikum_PBO_5.Komposisi;
public class Buku {
  private String kod_buk;
  private String nam_buk;
  Buku(String koBuk, String nabuk) {
    this.kod_buk = koBuk;
    this.kod_buk = nabuk;
  }
  
  public String getKod_buk() {
    return this.kod_buk;
  }
  
  public void setKod_buk(String kod_buk) {
    this.kod_buk = kod_buk;
  }
  
  public String getNam_buk() {
    return this.nam_buk;
  }
  
  public void setNam_buk(String nam_buk) {
    this.nam_buk = nam_buk;
  }
}
