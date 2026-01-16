
import java.util.Scanner;

public class DevOps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double data,rataRata;
        int durasiPerbulan;

        System.out.print("Jumlah data awal saat ini\t\t\t: ");
        data = input.nextDouble();
        input.nextLine();

        System.out.print("Rata-rata persentase pertumbuhan data per bulan\t: ");
        rataRata = input.nextDouble();
        input.nextLine();

        System.out.print("Durasi prediksi (dalam bulan)\t\t\t: ");
        durasiPerbulan = input.nextInt();
        input.nextLine();

        System.out.println(" ");

        for (int i = 1; i <= durasiPerbulan; i++) {
            data = data + (data * (rataRata / 100));

            System.out.println("Data Bulan ke-" + i + " : " + data + " GB");
        }
        System.out.println("---------------------------------");
        System.out.println("=        LAPORAN AKHIR          =");
        System.out.println("---------------------------------");
        System.out.println("Total Keseluruhan\t: " + data + " GB");
    }
}
