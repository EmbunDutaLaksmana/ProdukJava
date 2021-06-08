package Praktikum_PBO_8.Interface.Percobaan2;
/**
 *
 * @author Embun Duta Laksmana
 */
public class Demo {
    public static void main(String[] args) {
     Persegi persegi= new Persegi();
     persegi.setSisi(6);
        System.out.println("Keliling persegi "+ persegi.hitungkeliling());
        System.out.println("Luas persegi "+persegi.hitungluas());
    }
}