import java.util.Scanner;

public class Nasabah {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int gajiBulanan, hargaMotor;
        String status;

        System.out.print("Gaji Bulanan\t: ");
        gajiBulanan = input.nextInt();
        input.nextLine();

        System.out.print("Status Karyawan\t: ");
        status = input.nextLine();
        
        System.out.print("Harga Motor\t: ");
        hargaMotor = input.nextInt();
        input.nextLine();

        System.out.println("-    Gerbang 1: Cek Kesehatan Finansial Dasar     -");
        System.out.println("");
        if (gajiBulanan >= 3000_000) {
            System.out.println("-    Gerbang 2: Cek Kemampuan Bayar (Limit Cicilan)     -");
            System.out.println(" ");

            if (hargaMotor <= (gajiBulanan * 3)) {
               System.out.println("-    Gerbang 3: Cek Risiko Status Karyawan     -");
               System.out.println(" "); 

               if (status.equalsIgnoreCase("Tetap")) {
                    System.out.println("CONGRATS! Pengajuan Kredit DISETUJUI.");
               } else {
                    System.out.println("-    Status Karyawan Kontrak     -");
                    System.out.println(" "); 

                    if (gajiBulanan > 5000_000) {
                        System.out.println("CONGRATS! Pengajuan Kredit DISETUJUI.");
                    } else {
                        System.out.println("REJECTED: Karyawan kontrak gaji harus tinggi");
                    }
               }

            } else {
                System.out.println("REJECTED: Overlimit / Cicilan tidak mampu");
            }

        } else {
            System.out.println("REJECTED: Gaji di bawah standar");
        }
    }
}
