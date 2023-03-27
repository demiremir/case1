import java.util.Scanner;

public class MahkemeUcreti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Juri sayısı: ");
        int juriSayisi = input.nextInt();

        int birinciHakimUcreti = 2500;
        int ikinciHakimUcreti = 3300;
        int juriUcreti = 50;

        double beraatOrani = 0;
        int toplamUcret = 0;

        // tüm jüriler suçsuz karar verirse
        beraatOrani = 1;
        toplamUcret = juriSayisi * juriUcreti;
        System.out.println("Tüm jüriler suçsuz karar verirse:");
        System.out.println("Beraat oranı: %" + beraatOrani*100);
        System.out.println("Toplam ücret: " + toplamUcret);

        // yarısı suçsuz, hakim kararsız kalırsa
        beraatOrani = 0.5;
        if (birinciHakimUcreti < ikinciHakimUcreti) {
            toplamUcret = juriSayisi/2 * juriUcreti + birinciHakimUcreti/2;
            System.out.println("Yarısı suçsuz, birinci hakim kararsız kalırsa:");
        } else {
            toplamUcret = juriSayisi/2 * juriUcreti + ikinciHakimUcreti/2;
            System.out.println("Yarısı suçsuz, ikinci hakim kararsız kalırsa:");
        }
        System.out.println("Beraat oranı: %" + beraatOrani*100);
        System.out.println("Toplam ücret: " + toplamUcret);

        // hakim doğrudan suçsuz derse
        beraatOrani = 1;
        if (birinciHakimUcreti < ikinciHakimUcreti) {
            toplamUcret = birinciHakimUcreti;
            System.out.println("Hakim doğrudan suçsuz derse (birinci hakim):");
        } else {
            toplamUcret = ikinciHakimUcreti;
            System.out.println("Hakim doğrudan suçsuz derse (ikinci hakim):");
        }
        System.out.println("Beraat oranı: %" + beraatOrani*100);
        System.out.println("Toplam ücret: " + toplamUcret);
    }
}
