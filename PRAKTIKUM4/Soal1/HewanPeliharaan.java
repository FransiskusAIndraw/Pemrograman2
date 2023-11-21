package Soal1;
public class HewanPeliharaan {
    String name;
    String ras;
    public HewanPeliharaan(String n, String r) {
        this.name = n;
        this.ras = r;
    }
    public void display(){
        System.out.println("Detail hewan Peliaraan : ");
        System.out.println("Nama hewan peliharaan ku adalah " + this.name);
        System.out.println("Dengan Ras " + this.ras);
    }
}
