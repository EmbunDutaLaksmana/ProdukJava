package Praktikum_PBO_6.Latihan.Nomor3;
public class PegawaiTetap {
 public double gajitetap,tunjangan,bonuslembur;   

    public PegawaiTetap(double gajitetap, double tunjangan
            , double bonuslembur) {
        this.gajitetap = gajitetap;
        this.tunjangan = tunjangan;
        this.bonuslembur = bonuslembur;
    }
    public PegawaiTetap() {
        this.gajitetap = 4000000;
        this.tunjangan = 500000;
        this.bonuslembur = 50000;
    }

    public double getGajitetap() {
        return gajitetap;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public double getBonuslembur() {
        return bonuslembur;
    }
}