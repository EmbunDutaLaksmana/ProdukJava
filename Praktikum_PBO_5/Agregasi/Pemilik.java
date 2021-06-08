package Praktikum_PBO_5.Agregasi;
public class Pemilik {
  private String nama;
  private String alamat;
  private int jmlhMobil;
  private String[] noPlatMobil = new String[5];
  Mobil mobil;
  Pemilik(String a, String b, int c, Mobil obil) {
    this.nama = a;
    this.alamat = b;
    this.jmlhMobil = c;
    this.mobil = obil;
  }
  public String getNama() {
    return this.nama;
  }
  public void setNama(String nama) {
    this.nama = nama;
  }
  public String getAlamat() {
    return this.alamat;
  }
  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }
  public int getJmlhMobil() {
    return this.jmlhMobil;
  }
  public void setJmlhMobil(int jmlhMobil) {
    this.jmlhMobil = jmlhMobil;
  }
  public String getNoPlatMobil(int NOM) {
    return this.noPlatMobil[NOM];
  }
  public void setNoPlatMobil(String NOM) {
    if (this.jmlhMobil < this.noPlatMobil.length) {
      this.noPlatMobil[this.jmlhMobil] = NOM;
      this.jmlhMobil++;
    } 
  }
  public void JualMobil() {
    System.out.println("pemilik menjual mobil");
  }
  public void BeliMobil() {
    System.out.println("pemilik membeli mobil");
  }
}
