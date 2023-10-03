import java.util.Scanner;
public class PRAK102_2210817210032_FRANSISKUSASSISIINDRAWIJAYA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deretBil = 10;
        int i = 0;
        int angkaInput = input.nextInt();
        while (i <= deretBil){
            int angkaHitung = (angkaInput % 5 == 0) ? angkaInput / 5 - 1 : angkaInput;
            System.out.print(angkaHitung + " , ");
            angkaInput++;
            i++;
        }
    }
}
