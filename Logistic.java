
import java.util.Scanner;

public class Logistic {
    static void cekKeamanan (String kode){
        if (kode.equalsIgnoreCase("W-Pusat")) {
            System.out.println("Gudang Pusat: Pengiriman Prioritas!");
        }else if (kode.equalsIgnoreCase("W-Cabang")) {
            System.out.println("Gudang Cabang: Cek kelengkapan dokumen.");
        }else {
            System.out.println("PERINGATAN: Kode Gudang Tidak Dikenal!");
        }
    }

    static double ambilBiayaKiriman (String wilayah) {
        if (wilayah.equalsIgnoreCase("Jabodetabek")) {
            return 15_000;
        }else if (wilayah.equalsIgnoreCase("Luar Kota")) {
            return 35_000;
        }else {
            return 50_000;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kode, wilayah;
        double biayaPengiriman;
        double harga;

        System.out.print("Kode pengiriman: ");
        kode = input.nextLine();

        System.out.print("Wilayah Pengiriman");
        wilayah = input.nextLine();

        System.out.print("Harga Barang: ");
        harga = input.nextDouble();
        input.nextLine();

        cekKeamanan(kode);
        
        biayaPengiriman = harga + ambilBiayaKiriman(wilayah);
        System.out.printf("Biaya Pengiriman: %.0f", biayaPengiriman);
    }
}
