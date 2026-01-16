
import java.util.Scanner;

public class Sekolah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahSiswa;
        double nilaiRataRata;
        double totalNilai = 0;
        String status = " ";
        double maxScore = 0;
        double minScore = 0;

        System.out.print("Jumlah Siswa: ");
        jumlahSiswa = input.nextInt();
        input.nextLine();

        String[] namaSiswa = new String[jumlahSiswa];
        double[] nilaiUjian = new double[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Nama Siswa: ");
            namaSiswa[i] = input.nextLine();

            System.out.print("Nilai Ujian: ");
            nilaiUjian[i] = input.nextDouble();
            input.nextLine();

            if (nilaiUjian[i] >= 75) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            System.out.println("Nama Siswa " + namaSiswa[i] + ", Nilai: " + nilaiUjian[i] + " (Status: " + status + ")");
            totalNilai += nilaiUjian[i];
        }

        for (int i = 0; i < jumlahSiswa; i++) {
            if (nilaiUjian[i] > maxScore) {
                maxScore = nilaiUjian[i];
            } else {
                minScore = nilaiUjian[i];
            }
        }

        nilaiRataRata = totalNilai / jumlahSiswa;

        System.out.println("Rata-rata Kelas\t: " + nilaiRataRata);
        System.out.println("Nilai Terendah\t: " + minScore);
        System.out.println("Nilai Tertinggi\t: " + maxScore);
        System.out.println(status);
    }
}
