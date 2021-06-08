package Praktikum_PBO_5.Agregasi;
public class Mobil {
  private String merek;
  private String noPlat;
  private long tahunKeluaran;
  
  public Mobil(String a, String b, long c) {
    this.merek = a;
    this.noPlat = b;
    this.tahunKeluaran = c;
  }
  public String getMerek() {
    return this.merek;
  }
  public void setMerek(String merek) {
    this.merek = merek;
  }
  public String getNoPlat() {
    return this.noPlat;
  }
  public void setNoPlat(String noPlat) {
    this.noPlat = noPlat;
  }
  public long getTahunKeluaran() {
    return this.tahunKeluaran;
  }
  public void setTahunKeluaran(long tahunKeluaran) {
    this.tahunKeluaran = tahunKeluaran;
  }
}