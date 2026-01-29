
import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahKursi;

        System.out.print("Masukkan jumlah kursi: ");
        jumlahKursi = input.nextInt();

        String[][] kursi = new String[jumlahKursi][jumlahKursi];
        for (int i = 0; i < jumlahKursi; i++) {
            for (int j = 0; j < jumlahKursi; j++) {
                kursi[i][j] = "_";
            }
        }

        while (true) { 
            int baris, kolom, pilihan;
            System.out.print("Mau pesan tiket? (1: Ya, 0: Tidak): ");
            pilihan = input.nextInt();

            if (pilihan == 0) {
                break;
            }

            System.out.print("    "); 
            for (int i = 0; i < jumlahKursi; i++) {
                System.out.print(i + "   ");
            }
            System.out.println();

            for (int i = 0; i < jumlahKursi; i++) {
                System.out.print(i + " | ");
                for (int j = 0; j < jumlahKursi; j++) {
                    System.out.print(kursi[i][j] + " | ");
                }
                System.out.println();
            }


            System.out.print("Masukkan baris kursi: ");
            baris = input.nextInt();
            System.out.print("Masukkan kolom kursi: ");
            kolom = input.nextInt();

            if (baris < 0 || baris >= jumlahKursi || kolom < 0 || kolom >= jumlahKursi) {
                System.out.println("Kursi tidak tersedia.");
            }else if (kursi[baris][kolom].equalsIgnoreCase("X")) {
                System.out.println("Kursi sudah terisi.");
            }else {
                kursi[baris][kolom] = "X";
                System.out.println("Tiket berhasil dipesan.");
            }

            System.out.print("    "); 
            for (int i = 0; i < jumlahKursi; i++) {
                System.out.print(i + "   ");
            }
            System.out.println();

            for (int i = 0; i < jumlahKursi; i++) {
                System.out.print(i + " | ");
                for (int j = 0; j < jumlahKursi; j++) {
                    System.out.print(kursi[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.println("---------------------------------");
        }
    }
}