
import java.util.Scanner;

public class Transformasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        byte umur, hati, elemenWarna;
        String namaSerangan = ""; 
        int bonus = 0;

        System.out.println("=============================");
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Umur: ");
        umur = input.nextByte();
        System.out.print("Masukkan Kekuatan Hati: ");
        hati = input.nextByte();
        System.out.println(" ");

        if ((umur >= 12 && umur <=18) && hati > 50) {
            System.out.println("=============================");
            System.out.println("Status Henshin");
            System.out.print("Masukkan Elemen: ");
            elemenWarna = input.nextByte();

            switch (elemenWarna) {
                case 1 ->{
                    namaSerangan = "Heartly Pink Blast";
                    bonus = 25;
                }
                case 2 ->{
                    namaSerangan = "Sky Blue Stream";
                    bonus = 15;
                }
                case 3 ->{
                    namaSerangan = "Sunshine Golden Flash";
                    bonus = 10;
                }
                default -> {
                    System.out.println("anda salah memasuki data");
                }
            }

            int totalKekuatan = hati + bonus;
            System.out.println(" ");
            System.out.println("=============================");
            System.out.println("Nama Precure: " + nama);
            System.out.println("Skill Utama: " + namaSerangan);
            System.out.println("Total Kekuatan: " + totalKekuatan);
            System.out.println("=============================");
        } else {
            System.out.println("=============================");
            System.out.println("Anda belum cocok menjadi precure");
        }
    }
}
