package Praktikum_PBO_6.inheritance;
public class TestBangunDatar {
    public static void main(String[] args) {
        Segitiga s1=new Segitiga();
        s1.nama="siku-siku";
        s1.alas=10;
        s1.tinggi=15;
        
        System.out.println("nama segitiga "+s1.nama);
        System.out.println("Luas Segitiga "+s1.luas());
        System.out.println("");
        Segitiga s2=new Segitiga();s1.nama="siku-siku";
        s2.nama="sama sisi";
        s2.sisi1=s2.sisi2=s2.sisi3=100;
        
        System.out.println("nama segitiga "+s2.nama);
        System.out.println("Keliling Segitiga "+s2.keliling());
    }
}