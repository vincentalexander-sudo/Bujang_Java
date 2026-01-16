
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahFibonacci;

        System.out.print("Masukkan jumlah deret Fibonacci: ");
        jumlahFibonacci = input.nextInt();

        int[] deret = new int[jumlahFibonacci];
        deret[0] = 0;
        deret[1] = 1;

        for (int i = 2; i < jumlahFibonacci; i++) {
            deret[i] = deret[i - 1] + deret[i - 2];
        }

        System.out.println("Isi Deret Fibonacci dalam Array:");
        for (int i = 0; i < jumlahFibonacci; i++) {
            System.out.print(" " + deret[i]);
        }
    }
}
