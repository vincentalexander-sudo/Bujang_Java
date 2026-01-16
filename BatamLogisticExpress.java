import java.util.Scanner;

public class BatamLogisticExpress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahPaket;
        double hargaDasar = 0;
        int totalMuatan = 0;
        double totalUang = 0;
        double diskon;
        double biayaAdmin = 2000;

        System.out.print("Jumlah Paket yang akan dikirim hari ini: ");
        jumlahPaket = input.nextInt();
        input.nextLine();

        final double  reguler = 10_000;
        final double  express = 18_000;

        int[] beratPaket = new int[jumlahPaket];
        String[] tipeLayanan = new String[jumlahPaket];

        for (int i = 0; i < jumlahPaket; i++) {
            System.out.print("Berat Paket: ");
            beratPaket[i] = input.nextInt();
            input.nextLine();

            System.out.print("Tipe Layanan: ");
            tipeLayanan[i] = input.nextLine();

            if (tipeLayanan[i].equalsIgnoreCase("reguler")) {
                hargaDasar = beratPaket[i] * reguler; 
            } else if (tipeLayanan[i].equalsIgnoreCase("express")) {
                hargaDasar = beratPaket[i] * express;
            }

            if (beratPaket[i] > 5) {
                diskon = hargaDasar * 0.1;
                hargaDasar -= diskon;
            } else if (beratPaket[i] <= 1) {
                hargaDasar = hargaDasar + biayaAdmin;
            }

            System.out.println("Paket ke-" + (i+1) + ": Rp." + hargaDasar);
            totalUang += hargaDasar;
            totalMuatan += beratPaket[i];
        }

        System.out.println("Total Pendapatan konter hari itu\t: " + totalUang);
        System.out.println("Total Muatan\t: " + totalMuatan);
    }
}
