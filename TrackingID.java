
import java.util.Scanner;

public class TrackingID {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahID;
        int totalPaket = 0;
        boolean ispencapain = false;

        System.out.print("Jumlah ID: ");
        jumlahID = input.nextInt();
        input.nextLine();

        int[] id = new int[jumlahID];

        for (int i = 0; i < jumlahID; i++) {
            System.out.print("ID ke-" + (i + 1) + ": ");
            id[i] = input.nextInt();
            input.nextLine();

            if (id[i] == 999 || id[i] == 0) {
                System.out.println("ID ke-" + (i + 1) + " tidak valid.");
                continue;
            } 

            if (id[i] == 404) {
                System.out.println("SECURITY ALERT: ID 404 terdeteksi! Sistem dikunci");
                break;
            }

            System.out.println("id ke-" + (i + 1) + " aman, dikirim ke supplier.");

            totalPaket++;

            if (totalPaket >= 5 && !ispencapain) {
                System.out.println("Target tercapai, sistem dikunci.");
                ispencapain = true;
            }
        }

        System.out.printf("Total paket: %d", totalPaket);
    }
}
