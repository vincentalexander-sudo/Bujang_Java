
import java.util.Scanner;

public class GudangData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahData;
        double totalBeban = 0;

        System.out.print("Masukkan jumlah data: ");
        jumlahData = input.nextInt();

        String[] idBarang = new String[jumlahData];
        double[] beban = new double[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("ID Barang: ");
            idBarang[i] = input.next();

            System.out.print("Beban: ");
            beban[i] = input.nextDouble();

            if (beban[i] < 10) {
                System.out.println("Kategori Ringan");
            }else if (beban[i] >= 10 && beban[i] <= 20) {
                System.out.println("Kategori Sedang");
            }else {
                System.out.println("Kategori Berat");
            }
            System.out.println("Beban dengan ID " + idBarang[i] + " saat ini: " + beban[i] + " kg");
            totalBeban += beban[i];
        }

        System.out.printf("Total beban: %.2f kg", totalBeban );
        double rataRataBeban = totalBeban / jumlahData;
        System.out.printf("\nRata-rata beban: %.2f kg", rataRataBeban);
    }
}
