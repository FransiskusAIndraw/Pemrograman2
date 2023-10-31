package soal2;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputnegara = new Scanner(System.in);
        HashMap<Integer, String> listBulan = new HashMap<>();
        listBulan.put(1, "Januari");
        listBulan.put(2, "Februari");
        listBulan.put(3, "Maret");
        listBulan.put(4, "April");
        listBulan.put(5, "Mei");
        listBulan.put(6, "Juni");
        listBulan.put(7, "Juli");
        listBulan.put(8, "Agustus");
        listBulan.put(9, "September");
        listBulan.put(10, "Oktober");
        listBulan.put(11, "November");
        listBulan.put(12, "Desember");
        LinkedList<Negara> listNegara = new LinkedList<>();
        int banyakKasus = inputnegara.nextInt();
        inputnegara.nextLine();
        for (int i = 0; i < banyakKasus; i++) {
            System.out.println("negara " + (1+i));
            System.out.print("Nama Negara : ");
            String namaNegara = inputnegara.nextLine();
            System.out.print("Jenis Kepemimpinan : ");
            String kepemimpinan = inputnegara.nextLine();
            System.out.print("Nama Pemimpin : ");
            String NamaPemimpin = inputnegara.nextLine();
            int TanggalKemerdekaan = 0;
            int BulanKemerdekaan = 0;
            int TahunKemerdekaan = 0;
        if (kepemimpinan.equals("monarki")){
        }
        else {
            System.out.print("Tanggal Kemerdekaan : ");
            TanggalKemerdekaan = inputnegara.nextInt();
            System.out.print("Bulan Kemerdekaan : ");
            BulanKemerdekaan = inputnegara.nextInt();
            System.out.print("Tahun Kemerdekaan : ");
            TahunKemerdekaan = inputnegara.nextInt();
            inputnegara.nextLine();
        }
        Negara negara = new Negara(namaNegara, kepemimpinan, NamaPemimpin, TanggalKemerdekaan, BulanKemerdekaan, TahunKemerdekaan);
        listNegara.add(negara);
        }
        for (Negara negara : listNegara){
            System.out.println("Negara " + negara.getNamaNegara() + " Mempunyai " + (negara.getKepemimpinan().equals("monarki") ? "Raja" : negara.getKepemimpinan().equals("presiden") ? "Presiden":"Perdana Menteri") + " Bernama " + negara.getNamaPemimpin());
            if (!negara.getKepemimpinan().equals("monarki")){
            System.out.println("Deklarasi Kemerdekaan Pada Tanggal " + negara.getTanggalKemerdekaan() + " " +listBulan.get(negara.getBulanKemerdekaan()) + " " + negara.getTahunKemerdekaan());
            }
        }
    }
}








