package Praktikum_PBO_4;
public class Account {
    int a,b;
    
    public Account(){
        this.a=0;
        this.b=0;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    
    
    public void showdata(){
        System.out.println("Nilai Atribut a: "+getA());
        System.out.println("Nilai Atribut b: "+getB());
    }
}