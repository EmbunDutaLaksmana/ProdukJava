package Praktikum_PBO_5.Komposisi;
public class Pembeli {
  private String nama;
  private String kodli;
  private Data_Jual jual;
    public Pembeli() {
        this.jual= new Data_Jual();
        jual.setKodeBarang("A-1q");
        jual.setNamaBarang("Apel");
        this.nama = " ";
        this.kodli = " ";
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getKodli() {
        return kodli;
    }
    public void setKodli(String kodli) {
        this.kodli = kodli;
    }
    public String getNamaBarang() { 
        return jual.getNamaBarang();
    }
    public String getKodeBarang() {
        return jual.getKodeBarang();
    }
}