
import java.util.Scanner;

public class Method {
    static void tampilkanMenu() {
        System.out.println("=== HERO RANK SYSTEM ===");
        System.out.println("1. Sapa Hero");
        System.out.println("2. Hitung Skor Misi");
        System.out.println("3. Cek Bonus Loyalitas");
    }

    static void sapaHero(String namaHero) {
        System.out.println("Selamat datang di Hero Rank System, " + namaHero + "!");
    }

    static int hitungSkorMisi(int skorMisi) {
        return skorMisi * 2;
    }

    static void cekBonusLoyalitas(int skorMisi) {
        if (skorMisi >= 100) {
            System.out.println("Anda mendapatkan bonus loyalitas!");
        } else {
            System.out.println("Anda tidak mendapatkan bonus loyalitas.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        String namaHero;
        int skorMisi;
        tampilkanMenu();
        System.out.print("Masukkan Pilihan anda: ");
        pilihan = input.nextInt();
        input.nextLine();
        switch (pilihan) {
            case 1 -> {
                System.out.print("Masukkan Nama Hero: ");
                namaHero = input.nextLine();
                sapaHero(namaHero);
            }
            case 2 -> {
                System.out.print("Masukkan Skor Misi: ");
                skorMisi = input.nextInt();
                System.out.println("Skor misi Anda adalah: " + hitungSkorMisi(skorMisi));
            }
            case 3 -> {
                System.out.print("Masukkan Skor Misi: ");
                skorMisi = input.nextInt();
                cekBonusLoyalitas(skorMisi);
            }
            default -> System.out.println("Pilihan tidak valid.");
        }
    }
}