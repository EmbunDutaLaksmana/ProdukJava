package Praktikum_PBO_4;
import java.util.Scanner;
public class Employee {
  private int id,age;
  private String name;
  private double salary;
  
  public Employee (){
      id=age=0;
      name="";
      salary=0;
  }
  public void getdata(){
      Scanner sc=new Scanner (System.in);
      
      System.out.println("masukkan id karyawan");
      id=Integer.parseInt(sc.nextLine());
      
      System.out.println("masukkan nama karyawan");
      name=sc.nextLine();
      
      System.out.println("masukkan umur karyawan");
      age=Integer.parseInt(sc.nextLine());
      
      System.out.println("masukkan gaki karyawan");
      salary=Double.parseDouble(sc.nextLine());
  }
  public void putdata(){
      System.out.println(id+"\t"+name+"\t"+age+"\t"+salary);
  }
}
