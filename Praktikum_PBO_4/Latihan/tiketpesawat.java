package Praktikum_PBO_4.Latihan;
public class tiketpesawat {
  private int id,n_kur;
  private String nama_pen,nama_mas,jam,price,konfir;
  
  tiketpesawat(){
      this.id=n_kur=0;
      this.nama_pen=nama_mas=jam=price="";
  }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNama_pen() {
        return nama_pen;
    }
    public void setNama_pen(String nama_pen) {
        this.nama_pen = nama_pen;
    }

    public String getNama_mas() {
        return nama_mas;
    }
    public void setNama_mas(String nama_mas) {
        this.nama_mas = nama_mas;
    }

    public int getN_kur() {
        return n_kur;
    }
    public void setN_kur(int n_kur) {
        this.n_kur = n_kur;
    }

    public String getJam() {
        return jam;
    }
    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    
    public void tampil(){
        if(getNama_mas().equals("Lion Air")||getNama_mas().equals("Citilink")){
          konfir="Delay";
        }
        System.out.println(getId()+"\t"+getNama_pen()+"\t"+getNama_mas()+
                "\t"+getN_kur()+"\t"+getJam()+"\t"+getPrice()+"\t\t"+konfir);
    }
}