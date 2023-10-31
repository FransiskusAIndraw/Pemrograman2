package soal3;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputMahasiswa = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        boolean jalan = true;

        while(jalan){
            System.out.println("Menu : ");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarakan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            int pilihan = inputMahasiswa.nextInt();
            inputMahasiswa.nextLine();

            switch (pilihan){
                case 1 :
                    System.out.println("Masukkan Nama Mahasiswa : ");
                    String nama = inputMahasiswa.nextLine();
                    System.out.println("Masukkan NIM Mahasiswa(harus unik)");
                    int NIM = inputMahasiswa.nextInt();
                    Mahasiswa mahasiswa = new Mahasiswa(nama, NIM);
                    listMahasiswa.add(mahasiswa);
                    System.out.println("Mahasiswa " + nama + "Berhasil Ditambahkan.");
                    break;
                case 2:
                    System.out.println("Masukkan NIM Mahasiswa Yang Ingin Dihapus : ");
                    int nimHapus = inputMahasiswa.nextInt();
                    boolean isRemoved = false;
                    for (Mahasiswa mahasiswa1 : listMahasiswa) {
                        if (mahasiswa1.getNIM() == nimHapus) {
                            listMahasiswa.remove(mahasiswa1);
                            isRemoved = true;
                            break;
                        }
                    }
                    if (isRemoved) {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " berhasil dihapus.\n");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.\n");
                    }
                    break;
                case 3 :
                    System.out.println("Masukkan NIM Yang Ingin Dicari : ");
                    int nimCari = inputMahasiswa.nextInt();
                    boolean isFound = false;
                    for (Mahasiswa mahasiswa1 : listMahasiswa) {
                        if (mahasiswa1.getNIM() == nimCari) {
                            System.out.println("NIM " + nimCari + " ditemukan:");
                            System.out.println("Nama: " + mahasiswa1.getNama());
                            System.out.println("NIM: " + mahasiswa1.getNIM() + "\n");
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.\n");
                    }
                    break;
                case 4 :
                    System.out.println("Daftar Mahasiswa: \n");
                    for(Mahasiswa mahasiswa1 : listMahasiswa){
                        System.out.println("NIM : " + mahasiswa1.getNIM() +" Nama : "+ mahasiswa1.getNama() + "\n");
                    }
                    break;
                case 0 :
                listMahasiswa.clear();
                    System.out.println("Terimakasih !");
                    jalan = false;
            }
        }
    }
}