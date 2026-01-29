
import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahAnggotaSmilePrecure = 5;
        int totalEnergy = 0;

        String[] smilePrecure = {
                "Miyuki", "Akane", "Yayoi", "Nao", "Reika"
        };
        String[] nama = new String[jumlahAnggotaSmilePrecure];
        int[] energi = new int[jumlahAnggotaSmilePrecure];

        for (int i = 0; i < jumlahAnggotaSmilePrecure; i++) {
            boolean isfound = false;
            System.out.print("Masukkan nama anggota Smile Precure ke-" + (i + 1) + ": ");
            nama[i] = input.nextLine();

            for (int j = 0; j < jumlahAnggotaSmilePrecure; j++) {
               if(nama[i].equalsIgnoreCase(smilePrecure[j])) {
                   System.out.println("Anggota Smile Precure ke-" + (i + 1) + " bernama " + nama[i]);
                   isfound = true;
                   break;
               }
           }

           if (!isfound) {
               System.out.println(nama[i] + " bukan anggota Smile Precure.");
               continue;
           }

            System.out.print("Masukkan energi anggota Smile Precure ke-" + (i + 1) + ": ");
            if (input.hasNextInt()) {
                energi[i] = input.nextInt();
            } else {
                System.out.println("Error: Input harus berupa angka bulat!");
                input.next(); // Buang input yang salah agar tidak macet
                continue; // Ulangi loop
            }

           if (energi[i] < 50) {
               System.out.println("Energi anggota Smile Precure ke-" + (i + 1) + " berstatus \"Kelelahan\" (Butuh dukungan teman)");
           }else if (energi[i] >= 50 && energi[i] <= 80) {
                System.out.println("Energi anggota Smile Precure ke-" + (i + 1) + " berstatus \"Bangkit\" (Siap bertarung)");
           }else {
                System.out.println("Energi anggota Smile Precure ke-" + (i + 1) + " berstatus \"Full Bloom\" (Kekuatan maksimal)");
           }

           System.out.printf("%s memiliki energi sebesar %d point.\n", nama[i], energi[i]);
           totalEnergy += energi[i];
        }

        if (totalEnergy >= 300) {
            System.out.println("SMILE CHARGE! Transformasi Berhasil!");
        }else {
            System.out.println("SMILE CHARGE! Transformasi Gagal!");
        }
    }
}
