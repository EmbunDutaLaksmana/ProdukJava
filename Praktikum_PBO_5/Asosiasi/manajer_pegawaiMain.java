package Praktikum_PBO_5.Asosiasi;
public class manajer_pegawaiMain {
  public static void main(String[] args) {
    Pegawai p1 = new Pegawai();
    p1.setNama("embun");
    p1.setGaji(1000);
    
    Pegawai p2 = new Pegawai();
    p2.setNama("duta");
    p2.setGaji(2000);
    
    Manager M1 = new Manager();
    M1.setNama("laksmana");
    M1.setKaryawan(p1.getNama());
    M1.setKaryawan(p2.getNama());
    
    System.out.println("manager: ");
    System.out.println("nama manager: " + M1.getNama());
    System.out.println("Jumlah Pegawai: " + M1.getJmlh());
    for (int i = 0; i < 2; i++)
      System.out.println("Pegawai "+(i+1)+":" + M1.getKaryawan(i)); 
  }
}
