import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pemilihan, harga = 0, jumlah, totalKeseluruhan = 0, PilihanMakanan, PilihanMinuman;

        do { 
            System.out.println("\n=== Menu Makanan dan Minuman ===");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Cetak Struk (Lihat Total)");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: "); 
            pemilihan = input.nextInt();

            switch (pemilihan) {
                case 1 -> {
                    System.out.println("\n--- Menu Makanan ---");
                    System.out.println("1. Ayam Goreng (15.000)");
                    System.out.println("2. Ayam Bakar  (20.000)");
                    System.out.println("3. Ayam Geprek (25.000)");
                    System.out.print("Pilihan Makanan: ");
                    PilihanMakanan = input.nextInt();

                    if (PilihanMakanan == 1) harga = 15000;
                    else if (PilihanMakanan == 2) harga = 20000;
                    else if (PilihanMakanan == 3) harga = 25000;
                    else { System.out.println("Pilihan tidak tersedia"); harga = 0; }

                    if (harga != 0) {
                        System.out.print("Jumlah Pesanan: ");
                        jumlah = input.nextInt();
                        totalKeseluruhan += (harga * jumlah); 
                        System.out.println("Berhasil ditambahkan ke pesanan.");
                    }
                }
                case 2 -> {
                    System.out.println("\n--- Menu Minuman ---");
                    System.out.println("1. Es Teh    (5.000)");
                    System.out.println("2. Es Jeruk  (10.000)");
                    System.out.println("3. Es Kopi   (15.000)");
                    System.out.print("Pilihan Minuman: ");
                    PilihanMinuman = input.nextInt();
                    
                    if (PilihanMinuman == 1) harga = 5000;
                    else if (PilihanMinuman == 2) harga = 10000;
                    else if (PilihanMinuman == 3) harga = 15000;
                    else { System.out.println("Pilihan tidak tersedia"); harga = 0; }

                    if (harga != 0) {
                        System.out.print("Jumlah Pesanan: ");
                        jumlah = input.nextInt();
                        totalKeseluruhan += (harga * jumlah); // Akumulasi total
                        System.out.println("Berhasil ditambahkan ke pesanan.");
                    }
                }
                case 3 -> {
                    System.out.println("\n============================");
                    System.out.println("TOTAL BELANJA ANDA: Rp " + totalKeseluruhan);
                    System.out.println("============================");
                }
                case 4 -> System.out.println("Terima Kasih telah berkunjung!");
                default -> System.out.println("Pilihan salah!");
            }
        } while (pemilihan != 4);
    }
}