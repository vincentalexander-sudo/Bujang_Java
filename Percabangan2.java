
import java.util.Scanner;

public class Percabangan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tipeMember;
        double totalBelanja;
        double diskon = 0;

        System.out.print("Tipe Member: ");
        tipeMember = input.next();
        System.out.print("Total Belanja: ");
        totalBelanja = input.nextDouble();
        input.nextLine();

        if (tipeMember.equalsIgnoreCase("Gold")) {
            if (totalBelanja > 500_000) {
                diskon = totalBelanja * 0.2;
                totalBelanja -= diskon;
            } else {
                diskon = totalBelanja * 0.1;
                totalBelanja -= diskon;
            }
        }else if (tipeMember.equalsIgnoreCase("Silver")) {
            if (totalBelanja > 500_000) {
                diskon = totalBelanja * 0.1;
                totalBelanja -= diskon;
            } else {
                diskon = totalBelanja * 0.05;
                totalBelanja -= diskon;
            }
        }else {
            if (totalBelanja > 1_000_000){
                diskon = totalBelanja * 0.02;
                totalBelanja -= diskon;
            }
        }
        System.out.println("Total Belanja: " + totalBelanja);
        System.out.println("Diskon: " + diskon);
    }
}