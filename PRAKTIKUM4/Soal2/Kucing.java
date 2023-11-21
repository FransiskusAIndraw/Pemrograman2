package Soal2;

public class Kucing extends HewanPeliharaan{
String warnaBulu;
    public Kucing(String n, String r, String w) {
        super(n, r);
        this.warnaBulu = w;
    }
   public void displayDetailKucing(){
        display();
       System.out.println("Memiliki Bulu " + warnaBulu );
    }
}
