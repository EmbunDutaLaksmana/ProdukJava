package Praktikum_PBO_5.Komposisi;
public class Komputer {
 private Mouse mouse;
 private Keyboard keyboard;
 private CPU cpu;
 private String TiKom;
 private String MeKom;
 public Komputer(){
     
     this.mouse= new Mouse("","");
     this.keyboard= new Keyboard ("","");
     this.cpu=new CPU ("","");
 }
    public String getTiKom() {
        return TiKom;
    }
    public void setTiKom(String TiKom) {
        this.TiKom = TiKom;
    }
    public String getMeKom() {
        return MeKom;
    }
    public void setMeKom(String MeKom) {
        this.MeKom = MeKom;
    }
   
    public String getMerkMouse() {
        return mouse.getMerk();
    }
    public void setMerkMouse(String mouse) {
        this.mouse.setMerk(mouse);
    }
    public String getTipeMouse() {
        return mouse.getTipe();
    }
    public void setTipeMouse(String mouse) {
        this.mouse.setTipe(mouse);
    }
    
    public String getMerkCPU() {
        return cpu.getMerk();
    }
    public void setMerkCPU(String cpu) {
        this.cpu.setMerk(cpu);
    }
    public String getTipeCPU() {
        return cpu.getTipe();
    }
    public void setTipeCPU(String cpu) {
        this.cpu.setTipe(cpu);
    }

    public String getMerkKeyboard() {
        return keyboard.getMerk();
    }
    public void setMerkKeyboard(String Keyboard) {
        this.keyboard.setMerk(Keyboard);
    }
    public String getTipeKeyboard() {
        return keyboard.getTipe();
    }
    public void setTipeKeyboard(String Keyboard) {
        this.keyboard.setTipe(Keyboard);
    } 
}