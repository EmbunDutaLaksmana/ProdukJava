package Praktikum_PBO_8.Abstrak.Percobaan2;

/**
 *
 * @author Embun Duta Laksmana
 */
import java.util.Random;
public class DemoHewan {
    public static void main(String[] args) {
        Hewan[] peliharaanku={new Burung("Kakaktua"), new Kambing("Etawa"),
            new Anjing("Kintamani"), new Kucing("Anggora")
        };
        Hewan kesayangan;
        Random pilihan = new Random();
        kesayangan= peliharaanku[pilihan.nextInt(peliharaanku.length)];
        
        System.out.println("Binatang kesayanagan anda: "+ kesayangan);
        System.out.println("Suaranya ");
        kesayangan.suara();
    }
}