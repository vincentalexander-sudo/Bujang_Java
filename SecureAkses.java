
import java.util.Scanner;

public class SecureAkses {
    static void verfikasiAkses (int pin) {
        if (pin == 2026) {
            System.out.println("STATUS: Akses Diterima. Enkripsi Aktif!");
        }else {
            System.out.println("STATUS: Akses Ditolak. Enkripsi Tidak Aktif!");
        }
    }

    static double tentukanPajak (double totalBelanja){
        if (totalBelanja >= 500_000) {
            return 0.05;
        }else {
            return 0.02;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pinAnda;
        double totalBelanja, pajak, hargaDenganPajak;

        System.out.print("Masukkan PIN Anda: "); 
        pinAnda = input.nextInt();
        input.nextLine();
        verfikasiAkses(pinAnda);
        
        System.out.print("Masukkan Total Belanja: "); 
        totalBelanja = input.nextInt();
        input.nextLine();

        pajak = tentukanPajak(totalBelanja);
        hargaDenganPajak = totalBelanja + (totalBelanja * pajak);
        System.out.println("Total Belanja: " + hargaDenganPajak);
    }
}
