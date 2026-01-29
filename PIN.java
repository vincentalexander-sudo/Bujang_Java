
import java.util.Scanner;

public class PIN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pinAnda, buatPin;
        int kesempatan = 3;
        int pinBenar;;

        while (true) { 
            System.out.print("Buat PIN Anda: ");
            buatPin = input.nextInt();
            input.nextLine();

            if (buatPin <= 999 || buatPin >= 10000) {
                System.out.println("PIN harus terdiri dari 4 angka.");
                continue;
            }else {
                pinBenar = buatPin;
                break;
            }
        }
        
        while (kesempatan > 0) {
            System.out.print("Masukkan PIN Anda: ");
            pinAnda = input.nextInt();
            input.nextLine();

            if (pinAnda == pinBenar) {
                System.out.println("PIN Anda Benar!");
                break;
            } else {
                kesempatan--;
                if (kesempatan == 0) {
                    System.out.println("Kesempatan anda sudah habis");
                    break;
                }
                System.out.println("PIN Anda Salah! Anda masih memiliki " + kesempatan + " kesempatan.");
            }
        }
    }
}
