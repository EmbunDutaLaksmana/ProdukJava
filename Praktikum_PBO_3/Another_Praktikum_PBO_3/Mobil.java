package Praktikum_PBO_3.Another_Praktikum_PBO_3;

public class Mobil {
private String warna;
private String merek;

public Mobil(){
    warna="";
    merek="";
 }
  
 public String getmerek(){
      return merek;
  }
  public void setmerek(String Merek){
      this.merek=Merek;
  }
  
  public String getwarna(){
      return warna;
  }
  public void setwarna(String Warna){
      this.warna=Warna;
  }
  
  public void beriwarna(){
     System.out.println("warna mobil ini adalah "+warna);
 }
  public void berimerek(){
     System.out.println("merek mobil ini adalah "+merek);
 }
}
