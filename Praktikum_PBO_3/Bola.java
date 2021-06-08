package Praktikum_PBO_3;
public class Bola {
  private double jari;
  private String jenis;

 public Bola(){
     this.jari=4;
     this.jenis="Bola Pingpong";
 }  

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
   
    void tampil(){
        System.out.println("Jari-jari= "+jari);
        System.out.println("Jenis Bola= "+jenis);
        System.out.println("Volume bola= "+(4/3*3.14*jari*jari*jari));
    }
}
