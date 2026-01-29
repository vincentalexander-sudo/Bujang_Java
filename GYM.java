
import java.util.Scanner;

public class GYM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahPengunjung, personalTrainer;
        String namaMember, tipePaket;
        double durasi;
        double totalPendapatan = 0;
        
        System.out.print("Jumlah Pengunjung: ");
        jumlahPengunjung = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahPengunjung; i++) {
            double totalHarga = 0;
            double hargaPaket = 0;
            double diskon = 0;
            System.out.println("=      Pengunjung ke-" + (i+1) + "     =");
            System.out.print("Nama Member: ");
            namaMember = input.nextLine();

            System.out.print("Tipe Paket: ");
            tipePaket = input.nextLine();

            System.out.print("Durasi: ");
            durasi = input.nextDouble();
            input.nextLine();

            System.out.print("Apakah ingin menggunakan Personal Trainer (PT)? (1: Y/ 0:N): ");
            personalTrainer = input.nextInt();
            input.nextLine();

            if (tipePaket.equalsIgnoreCase("Bronze")) {
                hargaPaket = 200_000;
            }else if (tipePaket.equalsIgnoreCase("Silver")) {
                hargaPaket = 400_000;
            }else if (tipePaket.equalsIgnoreCase("Gold")) {
                hargaPaket = 700_000;
            }else {
                System.out.println("Paket tidak tersedia.");
                continue;
            }

            totalHarga = hargaPaket * durasi;

            if (durasi > 6) {
                diskon = totalHarga * 0.1;
            }
            totalHarga = totalHarga - diskon;

            if (personalTrainer == 1) {
                totalHarga = totalHarga + 150000;
            }

            System.out.println("Total Harga: " + totalHarga);
            totalPendapatan += totalHarga;
        }

        System.out.printf("Total Pendapatan: %.2f\n", totalPendapatan);
    }
}
