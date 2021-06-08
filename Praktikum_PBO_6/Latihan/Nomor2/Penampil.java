package Praktikum_PBO_6.Latihan.Nomor2;
public class Penampil {
    public static void main(String[] args) {
      Programmer P=new Programmer();
      P.nama="Programmer";
      P.program();
      P.aturanumum();
      System.out.println("gaji pokok programmer adalah "+ P.getGajipokok());
      P.aturankhusus();
      System.out.println("Bonus gaji adalah "+P.getGajibonus());
      System.out.println("Total gaji: "+P.getGajiTotal());
    }
}