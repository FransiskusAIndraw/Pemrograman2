public class Pegawai {
    public String nama;
    //ERROR Karena tipe data variabel 'asal' seharsnya adalah String, namun yang digunakan disini adalah char
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    //ERROR karena parameter j tidak ditemukan
    //public void setJabatan() {
    public void setJabatan(String j){
         this.jabatan = j;

    }
}
