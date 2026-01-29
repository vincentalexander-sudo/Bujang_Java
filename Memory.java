
import java.util.Scanner;

public class Memory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isfound = false;
        String[] nama = {
            "Miyuki", "Akane", "Yayoi", "Nao", "Reika"
        };

        String[] pekerjaan = {
            "Karyawan Toko Buku", "Pemilik Kedai Okonomiyaki", "Komikus", "Pelatih sepak bola", "Guru SMP"
        };

        String[] namaUser = new String[nama.length];

        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan nama anggota Smile Precure ke-" + (i + 1) + ": ");
            namaUser[i] = input.nextLine();

            for (int j = 0; j < nama.length; j++) {
                if (namaUser[i].equalsIgnoreCase(nama[j])) {
                    System.out.println("Anggota Smile Precure ke-" + (i + 1) + " bernama " + namaUser[i] + " memiliki pekerjaan " + pekerjaan[j]);
                    isfound = true;
                    break;
                }
            }

            if (!isfound) {
                System.out.println(namaUser[i] + " bukan anggota Smile Precure.");
            }
        }   
    }
}
