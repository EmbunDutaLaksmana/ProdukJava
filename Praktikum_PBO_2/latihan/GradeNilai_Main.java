package Praktikum_PBO_2.latihan;
import java.util.Scanner;
public class GradeNilai_Main {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in); 
        GradeNilai_prototipe Grade_obj= new GradeNilai_prototipe(0);
        GradeNilai_prototipe Keterangan_obj= new GradeNilai_prototipe(0);
        
        int r;
        
        System.out.println("MASUKKAN NILAI MAHASISWA");
        r=in.nextInt();
        
        Grade_obj.Grade(r);
        Keterangan_obj.Keterangan(r);
    }
}
