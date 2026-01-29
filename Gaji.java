
import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jamKerja;
        String golongan;
        double gajiPokok = 0;
        double gajiKotor = 0;
        double gajiBersih = 0;
        double pajak = 0;
        double BonusLembur = 0;

        System.out.print("Golongan: ");
        golongan = input.nextLine();
        System.out.print("Jam Kerja: ");
        jamKerja = input.nextInt();
        input.nextLine();

        if(golongan.equalsIgnoreCase("A")){
            gajiPokok += 4_000_000;
        }else if (golongan.equalsIgnoreCase("B")) {
            gajiPokok += 5_000_000;
        }else if (golongan.equalsIgnoreCase("C")) {
            gajiPokok += 8_000_000;
        } else {
            System.out.println("LOG ERROR: Golongan '" + golongan + "' tidak ditemukan di database!");
        }

        if (jamKerja > 160) {
            BonusLembur = (jamKerja - 160) * 50_000;
        }

        gajiKotor = gajiPokok + BonusLembur;

        if (gajiKotor > 7_000_000) {
            pajak = gajiKotor * 0.1;
        }

        gajiBersih = gajiKotor - pajak;

        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Gaji Kotor: " + gajiKotor);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}
