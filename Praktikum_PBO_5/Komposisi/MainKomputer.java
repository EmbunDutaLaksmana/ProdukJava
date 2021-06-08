package Praktikum_PBO_5.Komposisi;
public class MainKomputer {
    public static void main(String[] args) {
        Komputer komputer=new Komputer();   
        System.out.println("Spesifikasi Komputer: ");
        //tipe dan merek komputer
        komputer.setTiKom("A123F");
        komputer.setMeKom("Asus");
        //tipe dan merek CPU
        komputer.setTipeCPU("C23G");
        komputer.setMerkCPU("Intel");
        //tipe dan merek mouse
        komputer.setTipeMouse("M45H");
        komputer.setMerkMouse("Asus");
        //tipe dan merek keyboard
        komputer.setTipeKeyboard("KR89");
        komputer.setMerkKeyboard("Asus");
        //output
        System.out.println("Tipe Komputer: "+komputer.getTiKom());
        System.out.println("Merk Komputer: "+komputer.getMeKom());
        System.out.println("");
        System.out.println("Tipe CPU: "+komputer.getTipeCPU());
        System.out.println("Merk CPU: "+komputer.getMerkCPU());
        System.out.println("");
        System.out.println("Tipe Mouse: "+komputer.getTipeMouse());
        System.out.println("Merk Mouse: "+komputer.getMerkMouse());
        System.out.println("");
        System.out.println("Tipe Keyboard: "+komputer.getTipeKeyboard());
        System.out.println("Merk Keyboard: "+komputer.getMerkKeyboard());    
    }
}