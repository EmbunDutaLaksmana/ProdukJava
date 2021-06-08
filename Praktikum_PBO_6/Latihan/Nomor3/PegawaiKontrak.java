package Praktikum_PBO_6.Latihan.Nomor3;
public class PegawaiKontrak {
public double gajitetap,bonusproject,bonuslembur,nilaiprojek;   
 public PegawaiKontrak(double gajitetap, double bonusproject, 
         double bonuslembur) {
   this.gajitetap = gajitetap;
   this.bonusproject = bonusproject;
   this.bonuslembur = bonuslembur;
 }
  public PegawaiKontrak() {
   this.gajitetap = 3000000;
   this.bonusproject =500000;
   this.bonuslembur = 0.2;
   this.nilaiprojek=3000000;
 }
    public double getGajitetap() {
        return gajitetap;
    }
    public double getBonusproject() {
        return nilaiprojek*bonusproject;
    }

    public double getBonuslembur() {
        return bonuslembur;
    }

    public double getNilaiprojek() {
        return nilaiprojek;
    }
  
}
