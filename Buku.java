
import java.util.Scanner;

public class Buku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kategori, kartuMember;
        double jumlahBuku;
        double totalHarga = 0;
        double diskon = 10_000;
        String konfirmasi = "y";

        while (konfirmasi.equalsIgnoreCase("y")) { 
            double hargaBuku = 0;
            double subtotal = 0;
            System.out.print("Kategori Buku: ");
            kategori = input.nextLine();

            if (kategori.equalsIgnoreCase("elektronik")) {
                hargaBuku = 120_000;
            }else if (kategori.equalsIgnoreCase("fiksi")) {
                hargaBuku = 80_000;
            }else if (kategori.equalsIgnoreCase("komik")) {
                hargaBuku = 45_000;
            }else {
                System.out.println("Kategori tidak tersedia.");
                continue;
            }

            System.out.print("Jumlah Buku: ");
            jumlahBuku = input.nextDouble();
            input.nextLine();

            subtotal = hargaBuku * jumlahBuku;
            totalHarga += subtotal;

            System.out.print("Mau pesan lagi? (y/n): ");
            konfirmasi = input.nextLine();

            if (konfirmasi.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih sudah berbelanja");
            }
        }
        System.out.print("apakah punya kartu member? (y/n): ");
        kartuMember = input.nextLine();
        if (kartuMember.equalsIgnoreCase("y")) {
            totalHarga = totalHarga - diskon;
        }
        System.out.printf("Total Harga: %.0f ", totalHarga);
    }
}
