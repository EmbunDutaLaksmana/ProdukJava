package Praktikum_PBO_8.Abstrak.Percobaan2;
/**
 *
 * @author Embun Duta Laksmana
 */
public class Kucing extends Hewan{ 
   private String nama;
   Kucing(String nama){
       super("Kucing");
       this.nama=nama;
   }
   @Override
   public void suara(){
       System.out.println("Mengeong");
   }
   public String toString(){
       return super.toString()+" "+nama;
   }
}