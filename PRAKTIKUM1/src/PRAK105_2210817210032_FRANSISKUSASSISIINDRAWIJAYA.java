import java.util.Scanner;
public class PRAK105_2210817210032_FRANSISKUSASSISIINDRAWIJAYA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double phi = 3.14;
        System.out.print("Masukkan Jari-Jari : ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        double tinggi = input.nextDouble();
        double volume;
        volume = phi * Math.pow(jariJari, 2) * tinggi;
        System.out.println("Volume tabung dengan jari-jari " + jariJari + " dan tinggi " + tinggi + " adalah " +volume);
    }
}
