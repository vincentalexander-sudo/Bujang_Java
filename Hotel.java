
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tipeKamar;
        int kapasitasOrang, durasi, weekend, konfirmasi;
        double hargaPerkamar = 0;
        double totalHarga = 0;
        double diskon = 0;
        double pajak = 0;
        double hargaWeekend = 0;

        while (true) { 
            System.out.print("Tipe Kamar: ");
            tipeKamar = input.next();
            System.out.print("Kapasitas Orang: ");
            kapasitasOrang = input.nextInt();
            System.out.print("Durasi: ");
            durasi = input.nextInt();
            input.nextLine();
            System.out.print("Weekend (1: Ya, 0: Tidak): ");
            weekend = input.nextInt();
            
            if (durasi <= 0) {
            System.out.println("maaf, angka tidak valid");
            }else {
                if ((tipeKamar.equalsIgnoreCase("standar") && kapasitasOrang > 2)) {
                System.out.println("Maaf, kamar nggak muat!");
                } else if ((tipeKamar.equalsIgnoreCase("deluxe") && kapasitasOrang > 3)) {
                    System.out.println("Maaf, kamar nggak muat!");
                } else if ((tipeKamar.equalsIgnoreCase("suite") && kapasitasOrang > 5) || durasi <= 0) {
                    System.out.println("Maaf, kamar nggak muat!");
                }
                else {
                    if (tipeKamar.equalsIgnoreCase("standar")) {
                        hargaPerkamar = 1000000;
                    }else if (tipeKamar.equalsIgnoreCase("deluxe")) {
                        hargaPerkamar = 1500000;
                    }else if (tipeKamar.equalsIgnoreCase("suite")) {
                        hargaPerkamar = 5000000;
                    }
                    totalHarga = hargaPerkamar * durasi;
                    if(weekend == 1) {
                        hargaWeekend = totalHarga * 0.15;
                        totalHarga = totalHarga + hargaWeekend;
                    }

                    if (durasi > 7) {
                        diskon = totalHarga * 0.1;
                        totalHarga = totalHarga - diskon;
                    }

                    pajak = totalHarga * 0.1;
                    totalHarga = totalHarga + pajak;
                    
                    System.out.println("Total Harga: " + totalHarga);

                    System.out.print("Apakah ada yang mau pesan lagi? (1: YA, 0: Tidak): ");
                    konfirmasi = input.nextInt();
                    if (konfirmasi == 0) {
                        break;
                    }
                }
            }
        }
    }
}
