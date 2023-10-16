public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //baris ini error karena kurang titik koma dibelakang baris
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //baris ini error karena inisiasi umur tidak ditemukan jadi tinggal tambah inisiasi 'umur'
        p1.umur = 17;
        System.out.println("Umur: " + p1.umur);
    }
}
