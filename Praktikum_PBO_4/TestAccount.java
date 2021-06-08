package Praktikum_PBO_4;
import java.util.Scanner;
public class TestAccount {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int n,i,a,b;   
        System.out.println("masukkan jumlah data");
        n=in.nextInt();
        Account acc[]=new Account[n];
        
        for (i = 0; i < n; i++) {
            acc[i]=new Account();
        }
        
        for (i = 0; i < n; i++) {
            System.out.println("masukkan dta ke-"+(i+1));
            System.out.println("masukkan nilai a");
            a=in.nextInt();
            acc[i].setA(a);
            System.out.println("masukkan nilai b");
            b=in.nextInt();
            acc[i].setB(b);
        }
        System.out.println("");
        for (i = 0;i  < n; i++) {
          acc[i].showdata();
        }
    }
}