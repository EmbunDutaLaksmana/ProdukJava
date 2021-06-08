package Praktikum_PBO_4.Latihan;
public class gasmahasiswa {
    public static void main(String[] args) {
        int o=10,i;
        mahasiswa mhsw[]=new mahasiswa[o];
        
        for ( i = 0; i <o; i++) {
            mhsw[i]=new mahasiswa();
        }
        
        for ( i = 0; i < o; i++) {
            System.out.println("masukkan data-data mahasiswa ke-"+(i+1));
            mhsw[i].getdata();
            System.out.println("");
        }
        
        System.out.println("hasil output mahasiswa");
        System.out.println("NAMA\tNIM\tJURUSAN");
        for ( i = 0; i < o; i++) {
            mhsw[i].hasil();
        }
    }
}