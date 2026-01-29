
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahBarang, stok, hargaBarang, jumlahTerjual, totalHarga = 0;
        String namaBarang;

        System.out.print("Jumlah Barang: ");
        jumlahBarang = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahBarang; i++) {
            int pendapatan = 0;
            int nilaiStok = 0;
            System.out.println("Barang ke-" + (i + 1));
            System.out.print("Nama Barang: ");
            namaBarang = input.nextLine();

            System.out.print("Stok Tersedia: ");
            stok = input.nextInt();
            input.nextLine();

            System.out.print("Harga Barang: ");
            hargaBarang = input.nextInt();
            input.nextLine();

            System.out.print("Jumlah Terjual: ");
            jumlahTerjual = input.nextInt();
            input.nextLine();

            if (jumlahTerjual > 100) {
                System.out.println("Fast Moving");
            }else if (jumlahTerjual >= 50 && jumlahTerjual <= 100) {
                System.out.println("Normal");
            }else {
                System.out.println("Slow Moving");
            }

            pendapatan = jumlahTerjual * hargaBarang;
            nilaiStok = stok * hargaBarang;
            totalHarga += pendapatan;
            System.out.println("Pendapatan: " + pendapatan);
            System.out.println("Nilai Stok: " + nilaiStok);
        }
        System.out.println("Total Pendapatan: " + totalHarga);
    }
}
