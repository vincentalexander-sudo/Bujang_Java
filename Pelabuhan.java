
import java.util.Scanner;

public class Pelabuhan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int konfirmasi, durasiKontainer;
        String kategoriKontainer;
        double totalPendapatan = 0;

        System.out.println("=== Pelabuhan System ===");
        System.out.println("(Ketik '0' untuk berhenti)");

        while (true) { 
            double hargaKontainer;
            double biayaMaintanance = 0;
            double biayaPerKontainer = 0;
            final double biayaBongkar = 500_000;

            System.out.print("Mau pesan kontainer? (1: Ya, 0: Tidak):");
            konfirmasi = input.nextInt();
            input.nextLine();

            if (konfirmasi == 0) {
                break;
            }

            System.out.print("Kategori Kontainer: "); 
            kategoriKontainer = input.nextLine();

            System.out.print("Durasi Kontainer: "); 
            durasiKontainer = input.nextInt();
            input.nextLine();

            if (kategoriKontainer.equalsIgnoreCase("Dry Container")) {
                hargaKontainer = 1_000_000;
            } else if (kategoriKontainer.equalsIgnoreCase("Reefer")) {
                hargaKontainer = 2_500_000;
            } else if (kategoriKontainer.equalsIgnoreCase("Tanker")) {
                hargaKontainer = 3_500_000;
            } else {
                System.out.println("Kategori kontainer tidak tersedia.");
                continue;
            }

            biayaPerKontainer = hargaKontainer * durasiKontainer;

            if (durasiKontainer > 30) {
                biayaMaintanance = biayaPerKontainer * 0.05;
            }
            biayaPerKontainer += biayaMaintanance;
            biayaPerKontainer += biayaBongkar;

            totalPendapatan += biayaPerKontainer;
            System.out.printf("Biaya per kontainer: %.0f ", biayaPerKontainer);
        }

        System.out.printf("Total Pendapatan Seluruh Kontainer: %.0f", totalPendapatan);
    }
}
