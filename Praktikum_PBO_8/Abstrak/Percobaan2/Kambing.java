package Praktikum_PBO_8.Abstrak.Percobaan2;
/**
 *
 * @author Embun Duta Laksmana
 */
public class Kambing extends Hewan{ 
   private String nama;
   Kambing(String nama){
       super("Kambing");
       this.nama=nama;
   }
   @Override
   public void suara(){
       System.out.println("Mengembik");
   }
   public String toString(){
       return super.toString()+" "+nama;
   }
}