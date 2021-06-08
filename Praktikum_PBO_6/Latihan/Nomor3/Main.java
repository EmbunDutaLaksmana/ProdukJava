package Praktikum_PBO_6.Latihan.Nomor3;
public class Main {
    public static void main(String[] args) {
     KepalaBagian KB=new KepalaBagian();
     System.out.println("Nama: "+KB.getNama());
     System.out.println("Jenis: "+KB.getJenisPegawai());
     KB.total();
        System.out.println("");
     Manager M=new Manager();
     System.out.println("Nama: "+M.getNama());
     System.out.println("Jenis: "+M.getJenisPegawai());
     M.total();
        System.out.println("");
     StaffMarketing SM=new StaffMarketing();
     System.out.println("Nama: "+SM.getNama());
     System.out.println("Jenis: "+SM.getJenisPegawai());
     SM.total();
        System.out.println("");
     Programmer P=new Programmer();
     System.out.println("Nama: "+P.getNama());
     System.out.println("Jenis: "+P.getJenisPegawai());
     P.totalgaji();
        System.out.println("");
     SystemAnalis SA=new SystemAnalis();
     System.out.println("Nama: "+SA.getNama());
     System.out.println("Jenis: "+SA.getJenisPegawai());
     SA.totalgaji();
    }
}
