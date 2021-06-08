package Praktikum_PBO_3;
public class Tiket {
 private String nama_maskapai;
 private String no_kursi ;
 private String keberangkatan;
 private String tanggal_terbang;
 
 Tiket(){
 nama_maskapai="garuda indonesia";
 no_kursi="null";
 keberangkatan="null";
 tanggal_terbang="null";
 }

    public String getNama_maskapai() {
        return nama_maskapai;
    }

    public void setNama_maskapai(String nama_maskapai) {
        this.nama_maskapai = nama_maskapai;
    }

    public String getNo_kursi() {
        return no_kursi;
    }

    public void setNo_kursi(String no_kursi) {
        this.no_kursi = no_kursi;
    }

    public String getKeberangkatan() {
        return keberangkatan;
    }

    public void setKeberangkatan(String keberangkatan) {
        this.keberangkatan = keberangkatan;
    }

    public String getTanggal_terbang() {
        return tanggal_terbang;
    }

    public void setTanggal_terbang(String tanggal_terbang) {
        this.tanggal_terbang = tanggal_terbang;
    }
 void tampil(){
     System.out.println("Nama Maskapai: "+nama_maskapai);
     System.out.println("Nomor Kursi: "+no_kursi);
     System.out.println("Keberangkatan: "+keberangkatan);
     System.out.println("tanggal terbang: "+tanggal_terbang);
 }
}