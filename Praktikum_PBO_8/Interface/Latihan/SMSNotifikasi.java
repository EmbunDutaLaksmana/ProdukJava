package Praktikum_PBO_8.Interface.Latihan;
public class SMSNotifikasi implements Notifikasi{
 private String NamaSurel;
 private String IsiSurel;

    public SMSNotifikasi(String NamaSurel, String IsiSurel) {
        this.NamaSurel = NamaSurel="";
        this.IsiSurel = IsiSurel="";
    }    
 @Override
    public void penerima(String NamaSurel){
     System.out.println("mengirim SMS ke : "+NamaSurel);   
    };
 @Override
    public void isiPesan(String IsiSurel){
        System.out.println("dengan isi pesan: "+IsiSurel);
    };
}