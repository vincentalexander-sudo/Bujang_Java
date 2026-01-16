
import java.util.Scanner;

public class Suhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double suhuAwal, bebanKerjaServer, kekuatanAC;
        double suhuTertinggi = 0;
        double jamTerjadi = 0;
        String status = "Aman";

        System.out.print("Suhu ruangan saat pertama kali sistem dinyalakan: ");
        suhuAwal = input.nextDouble();
        input.nextLine();

        System.out.print("Seberapa berat beban kerja server: ");
        bebanKerjaServer = input.nextDouble();
        input.nextLine();

        System.out.print("Kekuatan pendingin ruangan: ");
        kekuatanAC = input.nextDouble();
        input.nextLine();

        for (int jam = 1; jam <= 24; jam++) {
            suhuAwal = suhuAwal + bebanKerjaServer - kekuatanAC;

            if (suhuAwal > suhuTertinggi) {
                jamTerjadi = jam;
                suhuTertinggi = suhuAwal;
            }

            if (suhuAwal >= 50) {
                jamTerjadi = jam;
                status = "Waspada";
                System.out.println("\"BAHAYA: OVERHEAT!\".");
                break;
            } 

            if (jam >= 12 && jam < 13) {
                System.out.println("");
                System.out.println("---------------------------------");
                System.out.println("Waktunya Istirahat");
                System.out.println("---------------------------------");
                System.out.println("");
                continue;
            }

            System.out.println("Jam " + jam + ": " + suhuAwal + " C");
        }
    
        System.out.println("---------------------------------");
        System.out.println("===       Laporan Akhir       ===");
        System.out.println("Suhu tertinggi yang pernah tercapai\t: " + suhuTertinggi);
        System.out.println("Pada jam suhu tertinggi terjadi\t\t: " + jamTerjadi);
        System.out.println("Status akhir ruangan (aman/waspada): " + status);
        System.out.println("---------------------------------");
    }
}