
import java.util.Scanner;

public class Dana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int targetDana, tambahanBulanan;
        double bungaTahunan, simpananAwal;
        String waktu;

        System.out.print("Jumlah total uang yang ingin dicapai: ");
        targetDana = input.nextInt();
        input.nextLine();

        System.out.print("Saldo awal tabungan kota: ");
        simpananAwal = input.nextDouble();
        input.nextLine();

        System.out.print("Jumlah uang yang disisihkan kota setiap bulan: ");
        tambahanBulanan = input.nextInt();
        input.nextLine();

        System.out.print("Persentase bunga bank per tahun (dalam %): ");
        bungaTahunan = input.nextDouble();
        input.nextLine();

        double saldo = simpananAwal;
        int bulan = 0;
        double totalBunga = 0;

        while (saldo < targetDana) {
            if (targetDana > 1000000000) {
                System.out.println("Angka tidak realistis");
                break;
            }else if (tambahanBulanan == 0 && bungaTahunan == 0) {
                System.out.println("Angka tidak masuk akal");
                break;
            }

            double bungaBulanIni = saldo * (bungaTahunan / 100 / 12);
            saldo = saldo + tambahanBulanan + bungaBulanIni;

            totalBunga += bungaBulanIni;
            bulan ++;
        }

        if (bulan <= 12) {
            System.out.println("Selama " + bulan);
            waktu = "Sangat cepat";
        } else if (bulan >= 13 && bulan <= 30) {
            System.out.println("Selama " + bulan);
            waktu = "Normal";
        } else {
            System.out.println("Selama " + bulan);
            waktu = "Lambat";
        }

        System.out.println("---------------------------------");
        System.out.println("===       Laporan Akhir       ===");
        System.out.println("Total Bunga dikumpulkan\t: " + totalBunga);
        System.out.println("Waktu Pencapaian\t: " + waktu);
        System.out.println("---------------------------------");
    }
}