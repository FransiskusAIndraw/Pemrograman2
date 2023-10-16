import org.w3c.dom.ls.LSOutput;

public class Kopi {
String namaKopi;
String ukuran;
int harga;
String pembeli;

void setPembeli(String pembeli){
this.pembeli = pembeli;
}
String getPembeli(){
    return pembeli;
}
double getPajak(){
return 0.11 * harga;
}
void info(){
    System.out.println("Nama Kopi: " + namaKopi);
    System.out.println("Ukuran: " + ukuran);
    System.out.println("Harga: " + harga);
}
}
