
import java.util.Scanner;

public class MembershipPoint {
    static double menghitungPoin (double belanja) {
        if (belanja > 0) {
                return belanja * 0.05;
        } else {
                return 0;
        }
    }

    static void laporTransaksi(String jenis, double nilai) {
        System.out.printf("[AUDIT] Jenis: %s | Nilai: %.0f", jenis, nilai);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahBelanja;
        double totalPoinHarian = 0;
        boolean istembus = false;

        System.out.print("Jumlah Belanja: ");
        jumlahBelanja = input.nextInt();
        input.nextLine();

        double[] belanja = new double[jumlahBelanja];

        for (int i = 0; i < jumlahBelanja; i++) {
            System.out.print("Belanja ke-" + (i + 1) + ": ");
            belanja[i] = input.nextDouble();
            input.nextLine();

            if (belanja[i] == 0) {
                laporTransaksi("DATA KOSONG", belanja[i]);
                continue;
            }

            if (belanja[i] < 0) {
                laporTransaksi("FRAUD DETECTED", belanja[i]);
                break;
            }

            if (belanja[i] > 1_000_000) {
                laporTransaksi("High Value Transaction!", belanja[i]);
            }

            double poinSekarang = menghitungPoin(belanja[i]);
            totalPoinHarian += poinSekarang;

            if (totalPoinHarian >= 5000 && !(istembus)) {
                System.out.println("Target Poin Tercapai!");
                istembus = true;
            }

            laporTransaksi("SUCCES", totalPoinHarian);
        }

        System.out.printf("Total Poin Harian: %.0f", totalPoinHarian);
    }
}
