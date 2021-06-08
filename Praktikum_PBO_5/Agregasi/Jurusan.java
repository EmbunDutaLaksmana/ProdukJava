package Praktikum_PBO_5.Agregasi;
public class Jurusan {
  private String nam_juru;
  private String kod_juru;
  
  public String getNam_juru() {
    return this.nam_juru;
  }
  public void setNam_juru(String nam_juru) {
    this.nam_juru = nam_juru;
  }
  public String getKod_juru() {
    return this.kod_juru;
  }
  public void setKod_juru(String kod_juru) {
    this.kod_juru = kod_juru;
  }
  public void Keterangan() {
    System.out.println("Nama Jurusan: " + getNam_juru() +"\n"
            + "Kode Jurusan: " + getKod_juru());
  }
}
