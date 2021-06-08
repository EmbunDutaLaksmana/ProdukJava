package Praktikum_PBO_8.Interface.Percobaan2;
/**
 *
 * @author Embun Duta Laksmana
 */
public class Persegi implements BangunDatar{
    private double sisi;
    
    public double getsisi(){
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi=sisi;
    }
    @Override
    public double hitungluas(){
        return 4*sisi;
    }
    @Override
    public double hitungkeliling(){
        return sisi*sisi;
    }
}
