import java.util.Scanner;
public class PRAK103_2210817210032_FRANSISKUSASSISIINDRAWIJAYA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int bilanganAwal = input.nextInt();
        int i = 0;
        int currentNumber = bilanganAwal;
        do {
            if (currentNumber % 2 != 0) {
                System.out.print(currentNumber);
                System.out.print(" ,");
                i++;
            }
            currentNumber++;
        } while (i < N);
        input.close();
    }
}
