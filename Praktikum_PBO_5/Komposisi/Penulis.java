package Praktikum_PBO_5.Komposisi;
public class Penulis {
  private Buku buk;
  public Penulis() {
    this.buk = new Buku("", "");
    this.buk.setNam_buk("Laskar Pelangi");
    this.buk.setKod_buk("123");
  }
  
  public String getkodbuku() {
    return this.buk.getKod_buk();
  }
  
  public String getnambuku() {
    return this.buk.getNam_buk();
  }
}
