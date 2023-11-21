package Soal2;
import java.util.Arrays;
public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;


    public Anjing(String n, String r, String warnaBulu, String[] kemampuan) {
        super(n, r);
        this.warnaBulu = warnaBulu;
        this.kemampuan = kemampuan;
    }

    public void displayDetailAnjing() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + name);
        System.out.println("Dengan ras : " + ras);
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.println("Memiliki kemampuan : " + Arrays.toString(kemampuan).replace("[","").replace("]","").replace(",",""));
    }
}