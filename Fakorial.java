import java.util.Scanner;

public class Fakorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        int hasil = 1;

        System.out.print("Angka: ");
        angka = input.nextInt();

        System.out.println("PANGKAT");
        for (int i = 1; i <= 5; i++) { 
            hasil *= angka;
            System.out.println("Hasil: " + hasil);
        }

        hasil = 1;
        System.out.println("FAKORIAL PANGKAT");
        for (int i = 1; i <= angka; i++) { 
            hasil *= i;
            System.out.println("Hasil: " + hasil);
        }

        System.out.println("PERKALIAN");
        int angka_perkalian;
            System.out.print("Masukkan angka perkalian: ");
            if (input.hasNextInt()) {
                angka_perkalian = input.nextInt();
            }else {
                angka_perkalian = 0;
                System.out.println("Angka perkalian tidak valid.");
            }
        for (int i = 1; i <= angka; i++) { 
            System.out.println("Hasil: " + angka_perkalian * i);
        }
    }
}
