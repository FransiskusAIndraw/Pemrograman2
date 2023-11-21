package Soal1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan : ");
        String a = input.nextLine();
        System.out.print("Ras:");
        String b = input.nextLine();
        HewanPeliharaan hewan = new HewanPeliharaan(a, b);
        hewan.display();
    }
}
