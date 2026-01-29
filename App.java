
import java.util.Scanner;

public class App {

    static void tampilkanMenu() {
        System.out.println("=== Menu Minuman ===");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Matcha");
    }
    static int menu (int pilihan, int jumlah){
        int harga, total;
        if (pilihan == 1) {
            harga = 10000;
            total = harga * jumlah;
            return total;
        }else if (pilihan == 2) {
            harga = 15000;
            total = harga * jumlah;
            return total;
        }else if (pilihan == 3) {
            harga = 20000;
            total = harga * jumlah;
            return total;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int pilihan, hasil, jumlah;

        tampilkanMenu();
        System.out.print("Pilihan: ");
        pilihan = input.nextInt();
        System.out.print("Jumlah: ");
        jumlah = input.nextInt();

        hasil = menu(pilihan, jumlah);
        System.out.println("Total: " + hasil);
    }
}