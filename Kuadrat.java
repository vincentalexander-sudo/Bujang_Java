import java.util.Scanner;

public class Kuadrat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaKuadrat;
        int bilKuadrat;

        System.out.print("Bilangan Kuadrat: ");
        bilKuadrat = input.nextInt();

        System.out.print("Angka Kuadrat: ");
        angkaKuadrat = input.nextInt();

        int hasil = 1;

        for (int i = 1; i <= angkaKuadrat; i++) {
            hasil *= bilKuadrat;
        }

        System.out.println(hasil);
    }
}