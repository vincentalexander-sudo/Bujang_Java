
import java.util.Scanner;

public class Ecommerce {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int jumlahBarang, jarakPengiriman;
       double hargaBarang;
       String namaBarang, kategoriBarang;
       double pajak = 0;
       double totalBayar = 0;

       System.out.print("Jumlah Barang: ");
       jumlahBarang = input.nextInt();
       input.nextLine();

       System.out.print("Jarak Pengirimanan: ");
       jarakPengiriman = input.nextInt();
       input.nextLine();

       for (int i = 0; i < jumlahBarang; i++) {
           System.out.println("Barang ke-" + (i+1));
           System.out.print("Nama Barang: ");
           namaBarang = input.nextLine();

           System.out.print("Harga Barang: ");
           hargaBarang = input.nextInt();
           input.nextLine();

           System.out.print("Kategori Barang: ");
           kategoriBarang = input.nextLine();

           if (kategoriBarang.equalsIgnoreCase("Elektronik")) {
               pajak = hargaBarang * 0.15;
           }else if (kategoriBarang.equalsIgnoreCase("Pakaian")) {
               pajak = hargaBarang * 0.05;
           }else {
               pajak = hargaBarang * 0;
           }
           totalBayar += hargaBarang + pajak;
       }

        double biayaOngkir = 0;
        if (totalBayar <= 500000) {
            biayaOngkir = jarakPengiriman * 5000;
        }

        double grandTotal = totalBayar + biayaOngkir;
        System.out.println("Total Bayar: " + grandTotal);

       System.out.println("Total Bayar: Rp." + totalBayar);
    }
}
