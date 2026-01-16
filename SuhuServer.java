import java.util.Scanner;

public class SuhuServer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int server;
        double totalSuhu = 0;
        int overheatCount = 0;

        System.out.print("Masukkan jumlah server: ");
        server = input.nextInt();
        Double[] suhu = new Double[server];

        for (int i = 0; i < server; i++) {
            System.out.print("Suhu server ke-" + (i+1) + ":");
            suhu[i] = input.nextDouble();
            input.nextLine();

            if (suhu[i] > 80){
                overheatCount++;
            }
            totalSuhu += suhu[i];
        }
        double rataRata = totalSuhu / server;

        System.out.println("Rata-rata suhu ruangan\t\t: " + rataRata);
        System.out.println("Jumlah server yang overheat\t: " + overheatCount);
        if (overheatCount > 0) {
            System.out.println("\"BAHAYA! SEGERA NYALAKAN PENDINGIN CADANGAN!\"");
        }else {
            System.out.println("\"Sistem Aman Terkendali.\"");
        }
    }
}
