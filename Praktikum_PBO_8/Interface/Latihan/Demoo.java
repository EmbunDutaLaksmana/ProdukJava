package Praktikum_PBO_8.Interface.Latihan;

/**
 *
 * @author Embun Duta Laksmana
 */
public class Demoo {
    public static void main(String[] args) {
        EmailNotifikasi EN= new EmailNotifikasi("","");
        EN.penerima("20TIEPBO.PCR.AC.ID");
        EN.isiPesan("Maaf tidak ada pesan");
        
        SMSNotifikasi SN=new SMSNotifikasi("","");
        SN.penerima("+629909999");
        SN.isiPesan("PBO mudAH mudah");
        
    }
   
}