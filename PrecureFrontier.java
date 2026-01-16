
import java.util.Scanner;

public class PrecureFrontier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahGelombang, levelKekuatan;
        String tipeMusuh;
        int totalKekuatanMusuh = 0;
        int gelombang = 0;

        System.out.print("jumlah total gelombang serangan yang harus dihadapi: ");
        jumlahGelombang = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= jumlahGelombang; i++) {
            System.out.print("Tipe Musuh: ");
            tipeMusuh = input.nextLine();

            System.out.print("Level Kekuatan Musuh: ");
            levelKekuatan = input.nextInt();
            input.nextLine();

            if (tipeMusuh.equalsIgnoreCase("Mirage")){
                continue;
            }

            if (levelKekuatan >= 500){
                System.out.println("Pertempuran harus dihentikan seketika demi keselamatan para pejuang");
                break;
            }

            totalKekuatanMusuh += levelKekuatan;
            gelombang++;
        }

        System.out.println("===================================================");
        System.out.println("=                       Laporan Akhir             =");
        System.out.println("Total Kekuatan Musuh yang berhasil Diatasi\t: " + totalKekuatanMusuh);
        System.out.println("Total banyak gelombang yang berhasil dilalui \t: " + gelombang);
        System.out.println("===================================================");
    }
}