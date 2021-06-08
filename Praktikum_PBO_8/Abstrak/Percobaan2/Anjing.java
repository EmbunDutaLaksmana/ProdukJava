package Praktikum_PBO_8.Abstrak.Percobaan2;
/**
 *
 * @author Embun Duta Laksmana
 */
public class Anjing extends Hewan{ 
   private String nama;
   Anjing(String nama){
       super("Anjing");
       this.nama=nama;
   }
   @Override
   public void suara(){
       System.out.println("Mengsedih");
   }
   public String toString(){
       return super.toString()+" "+nama;
   }
}