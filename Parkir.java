import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisKendaraan;
        int lamaParkir;
        int totalBiaya = 0;
        int pilihanTiket; 

        System.out.print("Jenis Kendaraan (Mobil/Motor): ");
        jenisKendaraan = input.next();
        System.out.print("Lama Parkir (jam): ");
        lamaParkir = input.nextInt();
        System.out.print("Apakah Karcis Hilang? (1: Ya, 0: Tidak): ");
        pilihanTiket = input.nextInt();

        if (jenisKendaraan.equalsIgnoreCase("motor")) {
            totalBiaya = 2000 + (lamaParkir - 1) * 1000;
            
            if (totalBiaya > 25000) {
                totalBiaya = 25000; 
            }
        } else if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            totalBiaya = 5000 + (lamaParkir - 1) * 3000;
    
            if (totalBiaya > 50000) {
                totalBiaya = 50000;
            }
        }

        if (pilihanTiket == 1) {
            System.out.println("--- Denda Kehilangan Karcis: Rp 50.000 ---");
            totalBiaya += 50000;
        }

        System.out.println("Total yang harus dibayar: Rp " + totalBiaya);
    }
}