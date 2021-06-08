package Praktikum_PBO_4;
public class TestEmployee {
    public static void main(String[] args) {
      Employee emp1=new Employee();
      Employee emp2=new Employee();
      Employee emp3=new Employee();
     
            System.out.println("Masukkan detail data karyawan"+": ");
            emp1.getdata();
            emp2.getdata();
            emp3.getdata();
            System.out.println("");
                
        System.out.println("Detail Karyawan yang telah diinputkan");
        System.out.println("ID\tNAMA\tUmur\tGAJI");
        
            emp1.putdata();
            emp2.putdata();
            emp3.putdata();
        
    }
}
