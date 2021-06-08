package Praktikum_PBO_5.Agregasi;

public class Mahasiswa_JurusanMain {
  public static void main(String[] args) {
    Jurusan j = new Jurusan();
    j.setKod_juru("12");
    j.setNam_juru("Teknik Informatika");
    Mahasiswa M = new Mahasiswa("", "", j);
    M.setNama("Embun");
    M.setNIM("2055301037");
    for (int i = 0; i < 1; i++) {
      System.out.println("Nama: "+M.getNama());
      System.out.println("NIM: "+M.getNIM());
      M.juru.Keterangan();
    } 
  }
}
