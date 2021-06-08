package Praktikum_PBO_6.Latihan.Nomor3;
public class Manager extends PegawaiTetap {
    public String nama,jenisPegawai;
    public Manager(String nama, String jenisPegawai) {
        this.nama = nama;
        this.jenisPegawai = jenisPegawai;
    }
    public Manager() {
        this.nama = "anji";
        this.jenisPegawai ="pegawai tetap";
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
    public double getTunjangan() {
        return tunjangan;
    }
    @Override
    public double getBonuslembur() {
        return bonuslembur;
    }
    public void total(){
        System.out.println("total gaji adalah "
                +(getGajitetap()+getTunjangan()+getBonuslembur()) );
    }
}