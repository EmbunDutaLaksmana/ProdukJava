package Praktikum_PBO_6.Latihan.Nomor3;
public class SystemAnalis extends PegawaiKontrak{
  public String nama,jenisPegawai;
    public SystemAnalis(String nama, String jenisPegawai) {
        this.nama = nama;
        this.jenisPegawai = jenisPegawai;
    }
    public SystemAnalis() {
        this.nama ="embun";
        this.jenisPegawai = "pegawai kontrak";
    }
    public String getNama() {
        return nama;
    }
    public String getJenisPegawai() {
        return jenisPegawai;
    }
  @Override
    public double getGajitetap() {
        return gajitetap;
    }
  @Override
    public double getBonusproject() {
        return bonusproject;
    }
  @Override
    public double getBonuslembur() {
        return bonuslembur;
    }
  @Override
    public double getNilaiprojek() {
        return nilaiprojek;
    }   
   public void totalgaji(){
        System.out.println("total gaji: "+(getGajitetap()+getBonusproject()+
                (getNilaiprojek()*getBonuslembur())));
    }
}