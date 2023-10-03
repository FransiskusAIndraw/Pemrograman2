import java.util.Scanner;
public class PRAK104_2210817210032_FRANSISKUSASSISIINDRAWIJAYA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String abuTangan = input.nextLine();
        System.out.print("Tangan Bagas: ");
        String bagusTangan = input.nextLine();
        String[] tanganAbuArr = abuTangan.split(" ");
        String[] tanganBagasArr = bagusTangan.split(" ");
        int poinAbu = 0;
        int poinBagas = 0;
        for (int i = 0; i < 3; i++) {
            char tanganAbuRonde = tanganAbuArr[i].charAt(0);
            char tanganBagasRonde = tanganBagasArr[i].charAt(0);
            if (tanganAbuRonde == tanganBagasRonde) {
            } else if ((tanganAbuRonde == 'B' && tanganBagasRonde == 'G') ||
                    (tanganAbuRonde == 'G' && tanganBagasRonde == 'K') ||
                    (tanganAbuRonde == 'K' && tanganBagasRonde == 'B')) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }
        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}
