
import java.util.Scanner;

public class Marketing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahMarketing;
        double totalUang = 0;

        System.out.print("Jumlah Marketing yang mau dihitung gajinya: ");
        jumlahMarketing = input.nextInt();
        input.nextLine();

        String[] namaMarketing = new String[jumlahMarketing];
        double[] totalPenjualanRumah = new double[jumlahMarketing];

        for (int i = 0; i < jumlahMarketing; i++) {
            System.out.print("Nama Marketing: ");
            namaMarketing[i] = input.nextLine();

            System.out.print("Total Penjualan Rumah: ");
            totalPenjualanRumah[i] = input.nextDouble();
            input.nextLine();

            if (totalPenjualanRumah[i] > 500_000_000) {
                totalPenjualanRumah[i] = totalPenjualanRumah[i] * 0.2;
            } else if (totalPenjualanRumah[i] > 200_000_000) {
                totalPenjualanRumah[i] = totalPenjualanRumah[i] * 0.1;
            } else {
                totalPenjualanRumah[i] = totalPenjualanRumah[i] * 0.05;
            }

            System.out.println("Nama " + namaMarketing[i] + " Mendapatkan Komisi: Rp." + totalPenjualanRumah[i]);
            totalUang += totalPenjualanRumah[i];
        }

        System.out.println("Total Pengeluaran Perusahaan\t: " + totalUang);
    }
}