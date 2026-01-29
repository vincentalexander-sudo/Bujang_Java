import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] peta = new String[5][5];
        boolean[][] lokasiMusuh = new boolean[5][5];
        int jumlahMusuh = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                peta[i][j] = "~";
                
                if (Math.random() < 0.2) {
                    lokasiMusuh[i][j] = true;
                    jumlahMusuh++;
                }
            }
        }

        System.out.println("=== WELCOME TO BATTLESHIP ===");
        System.out.println("Ada " + jumlahMusuh + " kapal musuh tersembunyi!");

        while (jumlahMusuh > 0) { 
            System.out.print("    "); 
            for (int i = 0; i < 5; i++){
                System.out.print(i + "   ");
            } 
            System.out.println("\n-------------------------");

            for (int i = 0; i < 5; i++) {
                System.out.print(i + " | ");
                for (int j = 0; j < 5; j++) {
                    System.out.print(peta[i][j] + "   ");
                }
                System.out.println();
            }

            System.out.print("\nMasukkan baris (0-4): ");
            int baris = input.nextInt();
            System.out.print("Masukkan kolom (0-4): ");
            int kolom = input.nextInt();
           
            if (baris < 0 || baris > 5 || kolom < 0 || kolom > 5) {
                System.out.println("Koordinat tidak valid!");
                continue;
            }
            if (lokasiMusuh[baris][kolom] == true) {
                peta[baris][kolom] = "X";
                jumlahMusuh--;
                System.out.println("Musuh terkena serangan!");
            } else {
                peta[baris][kolom] = "O";
                System.out.println("Serangan gagal! Kapal musuh tersisa " + jumlahMusuh);
            }
        }
    }  
}