
import java.util.Scanner;

public class SilentAuditor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahHarga;

        System.out.print("Jumlah Barang: ");
        jumlahHarga = input.nextInt();
        input.nextLine();

        int[] harga = new int[jumlahHarga];
        int totalKomisi = 0;
        for (int i = 0; i < harga.length; i++) {
            int diskon = 0;
            System.out.print("Harga Barang ke-" + (i + 1) + ": ");
            harga[i] = input.nextInt();
            input.nextLine();
            
            if (harga[i] == 0) {
                System.out.println("Barang ke-" + (i + 1) + " pesanan dibatalkan");
                continue;
            }else if (harga[i] < 0) {
                System.out.println("Barang ke-" + (i + 1) + " rusak.");
                break;
            }
            else {
                diskon = harga[i] * 10 / 100;
                harga[i] += diskon;
            }

            totalKomisi += harga[i];
            System.out.println("Harga barang Saat ini: " + harga[i]);

            if (totalKomisi >= 50_000) {
                System.out.println("Target minimal tercapai!");
                break;
            }
        }
        System.out.println("Total harga barang\t: " + totalKomisi);
    }
}
