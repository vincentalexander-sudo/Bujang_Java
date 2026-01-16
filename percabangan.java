import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int nilai, absen;
            System.out.print("Masukkan Nilai anda: ");
            nilai = input.nextInt();
            System.out.print("Masukkan Absen anda: ");
            absen = input.nextInt();

            if(nilai >= 90 && absen >=90){
                System.out.println("Nilai anda adalah A");
            }else if (nilai >= 80 && absen >=80) {
                System.out.println("Nilai anda adalah B");
            }else if (nilai >= 70 && absen >=70) {
                System.out.println("Nilai anda adalah C");
            }else if (nilai >= 60 && absen >=60) {
                System.out.println("Nilai anda adalah D");
            }else {
                System.out.println("Nilai anda adalah E");
            }
        }
    }
}
