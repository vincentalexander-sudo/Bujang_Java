
import java.util.Scanner;

public class Labirin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] peta = new char[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                peta[i][j] = '.';
            }
        }

        for (int i = 0; i < peta.length; i++) {
            int posisiPagar = (int) (Math.random() * 6);
            peta[i][posisiPagar] = '#';
        }

        peta[0][0] = 'P';
        peta[5][5] = 'E';
        int pKolom = 0;
        int pBaris = 0;
        int langkah = 0;

        while (true) {
            String pilihan;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(peta[i][j]);
                }
                System.out.println();
            }
            System.out.print("Pilihan (w: atas, a: kiri, s: bawah, d: kanan): ");
            pilihan = input.nextLine();
        
            if(pilihan.equalsIgnoreCase("w")){
                if((pBaris - 1 >= 0) && (peta[pBaris - 1][pKolom] != '#')) {
                    peta[pBaris][pKolom] = '.';
                    pBaris--;
                    peta[pBaris][pKolom] = 'P';
                }else {
                    System.out.println("Duk! Nabrak tembok!");
                }
            }else if (pilihan.equalsIgnoreCase("a")) {
                if((pKolom - 1 >= 0) && (peta[pBaris][pKolom - 1] != '#')) {
                    peta[pBaris][pKolom] = '.';
                    pKolom--;
                    peta[pBaris][pKolom] = 'P';
                }else {
                    System.out.println("Duk! Nabrak tembok!");
                }
            }else if (pilihan.equalsIgnoreCase("s")) {
                if((pBaris + 1 <= 5) && (peta[pBaris + 1][pKolom] != '#')) {
                    peta[pBaris][pKolom] = '.';
                    pBaris++;
                    peta[pBaris][pKolom] = 'P';
                }else {
                    System.out.println("Duk! Nabrak tembok!");
                }
            }else if (pilihan.equalsIgnoreCase("d")) {
                if((pKolom + 1 <= 5) && (peta[pBaris][pKolom + 1] != '#')) {
                    peta[pBaris][pKolom] = '.';
                    pKolom++;
                    peta[pBaris][pKolom] = 'P';
                }else {
                    System.out.println("Duk! Nabrak tembok!");
                }
            }else {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            if (pilihan.equalsIgnoreCase("w") || pilihan.equalsIgnoreCase("a") || pilihan.equalsIgnoreCase("s") || pilihan.equalsIgnoreCase("d")) {
                langkah++;
            }

            System.out.println("Langkah ke: " + langkah);
            System.out.println("Posisi: [" + pBaris + "," + pKolom + "]");

            if(pBaris == 5 && pKolom == 5) {
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print(peta[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("Selamat! Anda menang!");
                break;
            }
        }
    }
}
