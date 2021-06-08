package Praktikum_PBO_3;
public class MainBola {
    public static void main(String[] args) {
        Bola m1 = new Bola();
        Bola m2 = new Bola();
        
        
        System.out.println("tampilan awal");
        m1.tampil();
        System.out.println("");
        m2.setJari(10);
        m2.setJenis("Basket");
        m2.tampil();
        System.out.println("");
        
        System.out.println("setelah diubah");
        m1.setJari(20);
        m1.setJenis("bola pimpong");
        m1.tampil();
        System.out.println("");
        m2.setJari(2);
        m2.setJenis("kelereng");
        m2.tampil();
    }
    
}
