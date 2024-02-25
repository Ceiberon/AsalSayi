import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int baslangic = 1;
        int bitis = 100;

        System.out.println("1 den 100 e kadar olan asal sayılar aşşağıdaki gibidir : ");
        int sayi = baslangic;
        while (sayi <= bitis) {
            if (asal(sayi)) {
                System.out.print(sayi + " ");
            }
            sayi++;
        }
    }

    // Kontrol blogu
    public static boolean asal(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}