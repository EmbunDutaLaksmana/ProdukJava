package Praktikum_PBO_3;
public class MainTiket {
    public static void main(String[] args) {
     Tiket tiket1= new Tiket();
     Tiket tiket2= new Tiket();
          
        System.out.println("Tiket 1");
        tiket1.tampil();
        System.out.println("");
        
        System.out.println("Tiket 2");
        tiket2.setNama_maskapai("Citilink");
        tiket2.setNo_kursi("A5");
        tiket2.setKeberangkatan("05.30");
        tiket2.setTanggal_terbang("01-April-2020");
        tiket2.tampil();
        System.out.println("");
        
        System.out.println("Update data:");
        System.out.println("Tiket 1");
        tiket2.setNama_maskapai("Garuda Indonesia");
        tiket2.setNo_kursi("C12");
        tiket2.setKeberangkatan("11.00");
        tiket2.setTanggal_terbang("01-April-2020");
        tiket1.tampil();
        System.out.println("");
        
        System.out.println("Tiket 2");
        tiket2.setNama_maskapai("Citilink");
        tiket2.setNo_kursi("A5");
        tiket2.setKeberangkatan("13.00");
        tiket2.setTanggal_terbang("01-April-2020");
        tiket2.tampil();
        System.out.println("");
    }
}