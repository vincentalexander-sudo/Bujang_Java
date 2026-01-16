
import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nama, tipeMusuh;
            int level;
            String skillKhusus = "Tidak ada";

            System.out.print("Nama: ");
            nama = input.nextLine();

            System.out.print("Level Precure: ");
            level = input.nextInt();
            input.nextLine();

            System.out.print("Tipe Musuh Precure: ");
            tipeMusuh = input.nextLine();
            System.out.println(" ");

            if (level > 50){
                System.out.println("===============================================");
                System.out.println("= Karakter bisa berubah dengan Special Attack =");
                System.out.println(" ");

                if (tipeMusuh.equalsIgnoreCase("Zakenna")){
                    skillKhusus = "Gunakan Marble Screw Max!";
                }else if (tipeMusuh.equals("Small Fry")) {
                    skillKhusus = "Gunakan Rainbow Therapy.";
                }else {
                    skillKhusus = "Gunakan Serangan Dasar.";
                }
                // equals harus sempurna jika salah kapital maka salah jika input zakennA di if zakenna maka masuka ke else
                // equalsIgnoreCase bisa memperbaiki dari zakennA jadi zakenna tetap jalan di if

                System.out.println("===============================");
                System.out.println("Nama Precure\t: " + nama);
                System.out.println("Level Energi\t: " + level);
                System.out.println("Tipe Musuh\t: " + tipeMusuh);
                System.out.println("Special Attack\t: " + skillKhusus);

            } else if(level >= 21 && level <=50){
                System.out.println("===============================================");
                System.out.println("= Karakter bisa berubah dengan serangan biasa =");
                System.out.println("");

                System.out.println("===============================");
                System.out.println("Nama Precure\t: " + nama);
                System.out.println("Level Energi\t: " + level);
                System.out.println("Tipe Musuh\t: " + tipeMusuh);
                System.out.println("Special Attack\t: " + skillKhusus);

            }else {
                System.out.println("===============================================");
                System.out.println("= Karakter tidak bisa berubah menjadi precure =");
            }
        }
    }
}
