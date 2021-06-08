package Praktikum_PBO_8.Interface.Percobaan1;
/**
 *
 * @author Embun Duta Laksmana
 */
public class testInterface {
    public static void main(String[] args) {
        TelevisiA tvA= new TelevisiA();
        TelevisiB tvB= new TelevisiB();
        RemoteControl rc= new RemoteControl();
        
        rc.kirimPerintahKeTV(RemoteControl.PINDAH_CHANNEL, tvA, 2);
        rc.kirimPerintahKeTV(RemoteControl.PERBESAR_VOLUME, tvA, 5);
        
        rc.kirimPerintahKeTV(RemoteControl.PINDAH_CHANNEL, tvB, 1);
        rc.kirimPerintahKeTV(RemoteControl.PERKECIL_VOLUME, tvB, 3);
  }
}