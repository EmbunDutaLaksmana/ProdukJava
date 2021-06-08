package Praktikum_PBO_5.Komposisi;
public class BukuLis_Main {
  public static void main(String[] args) {
    Penulis Tulis = new Penulis();
    String tuli1 = Tulis.getkodbuku();
    String tuli2 = Tulis.getnambuku();
    System.out.print("kode buku: ");
     System.out.println(tuli1);
    System.out.print("nama buku: ");
     System.out.println(tuli2);
  }
}
