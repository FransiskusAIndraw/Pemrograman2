class Buah {
    String namaBuah;
    double hargaPerKg;
    double berat;
    double jumlahBeli;
    Buah(String namaBuah, double hargaPerKg, double berat, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.hargaPerKg = hargaPerKg;
        this.berat = berat;
        this.jumlahBeli = jumlahBeli;}
    double hargaSebelumDskn(){
        return jumlahBeli/berat * hargaPerKg;
    }
    double hitungDiskon() {
        return (Math.floor(jumlahBeli / 4) * 0.02 * hargaPerKg * 4);
    }
    double hitungHargaSetelahDiskon() {
        return hargaSebelumDskn() - hitungDiskon();
    }
    void printInfo() {
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + hargaPerKg);
        System.out.println("Jumlah Beli: " +jumlahBeli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", hargaSebelumDskn());
        System.out.printf("Total Diskon: Rp%.2f\n", hitungDiskon());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n", hitungHargaSetelahDiskon());
        System.out.println();
    }
}
