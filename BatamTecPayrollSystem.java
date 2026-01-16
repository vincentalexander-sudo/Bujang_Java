import java.util.Scanner;

public class BatamTecPayrollSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // KONSTANTA (Tarif Tetap, Jangan Diubah-ubah)
        final int TARIF_PER_JAM = 50_000;
        final int TARIF_LEMBUR  = 75_000;
        
        int jumlahKaryawan;
        long totalPengeluaran = 0; // Pakai long takut angkanya miliaran
        
        // Statistik
        int maxJamKerja = 0;
        String karyawanTeladan = "-";

        System.out.print("Jumlah Karyawan: ");
        jumlahKaryawan = input.nextInt();
        input.nextLine();

        String[] namaKaryawan = new String[jumlahKaryawan];
        int[] jamKerja = new int[jumlahKaryawan];

        System.out.println("\n--- INPUT DATA ---");
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.print("Nama Karyawan " + (i+1) + ": ");
            namaKaryawan[i] = input.nextLine();

            System.out.print("Total Jam Kerja : ");
            jamKerja[i] = input.nextInt();
            input.nextLine();
            
            // --- MULAI HITUNGAN (Reset setiap orang) ---
            int bayaranPokok = 0;
            int bayaranLembur = 0;
            int totalGajiOrangIni = 0;

            if (jamKerja[i] <= 40) {
                // Skenario Normal
                bayaranPokok = jamKerja[i] * TARIF_PER_JAM;
                bayaranLembur = 0; // Tidak ada lembur
                totalGajiOrangIni = bayaranPokok;
            } else {
                // Skenario Lembur
                int jamLembur = jamKerja[i] - 40;
                
                bayaranPokok = 40 * TARIF_PER_JAM;        // 40 Jam pertama
                bayaranLembur = jamLembur * TARIF_LEMBUR; // Sisanya tarif mahal
                totalGajiOrangIni = bayaranPokok + bayaranLembur;
            }

            // --- UPDATE STATISTIK & TOTAL ---
            totalPengeluaran += totalGajiOrangIni;

            // Cek Karyawan Teladan (Bandingkan Jam Murni, bukan Duit)
            if (jamKerja[i] > maxJamKerja) {
                maxJamKerja = jamKerja[i];
                karyawanTeladan = namaKaryawan[i];
            }

            // --- CETAK SLIP GAJI ---
            System.out.println(">> Rincian Gaji " + namaKaryawan[i]);
            System.out.println("   - Gaji Pokok  : Rp " + bayaranPokok);
            System.out.println("   - Uang Lembur : Rp " + bayaranLembur);
            System.out.println("   - TOTAL TERIMA: Rp " + totalGajiOrangIni + "\n");
        }

        System.out.println("-----------------------------------");
        System.out.println("Total Pengeluaran Perusahaan : Rp " + totalPengeluaran);
        System.out.println("Karyawan Paling Rajin        : " + karyawanTeladan + " (" + maxJamKerja + " Jam)");
        System.out.println("-----------------------------------");
    }
}