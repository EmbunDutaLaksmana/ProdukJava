package Praktikum_PBO_3;
import Praktikum_PBO_3.Another_Praktikum_PBO_3.Mobil;
public class Testmobil {
    public static void main(String[] args) {
        Mobil m1=new Mobil();
        Mobil m2=new Mobil();  
        
        m1.setmerek("Toyota");
        m2.setwarna("Hitam");
        
        m1.berimerek();
        m2.beriwarna();
 }
}