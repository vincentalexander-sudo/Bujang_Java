
import java.util.Scanner;

public class Kalkulator {
    static double  tambah(double angka1, double angka2) {
        return angka1 + angka2;
    }

    static double kurang(double angka1, double angka2) {
        return angka1 - angka2;
    }

    static double kali(double angka1, double angka2) {
        return angka1 * angka2;
    }

    static double bagi(double  angka1, double  angka2) {
        return angka1 / angka2;
    }

    static double modulus(double angka1, double angka2) {
        return angka1 % angka2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2;
        String pilihanOperasi;
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();
        input.nextLine();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan operasi (+, -, *, /, %): ");
        pilihanOperasi = input.nextLine();
        
        switch(pilihanOperasi) {
            case "+" -> System.out.printf("%.0f + %.0f = %.0f%n", angka1, angka2, tambah(angka1, angka2));
            case "-" -> System.out.printf("%.0f - %.0f = %.0f%n", angka1, angka2, kurang(angka1, angka2));
            case "*" -> System.out.printf("%.0f * %.0f = %.0f%n", angka1, angka2, kali(angka1, angka2));
            case "/" -> {
                if (angka2 == 0) {
                    System.out.println("Pembagian dengan nol tidak terdefenisi.");
                }else {
                    System.out.printf("%.0f / %.0f = %.2f%n", angka1, angka2, bagi(angka1, angka2));
                }
            }case "%" -> {
                if (angka2 == 0) {
                    System.out.println("Modulus dengan nol tidak terdefenisi.");
                }else {
                    System.out.printf("%.0f %% %.0f = %.0f%n", angka1, angka2, modulus(angka1, angka2));
                }
            }
            default -> System.out.println("Operasi tidak valid.");
        }
    }
}
