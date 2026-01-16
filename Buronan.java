
import java.util.Scanner;

public class Buronan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlaNIK, NIKPelaku;
        boolean isfound = false;

        System.out.print("Jumlah NIK: ");
        jumlaNIK = input.nextInt();
        input.nextLine();

        System.out.print("NIK Buronan: ");
        NIKPelaku = input.nextInt();
        input.nextLine();

        int[] NIK = new int[jumlaNIK];

        for (int i = 0; i < jumlaNIK; i++) {
            System.out.print("NIK Masing-Masing: ");
            NIK[i] = input.nextInt();
            input.nextLine();

            if (NIK[i] == NIKPelaku) {
                isfound = true;
                break;   
            }
        }

        if (isfound == true){
            System.out.println("ALERT: STATUS BURONAN! TAHAN TERSANGKA!");
        } else{
            System.out.println("CLEAN: Warga Sipil Biasa, Bebaskan.");
        }
    }
}
