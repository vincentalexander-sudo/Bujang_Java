import java.util.Scanner;

public class Fakorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        int hasil = 1;

        System.out.print("Angka Faktorial: ");
        angka = input.nextInt();

        for (int i = angka; i >= 1; i--) {
            hasil *= i;
        }

        System.out.println(hasil);
    }
}
