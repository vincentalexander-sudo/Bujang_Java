
import java.util.Scanner;

public class ifWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaBarang;
        int jumlahStock;
        double stok, batasMinimun;
        double rasio = 0;

        System.out.print("jumlah jenis barang yang ingin dicek: ");
        jumlahStock = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= jumlahStock; i++) {
            System.out.println("Barang ke-" + i);
            System.out.print("Nama Barang: ");
            namaBarang = input.nextLine();
            System.out.print("Stock saat ini: ");
            stok = input.nextInt();
            input.nextLine();
            System.out.print("Batas Minimal Stok: ");
            batasMinimun = input.nextDouble();
            input.nextLine();

            rasio = stok / batasMinimun;

            if (stok > batasMinimun) {
                System.out.println("Status: AMAN");
            }else if (stok == batasMinimun) {
                System.out.println("Status: WASPADA");
            }else {
                System.out.println("Status: PERLU PESAN ULANG (REORDER)");
                System.out.printf("Tingkat Kesehatan Stok: %.2f\n", rasio);
                if (stok == 0){
                    System.out.println("Status: REORDER (KRITIS)");
                }else if (rasio <= 0.5) {
                    System.out.println("Status: REORDER (Prioritas Tinggi)");
                }else {
                    System.out.println("Status: REORDER (Prioritas Normal)");
                }
            }
        }
    }
}
