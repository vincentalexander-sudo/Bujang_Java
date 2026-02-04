
import java.util.Scanner;

public class Akses {
    static void cekAkses (String username){
        if (username.equalsIgnoreCase("Admin")) {
            System.out.println("Akses Diterima: Selamat datang, Admin!");
        }else if (username.equalsIgnoreCase("Guest")) {
            System.out.println("Akses Terbatas: Halo, Pengunjung!");
        }else {
            System.out.println("Akses Ditolak: Username tidak dikenali.");
        }
    }

    static double hitungPotongan(String levelNumber){
        if (levelNumber.equalsIgnoreCase("Gold")) {
            return 0.2;
        }else if (levelNumber.equalsIgnoreCase("Silver")) {
            return 0.1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, levelNumber;
        double harga;
        double totalHarga;

        System.out.print("Masukkan Username: ");
        username = input.nextLine();

        System.out.print("Masukkan Level: ");
        levelNumber = input.nextLine();

        System.out.print("Masukkan Harga: ");
        harga = input.nextDouble();

        cekAkses(username);
        totalHarga = harga - (harga * hitungPotongan(levelNumber));
        System.out.println("Total Harga: " + totalHarga);
    }
}
