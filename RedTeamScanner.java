
import java.util.Scanner;

public class RedTeamScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahKode;
        int totalKode = 0;
        boolean isbatas = false;

        System.out.print("Jumlah Kode: ");
        jumlahKode = input.nextInt();
        input.nextLine();

        int[] kode = new int[jumlahKode];

        for(int i = 0; i < jumlahKode; i++) {
            System.out.print("Kode ke-" + (i + 1) + ": ");
            kode[i] = input.nextInt();
            input.nextLine();

            if (kode[i] == 13 || kode[i] == 0) {
                System.out.println("Pembersihan log rutin");
                continue;
            }else if (kode [i] == 666) {
                System.out.println("BAHAYA! Malware 666 terdeteksi. Scanner dimatikan!");
                break;
            }else if (kode[i] == 1000) {
                System.out.println("Akses Admin terverifikasi");
                totalKode++;
            }

            if (totalKode == 3 && !isbatas) {
                System.out.println("Ambang batas keamanan tercapai!");
                isbatas = true;
            }
        }

        System.out.println("Total Kode: " + totalKode);
    }
}
