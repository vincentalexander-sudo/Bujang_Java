import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai;
        int absensi;
        String konfirmasi;

        while (true) { 
            System.out.print("Masukkan nilai IPK mahasiswa (0.0 - 4.0): ");
            nilai = input.nextDouble();
            System.out.print("Masukkan persentase kehadiran (0 - 100): ");
            absensi = input.nextInt();
            input.nextLine();

            if (nilai > 4.0 || absensi > 100) {
                System.out.println("Nilai IPK atau persentase kehadiran tidak valid.");
                continue;
            }

            if (nilai >= 3.5 && absensi >= 80) {
                System.out.println("Selamat! Anda lolos seleksi beasiswa.");
            } else {
                System.out.println("Maaf, Anda belum memenuhi kriteria beasiswa.");
            }

            System.out.print("Mau lanjut ga? (y/n)");
            konfirmasi = input.nextLine();
            if (konfirmasi.equals("n")) {
                break;
            }
        }
        System.out.println("Terima kasih telah berpatisipasi program ini.");
    }
}
