package Praktikum_PBO_8.Abstrak.Percobaan2;
/**
 *
 * @author Embun Duta Laksmana
 */
 public abstract class Hewan{
     private String jenis;
     
     Hewan(String jenis){
         this.jenis=jenis;
     }
     protected abstract void suara();
     public String toString(){
         return "Seekor "+jenis;
     }
 }   