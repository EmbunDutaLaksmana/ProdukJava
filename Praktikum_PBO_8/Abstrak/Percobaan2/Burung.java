package Praktikum_PBO_8.Abstrak.Percobaan2;
/**
 *
 * @author Embun Duta Laksmana
 */
public class Burung extends Hewan{ 
   private String nama;
   Burung(String nama){
       super("Burung");
       this.nama=nama;
   }
   @Override
   public void suara(){
       System.out.println("Berkicau");
   }
   public String toString(){
       return super.toString()+" "+nama;
   }
}