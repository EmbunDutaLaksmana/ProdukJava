package Praktikum_PBO_5.Komposisi;
public class DataMain {
    public static void main(String[] args) {
     Pembeli P=new Pembeli();
     
        System.out.println("Nama Pembeli: ");
        P.setNama("Embun");
        String nam= P.getNama();
        System.out.println(nam);
        
        System.out.println("Kode Pembeli: ");
        P.setKodli("A-12");
        String ko=P.getKodli();
        System.out.println(ko);
        
        System.out.println("Nama Barang: ");
        String naba=P.getNamaBarang();
        System.out.println(naba);
        
        System.out.println("Kode Barang: ");
        String koba=P.getKodeBarang();
        System.out.println(koba);
    }
}