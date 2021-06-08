 package Praktikum_PBO_5.Agregasi;
public class MobilPemilik_Main {
  public static void main(String[] args) {
    Mobil M = new Mobil("", "", 0);
    M.setMerek("Toyota");
    M.setNoPlat("1234");
    M.setTahunKeluaran(2002);
    
    Pemilik P = new Pemilik("embun", "sungai selodang", 1, M);
    for (int i = 0; i < 1; i++) {
      System.out.println("Pemilik: ");
      System.out.println("Nama: " + P.getNama());
      System.out.println("Alamat:" + P.getAlamat());
      System.out.println("Jumlah Mobil= " + P.getJmlhMobil());
      System.out.println("No. plat: " + P.mobil.getTahunKeluaran());
      System.out.println("Merek: " + P.mobil.getMerek());
      System.out.println("No. Plat: " + P.mobil.getNoPlat());
      P.BeliMobil();
      P.JualMobil();
    } 
  }
}
