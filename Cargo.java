
import java.util.Scanner;

public class Cargo {
    static void cekKeamanan(String kategori, boolean isPecahBelah){
        if (kategori.equalsIgnoreCase("Elektronik")) {
            if (isPecahBelah) {
                System.out.println("Wajib Menggunakan Palet Kayu");
            }else {
                System.out.println("Gunakan Bubble Wrap Tebal");
            }
        }else {
            System.out.println("Penanganan Standar");
        }
    }

    static double hitungAsuransi(String tipeMember, double hargaBarang){
        if (tipeMember.equalsIgnoreCase("VIP")) {
            if (hargaBarang >= 1_000_000) {
                return hargaBarang * 0.05;
            }else {
                return hargaBarang * 0.02;
            }
        }else if (tipeMember.equalsIgnoreCase("Reguler")) {
            return hargaBarang * 0.01;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kategori, tipeMember;
        boolean isPecahBelah;
        double hargaBarang, biayaAsuransi;
        double totalBiaya;

        System.out.print("Kategori Barang: ");
        kategori = input.nextLine();
        System.out.print("Pecah Belah? (true/false): "); 
        isPecahBelah = input.nextBoolean();
        input.nextLine();
        cekKeamanan(kategori, isPecahBelah);

        System.out.print("Tipe Member: "); 
        tipeMember = input.nextLine();

        System.out.print("Harga Barang: "); 
        hargaBarang = input.nextDouble();
        input.nextLine();
        
        biayaAsuransi = hitungAsuransi(tipeMember, hargaBarang);
        totalBiaya = hargaBarang + biayaAsuransi;
        System.out.printf("Biaya Asuransi: %.0f", totalBiaya);
    }
}
