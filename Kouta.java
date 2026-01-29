
import java.util.Scanner;

public class Kouta {
    static void cekPeringatanKouta(int sisaKuota, int batasPeringatan){
        if (sisaKuota < 100) {
            System.out.println("DARURAT!, Kuota Anda sisa sangat sedikit. Segera beli paket baru!");
            System.out.println("sisa kuota: " + sisaKuota);
        }else if (sisaKuota < batasPeringatan) {
            System.out.println("WASPADA! Kuota Anda sisa sedikit. Segera beli paket baru!");
            System.out.println("sisa kuota: " + sisaKuota);
        } else {
            System.out.println("Koneksi aman. Nikmati harimu!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisaKuota, batasPeringatan;
        System.out.print("Masukkan sisa kuota: ");
        sisaKuota = input.nextInt();
        System.out.print("Masukkan batas peringatan: ");
        batasPeringatan = input.nextInt();
        cekPeringatanKouta(sisaKuota, batasPeringatan);
    }
}
