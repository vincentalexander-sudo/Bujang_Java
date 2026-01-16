
import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahJenisBarang, batasStock;

        System.out.print("Jumlah Jenis Barang: ");
        jumlahJenisBarang = input.nextInt();
        input.nextLine();

        System.out.print("Batas Minimal Stok (Threshold): ");
        batasStock = input.nextInt();
        input.nextLine();

        String[] namaBarang = new String[jumlahJenisBarang];
        int[] jumlahStock = new int[jumlahJenisBarang];

        for (int i = 0; i < jumlahJenisBarang; i++) {
            System.out.print("Barang ke-" + (i+1) + ": ");
            namaBarang[i] = input.nextLine();
            System.out.print("Jumlah Stock: ");
            jumlahStock[i] = input.nextInt();
            input.nextLine();

            if (jumlahStock[i] < batasStock) {
                System.out.println("Nama Barang: " + namaBarang[i] + " Sisa Stock: " + jumlahStock[i]);
            }
        }
    }
}