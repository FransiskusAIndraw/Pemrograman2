public class Main {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 7000, 0.4, 40);
        Buah mangga = new Buah("Mangga", 3500, 0.2, 15);
        Buah alpukat = new Buah("Alpukat", 10000, 0.25, 12);
        apel.printInfo();
        mangga.printInfo();
        alpukat.printInfo();
    }
}
