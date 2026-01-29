
import java.util.Scanner;

public class Penggajian {
    static int hitungBonus(int jualan) {
        if (jualan > 100) {
            return 500_000;
        } else if (jualan >= 50) {
            return 250_000;
        }
        else {
            return 0;
        }
    }

    static void tampilkanLaporan(String nama, int jualan) {
        System.out.println("Nama : " + nama);
        System.out.println("Bonus : " + hitungBonus(jualan));

        if (jualan > 0) {
            System.out.println("Status        : TARGET TERCAPAI!");
        }else {
            System.out.println("Status        : TARGET BELUM TERCAPAI!");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int jualan;
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Jualan: ");
        jualan = input.nextInt();
        tampilkanLaporan(nama, jualan);
    }
}
