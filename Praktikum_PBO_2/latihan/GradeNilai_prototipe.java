package Praktikum_PBO_2.latihan;
public class GradeNilai_prototipe {
 int r;
 GradeNilai_prototipe(int r){
    this.r=r;
 }
 void Grade(double r){
     if(r>=81){
         System.out.println("Grade: A");
     }else if(r>=76&&r<=80){
         System.out.println("Grade: AB");
     }else if(r>=66&&r>=75){
         System.out.println("Grade: B");
     }else if(r>=61&&r>=65){
         System.out.println("Grade: BC");
     }else if(r>=51&&r>=60){
         System.out.println("Grade: C");
     }else{
         System.out.println("F");
     }
 }
 void Keterangan (int r){
     if(r>=81){
         System.out.println("Keterangan: Istimewa");
     }else if(r>=76&&r<=80){
         System.out.println("Keterangan: Amat Baik");
     }else if(r>=66&&r<=75){
         System.out.println("Keterangan: Baik");
     }else if(r>=61&&r<=65){
         System.out.println("Keterangan: Cukup Baik");
     }else if(r>=51&&r<=60){
         System.out.println("Keterangan: Cukup");
     }else{
         System.out.println("Keterangan: Tidak Lulus");
     }
 }
}
