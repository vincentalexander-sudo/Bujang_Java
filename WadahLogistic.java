
import java.util.Scanner;

public class WadahLogistic {
    static void auditKeamanaGudang (String gudang, boolean ismalam) {
        if (gudang.equalsIgnoreCase("Pusat")) {
            if (ismalam) {
                System.out.println("Level Keamanan: MAKSIMAL (Penjagaan 24 Jam)");
            }else {
                System.out.println("Level Keamanan: TINGGI (Jam Operasional)");
            }
        }else {
            System.out.println("Level Keamanan: STANDAR");
        }
    }

    static double hitungOngkirElite(String wilayah, String layanan){
        if (wilayah.equalsIgnoreCase("Jawa")) {
            if (layanan.equalsIgnoreCase("Ekspres")) {
                return 20_000;
            }else if (layanan.equalsIgnoreCase("Reguler")) {
                return 10_000;
            }else {
                return 0;
            }
        }else if (wilayah.equalsIgnoreCase("Luar Jawa")) {
            if (layanan.equalsIgnoreCase("Ekspres")) {
                return 50_000;
            }else if (layanan.equalsIgnoreCase("Reguler")) {
                return 35_000;
            }else {
                return 0;
            }
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gudang, wilayah, layanan;
        boolean ismalam;
        double biayaPengiriman;
        double total;

        System.out.print("gudang pengiriman: ");
        gudang = input.nextLine();

        System.out.print("jam operasional: ");
        ismalam = input.nextBoolean();
        input.nextLine();

        auditKeamanaGudang(gudang, ismalam);

        System.out.print("wilayah tujuan: ");
        wilayah = input.nextLine();

        System.out.print("layanan pengiriman: ");
        layanan = input.nextLine();

        System.out.print("Biaya Pengiriman: ");
        biayaPengiriman = input.nextDouble();
        input.nextLine();

        total = biayaPengiriman + hitungOngkirElite(wilayah, layanan);
        System.out.printf("Total Biaya Pengiriman: %.0f", total);
    }
}
