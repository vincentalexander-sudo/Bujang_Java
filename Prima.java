
import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaPrima;
        int bilanganPrima = 0;

        System.out.print("Bilangan Prima: ");
        angkaPrima = input.nextInt();

        for (int i = 1; i <= angkaPrima; i++) {
            if (angkaPrima % i == 0) {
                bilanganPrima++;
            }
        }

        if (bilanganPrima == 2) {
            System.out.println("" + angkaPrima + " Merupakan Bilangan Prima");
        } else {
            System.out.println("" + angkaPrima + " Bukan Bilangan Prima");
        }
    }
}
