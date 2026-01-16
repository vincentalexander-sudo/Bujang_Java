
import java.util.Scanner;

public class Koordinat {
    public static void  main (String[] args){
        Scanner input = new Scanner(System.in);
        int x, y, E;
        String kuadran, radius;

        System.out.print("Masukkan Variabel X: ");
        x = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Variabel Y: ");
        y = input.nextInt();
        input.nextLine();

        if (x == 0 && y == 0) {
            kuadran = "Titik Pusat";
        } else if (x == 0 || y == 0) {
            kuadran = "Garis Sumbu";
        } else if (x > 0 && y > 0) {
            kuadran = "Kuadran I";
        } else if (x < 0 && y > 0) {
            kuadran = "Kuadran II";
        } else if (x < 0 && y < 0) {
            kuadran = "Kuadran III";
        } else {
            kuadran = "Kuadran IV";
        }

        E = (x*x) + (y*y);
        if (E <= 100) {
            radius = "Aman";
        } else if (E > 100 && E <= 500) {
            radius = "Waspada";
        } else {
            radius = "Bahaya";
        }

        System.out.println("\n--- HASIL ANALISIS RADAR ---");
        if ((kuadran.equalsIgnoreCase("Kuadran I")) || (kuadran.equalsIgnoreCase("Kuadran II")) && radius.equalsIgnoreCase("Bahaya")){
            System.out.println("Kirim Tim Sky");
        } else if ((kuadran.equalsIgnoreCase("Kuadran III")) || (kuadran.equalsIgnoreCase("Kuadran IV")) && radius.equalsIgnoreCase("Bahaya")){
            System.out.println("Kirim Tim Prism");
        } else if ((kuadran.equalsIgnoreCase("Titik Pusat"))){
            System.out.println("Seluruh Tim (Full Power)");
        } else if ((kuadran.equalsIgnoreCase("Garis Origin"))){
            System.out.println("Tim Patroli Biasa");
        } else {
            System.out.println("Tim Standby");
        }
    }
}
