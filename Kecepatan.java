
import java.util.Scanner;

public class Kecepatan {
    @SuppressWarnings("UnnecessaryContinue")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kecepatanAwal, waktuMaksimal, ketinggian, kecepatanSekarang;
        double gravitasi = 9.8;
        double detik = 0;
        double posisiTertinggi = 0;


        System.out.print("Kecepatan awal saat melompat (dalam m/s): ");
        kecepatanAwal = input.nextDouble();
        input.nextLine();

        System.out.print("Durasi maksimal pengecekan yang diinginkan user (dalam detik): ");
        waktuMaksimal = input.nextDouble();
        input.nextLine();

        for (int t = 0; t <= waktuMaksimal; t++) {
            if (t % 2 != 0) {
                continue;
            }
            
            ketinggian = (kecepatanAwal * t) - (0.5 * gravitasi * (t * t));
            kecepatanSekarang = kecepatanAwal - (gravitasi * t);

            System.out.println("Detik ke-" + t);
            if (ketinggian > posisiTertinggi) {
                posisiTertinggi = ketinggian;
            }

            if (kecepatanSekarang >= -1 && kecepatanSekarang <= 1) {
                System.out.println("Detik ke-" + t + ": Titik Tertinggi (Apex)!");
            }
            
            if (ketinggian < 0 && t > 0) {
                System.out.println("Detik ke-" + t + ": Cure Sky sudah mendarat!");
                detik = t; 
                break; 
            }
        }

        System.out.println("=============================");
        System.out.println("=    LAPORAN AKHIR FISIKA   =");
        System.out.println("Posisi tertinggi Cure Sky \t: " + posisiTertinggi);
        System.out.println("Detik Cure Sky mencapai tanah\t: " + detik);
        System.out.println("=============================");
    }
}
