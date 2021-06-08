package Praktikum_PBO_8.Interface.Percobaan1;

/**
 *
 * @author Embun Duta Laksmana
 */
public class TelevisiA implements Control{
    String[] channelTv={"RCTI","SCTV","INDOSIAR","TRANS TV","TPI"};
    
    @Override
    public void pindahChannel(int channel){
        System.out.println("Pindah Channel pada tv A ke : "+ channelTv[channel]);
    }
    @Override
    public void PerbesarVolume(int intesitas){
        System.out.println("Perbesar intesitas volum tv A sebanyak : "+intesitas);
    }
    @Override
    public void PerkecilVolume(int intesitas){
        System.out.println("Perkecil intesitas volume pada tv A sebanyak : "+ intesitas); 
    }
}