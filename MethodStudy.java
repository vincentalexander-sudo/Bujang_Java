import java.util.Scanner;

public class MethodStudy {

    static void cetakGaris() {
        System.out.println("================================");
    }

    static int hitungPower(int attack, int speed) {
        int power = (attack * 2) + speed;
        return power; 
    }

    static boolean cekKesiapan(int level) {
        return level >= 100;
    }

    static void tampilkanStatus(String nama, int level, int attack, int speed) {
        cetakGaris();
        System.out.println("NAMA KARAKTER : " + nama);
        System.out.println("LEVEL         : " + level);
        System.out.println("TOTAL POWER   : " + hitungPower(attack, speed));
        
        if (cekKesiapan(level)) {
            System.out.println("STATUS        : SIAP TEMPUR!");
        } else {
            System.out.println("STATUS        : MASIH TRAINING...");
        }
        cetakGaris();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int level, atk, spd;
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Level: ");
        level = input.nextInt();
        System.out.print("Masukkan Attack: ");
        atk = input.nextInt();
        System.out.print("Masukkan Speed: ");
        spd = input.nextInt();

        tampilkanStatus(nama, level, atk, spd);
    }
}
