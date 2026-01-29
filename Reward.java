
import java.util.Scanner;

public class Reward {
    static double  menghitungPoin(double  totalBelanja){
        if (totalBelanja > 10_000) {
            return totalBelanja / 10_000;
        }else {
            return 0;
        }
    }

    static void tampilkanPoin(String nama, double belanja){
        System.out.println("Halo " + nama);
        System.out.printf("Total Poin anda adalah %.1f \n", menghitungPoin(belanja));
        System.out.println("Terima kasih sudah berbelanja di toko kami.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        double totalBelanja;

        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Total Belanja: ");
        totalBelanja = input.nextInt();

        tampilkanPoin(nama, totalBelanja);
    }
}
