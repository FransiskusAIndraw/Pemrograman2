package soal1;
import java.util.Random;
public class dadu {
    private int angka;
   public dadu() {
       angkaAcak();
   }
    private void angkaAcak() {
        Random random = new Random();
        angka = random.nextInt(6)+1;
    }
    public int getAngka(){
       return angka;
    }
}
