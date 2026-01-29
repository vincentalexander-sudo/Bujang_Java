import java.util.Scanner;

public class BatamExpress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalPendapatanHarian = 0;
        double subtotal= 0;
        String namaPenerima;

        System.out.println("=== BatamExpress System ===");
        System.out.println("(Ketik 'selesai' untuk berhenti)");

        while (true) {
            double diskon = 0;
            double hargaWilayah = 0;
            double layananExpress;
            System.out.print("\nNama Penerima: ");
            namaPenerima = input.nextLine();

            if (namaPenerima.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Wilayah Tujuan (Batam Center/Nagoya/Sekupang): ");
            String wilayah = input.nextLine();

            System.out.print("Berat Barang (kg): ");
            double berat = input.nextDouble();
            input.nextLine();

            
            if (wilayah.equalsIgnoreCase("Batam Center")) {
                hargaWilayah = 10_000;
            }else if (wilayah.equalsIgnoreCase("Nagoya")) {
                hargaWilayah = 15_000;
            }else if (wilayah.equalsIgnoreCase("Sekupang")) {
                hargaWilayah = 20_000;
            }else {
                hargaWilayah = 25_000;
            }
            subtotal = hargaWilayah * berat;

            if (berat > 10) {
                diskon = subtotal * 0.15;
            }
            subtotal -= diskon;

            System.out.print("Apakah memilih layanan express? (1: Y/ 0:N): ");
            layananExpress = input.nextDouble();
            input.nextLine();

            if (layananExpress == 1) {
                subtotal += 10_000;
            }

            totalPendapatanHarian += subtotal;
            System.out.print("Total Pendapatan Hari Ini: " + subtotal);
        }

        System.out.printf("Total Pendapatan Keseluruhan: %.0f", totalPendapatanHarian);
    }
}