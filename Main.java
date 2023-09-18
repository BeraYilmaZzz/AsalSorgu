import java.util.Scanner;

public class Main {
    static boolean isPrime(int value) {
        if (value <= 1) {
            return false; // 1 den küçükler asaldeğildir
        }

        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false; // girilen değer herhangi bir değere bölünebiliyorsa asal değil
            }
        }

        return true; // Hiçbir bölen bulunamadıysa asal
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int value;

        System.out.print("Sayı Giriniz: ");
        value = inp.nextInt();

        if (isPrime(value)) {
            System.out.println(value + " asal bir sayıdır.");
        } else {
            System.out.println(value + " asal bir sayı değildir.");
        }
    }
}