
import java.util.Scanner;

public class Karyawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahKaryawan;
        String namaKaryawan, kategoriKaryawan;
        double jamLembur;
        double gajiLembur = 0;
        double totalBudget = 0;
        double gajiKaryawan = 0;
        double gajiTotal = 0;

        System.out.print("Jumlah Karyawan: ");
        jumlahKaryawan = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahKaryawan; i++) {
           double gajiPokok = 0;
           System.out.println("=      Karyawan ke-" + (i+1) + "     =");
           System.out.print("Nama Karyawan: ");
           namaKaryawan = input.nextLine();

           System.out.print("Kategori Karyawan: ");
           kategoriKaryawan = input.nextLine();

           System.out.print("Jam Lembur: ");
           jamLembur = input.nextInt();
           input.nextLine();

           if (kategoriKaryawan.equalsIgnoreCase("Manager")){
               gajiPokok = 15_000_000;
           }else if (kategoriKaryawan.equalsIgnoreCase("Senior")) {
               gajiPokok = 10_000_000;
           }else if (kategoriKaryawan.equalsIgnoreCase("Junior")) {
               gajiPokok = 5_000_000;
           }else {
               System.out.println("LOG ERROR: Kategori '" + kategoriKaryawan + "' tidak ditemukan di database!");
               continue;
           }

           if(jamLembur > 20){
               gajiLembur = (jamLembur * 100_000) + 500_000;
           }else {
               gajiLembur = (jamLembur * 100_000);
           }

           gajiKaryawan = gajiLembur + gajiPokok;
           System.out.println("Gaji Karyawan: " + gajiKaryawan);

           gajiTotal += gajiLembur + gajiPokok;
        }

        totalBudget += gajiTotal;
        System.out.printf("Total Budget: %.2f\n", totalBudget);
    }
}
