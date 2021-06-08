package Praktikum_PBO_6.Latihan.Nomor1;
public class TestBangunDatar {
    public static void main(String[] args) {
        Segitiga s1=new Segitiga();
        s1.nama="siku-siku";
        s1.alas=10;
        s1.tinggi=15;
        s1.nama="siku-siku";
        System.out.println("nama segitiga "+s1.nama);
        System.out.println("Luas Segitiga "+s1.luas());
        System.out.println("");
        
        Segitiga s2=new Segitiga();
        s2.nama="sama sisi";
        s2.sisi1=s2.sisi2=s2.sisi3=100;
        System.out.println("nama segitiga "+s2.nama);
        System.out.println("Keliling Segitiga "+s2.keliling());
        
        System.out.println("");
        Persegi s3=new Persegi();
        s3.nama="Persegi";
        s3.sisi=4;
        System.out.println("nama bangun "+s3.nama);
        System.out.println("Luas Segitiga "+s3.luas());
        System.out.println("Keliling Segitiga "+s3.keliling());
        System.out.println("");
        
        Lingkaran s4=new Lingkaran();
        s4.nama="Lingkaran";
        s4.r=4;
        System.out.println("nama bangun "+s4.nama);
        System.out.println("Luas Segitiga "+s4.luas());
        System.out.println("Keliling Segitiga "+s4.keliling());
    }
}