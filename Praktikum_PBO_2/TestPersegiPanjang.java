package Praktikum_PBO_2;
public class TestPersegiPanjang {
  public static void main(String[] args) {
    
        PersegiPanjang ps1 = new PersegiPanjang();
        PersegiPanjang ps2 = new PersegiPanjang();
    
        ps1.panjang=4;
        ps1.lebar=3;
        
        ps2.panjang=6;
        ps2.lebar=7;
        
        System.out.println("Persegi panjang 1");
        System.out.println("Panjang : "+ps1.panjang + " cm");
        System.out.println("Lebar : "+ps1.lebar + " cm");
        System.out.println("Luas : "+ps1.luas() + " cm2");
        ps1.keliling();
        
        System.out.println(" ");
        
        System.out.println("Persegi panjang 2");
        System.out.println("Panjang : "+ps2.panjang + " cm");
        System.out.println("Lebar : "+ps2.lebar + " cm");
        System.out.println("Luas : "+ps2.luas() + " cm2");
        ps2.keliling();

    }   
}