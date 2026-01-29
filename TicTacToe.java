
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] papan = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                papan[i][j] = '-';
            }
        }

        boolean gameselesai = false;
        char pemain = 'X';
        int langkah = 0;

        while (!gameselesai) {
            boolean menang = false;
            System.out.println("_____________");
            for (int i = 0; i < 3; i++) {
                System.out.print("|"+ " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(papan[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.println("_____________");

            System.out.print("Masukkan baris: ");
            int baris = input.nextInt();

            System.out.print("Masukkan kolom: ");
            int kolom = input.nextInt();

            if (baris < 0 || baris > 2 || kolom < 0 || kolom > 2) {
                System.out.println("Baris atau kolom tidak valid.");
                continue;
            }

            if (papan[baris][kolom] != '-') {
                System.out.println("Kotak sudah terisi.");
                continue;
            }

            papan[baris][kolom] = pemain;
            langkah++;

            if (papan[0][0] == pemain && papan[0][1] == pemain && papan[0][2] == pemain) {
                menang = true;
            } else if (papan[1][0] == pemain && papan[1][1] == pemain && papan[1][2] == pemain) {
                menang = true;
            } else if (papan[2][0] == pemain && papan[2][1] == pemain && papan[2][2] == pemain) {
                menang = true;
            } else if (papan[0][0] == pemain && papan[1][0] == pemain && papan[2][0] == pemain) {
                menang = true;
            } else if (papan[0][1] == pemain && papan[1][1] == pemain && papan[2][1] == pemain) {
                menang = true;
            } else if (papan[0][2] == pemain && papan[1][2] == pemain && papan[2][2] == pemain) {
                menang = true;
            } else if (papan[0][0] == pemain && papan[1][1] == pemain && papan[2][2] == pemain) {
                menang = true;
            } else if (papan[0][2] == pemain && papan[1][1] == pemain && papan[2][0] == pemain) {
                menang = true;
            }

            if (menang) {
                System.out.println("Pemain " + pemain + " menang!");
                gameselesai = true;
            } else if (langkah == 8) {
                System.out.println("Seri!");
                gameselesai = true;
            } else {
                if (pemain == 'X') {
                    pemain = 'O';
                } else {
                    pemain = 'X';
                }
            }
        }
    }
}
