import java.util.Scanner;
public class PRAK101_2210817210032_FRANSISKUSASSISIINDRAWIJAYA {
    public static void main(String[] args) {
    String namaLengkap,tempatlahir;
    int tanggalL,tahunL,tinggiB,bulanL;
    float beratB;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap : ");
        namaLengkap = input.nextLine();
        System.out.print("Masukkan Tempat Lahir : ");
        tempatlahir = input.nextLine();
        System.out.print("Masukkan Tanggal lahir : ");
        tanggalL = input.nextInt();
        System.out.print("Masukkan Bulan Lahir : ");
        bulanL = input.nextInt();
        System.out.print("Masukkan Tahun Lahir : ");
        tahunL = input.nextInt();
        System.out.print("Masukkan Tinggi Badan : ");
        tinggiB = input.nextInt();
        System.out.print("Masukkan Berat Badan : ");
        beratB = input.nextFloat();
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli","Agustus", "September", "Oktober", "November", "Desember"};
        System.out.println("Nama Lengkap " + namaLengkap + " Lahir di " + tempatlahir + " pada Tanggal " + tanggalL + " " + namaBulan[bulanL - 1] + " " + tahunL + " Tinggi Badan " + tinggiB + " cm dan Berat Badan " + beratB + " kilogram");
    }
}