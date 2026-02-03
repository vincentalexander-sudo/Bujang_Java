
import java.util.Scanner;

public class Restoran {
    static void menuMakanan() {
        System.out.println("Menu Makanan");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Steak");
    }

    static void menuMinuman() {
        System.out.println("Menu Minuman");
        System.out.println("1. Es Teh");
        System.out.println("2. Es Jeruk");
        System.out.println("3. Kopi");
    }

    static int struk(int pilihan2, int pilihan, int jumlah) {
        int harga;
        int total = 0;

        if (pilihan == 1) {
            switch (pilihan2) {
                case 1 -> {
                    harga= 15000;
                    total = harga * jumlah;
                }
                case 2 -> {
                    harga = 20000;
                    total = harga * jumlah;
                }
                case 3 -> {
                    harga = 25000;
                    total = harga * jumlah;
                }
                default -> System.out.println("Pilihan tidak tersedia");
            }   
        }else if (pilihan == 2) {
            switch (pilihan2) {
                case 1 -> {
                    harga = 5000;
                    total = harga * jumlah;
                }
                case 2 -> {
                    harga = 10000;
                    total = harga * jumlah;
                }
                case 3 -> {
                    harga = 15000;
                    total = harga * jumlah;
                }
                default -> System.out.println("Pilihan tidak tersedia");
            }   
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang Di Restoran Kami");
        int pilihan, pilihan2, jumlah;
        int totalKeseluruhan = 0;

        while (true) { 
            System.out.println("\n=== Menu Makanan dan Minuman ===");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                menuMakanan();
                System.out.print("Pilihan Makanan: ");
                pilihan2 = input.nextInt();
                System.out.print("Jumlah Pesanan: ");
                jumlah = input.nextInt();
                struk(pilihan2, pilihan, jumlah);
            }else if (pilihan == 2) {
                menuMinuman();
                System.out.print("Pilihan Minuman: ");
                pilihan2 = input.nextInt();
                System.out.print("Jumlah Pesanan: ");
                jumlah = input.nextInt();
                struk(pilihan2, pilihan, jumlah);
            }else if (pilihan == 3) {
                System.out.println("Total Keseluruhan: " + totalKeseluruhan);
                System.out.println("Terima Kasih");
                break;
            }else {
                System.out.println("Pilihan tidak tersedia");
                continue;
            }

            totalKeseluruhan += struk(pilihan2, pilihan, jumlah);
        }
    }
}