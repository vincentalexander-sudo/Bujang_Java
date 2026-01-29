import java.util.Scanner;

public class ParkirMall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String noKendaraan;

        System.out.println("=== Sistem Parkir Mall ===");

        while (true) {
            System.out.print("\nMasukkan No Kendaraan (Ketik '0' untuk keluar): ");
            noKendaraan = input.next();

            if (noKendaraan.equals("0")) break;

            System.out.print("Masukkan Lama Parkir (jam): ");
            int lamaParkir = input.nextInt();
            
            System.out.print("Apakah Karcis Hilang? (1: Ya, 0: Tidak): ");
            int karcisHilang = input.nextInt();

            if (lamaParkir < 1) {
                System.out.println("Lama parkir tidak valid.");
                continue;
            }

            int totalBiaya = 0;

            if (lamaParkir == 1){
                totalBiaya += 5000;
            } else if (lamaParkir > 1) {
                totalBiaya = totalBiaya + (5000 + (lamaParkir - 1) * 3000);
            } 

            if (totalBiaya > 50_000) {
                totalBiaya = 50_000;
            }
            if (karcisHilang == 1) {
                totalBiaya += 25000;
            }
            System.out.println("Total Biaya Parkir: Rp " + totalBiaya);
        }

        System.out.println("Program Selesai.");
    }
}