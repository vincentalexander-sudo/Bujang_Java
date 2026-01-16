
import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double d1,d2, p,H;

        System.out.print("Harga asli barang (Price)\t\t: ");
        p = input.nextDouble();
        input.nextLine();

        System.out.print("Persentase diskon pertama (toko)\t: ");
        d1 = input.nextDouble();
        input.nextLine();

        System.out.print("Persentase diskon kedua (member)\t: ");
        d2 = input.nextDouble();
        input.nextLine();

        H = p * ((1-d1) * (1-d2));

        System.out.println("Harga akhir yang harus dibayar\t\t: " + H);

        if (H > p) {
           System.out.println("\"[SYSTEM ERROR] Invalid Discount Value: Price logic corrupted!\""); 
        }
    }
}