
import java.util.Scanner;

public class Methodarray {
    static double hitungKomisi(double harganya) {
        if (harganya > 0) {
            return harganya * 0.1;
        } else {
            return 0;
        }
    }

    static void cetakLog(String status, double nilai) {
        System.out.println("status : " + status + ", nilai : " + nilai);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahHarga;
        int totalKomisi = 0;
        System.out.print("Jumlah Barang: ");
        jumlahHarga = input.nextInt();
        input.nextLine();

        double[] harga = new double[jumlahHarga];
        for (int i = 0; i < jumlahHarga; i++) {
            System.out.print("Harga Barang ke-" + (i + 1) + ": ");
            harga[i] = input.nextDouble();
            input.nextLine();

            if (harga[i] == 0) {
                cetakLog("skip", harga[i]);
                continue;
            }

            if (harga[i] < 0) {
                cetakLog("dibatalkan", harga[i]);
                break;
            }

            totalKomisi += hitungKomisi(harga[i]);
            cetakLog("Success", hitungKomisi(harga[i]));
        }

        System.out.println("Total Komisi: " + totalKomisi);
    }
}
