
import java.util.Scanner;

public class Academic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPower = 0;
        String leader;
        String[] namaPrecure = new String[3];
        int[] levelKekuatan = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Candidat Precure ke-" + (i + 1) + ": ");
            namaPrecure[i] = input.nextLine();

            System.out.print("Level Kekuatan Precure ke-" + (i + 1) + ": ");
            levelKekuatan[i] = input.nextInt();

            input.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            String rank;
            if (levelKekuatan[i] >= 80){
                rank = "Legendary";
            } else if (levelKekuatan[i] >= 60 && levelKekuatan[i] < 80){
                rank = "Epic";
            } else {
                rank = "Rookie";
            }
            System.out.println("Precure ke-" + (i+1) + " Rank: " + rank);
            totalPower += levelKekuatan[i];
        }

        if(levelKekuatan[0] > levelKekuatan[1] && levelKekuatan[0] > levelKekuatan[2]){
            leader = namaPrecure[0];
            System.out.println("Pemimpinnya adalah " + leader);
        }else if(levelKekuatan[1] > levelKekuatan[0] && levelKekuatan[1] > levelKekuatan[2]){
            leader = namaPrecure[1];
            System.out.println("Pemimpinnya adalah " + leader);
        }else {
            leader = namaPrecure[2];
            System.out.println("Pemimpinnya adalah " + leader);
        }

        if (totalPower >= 250){
            System.out.println("misi penyelamatan dunia dinyatakan Layak Dijalankan");
        } else {
            System.out.println("tim ini memerlukan latihan tambahan di akademi sebelum diperbolehkan berangkat.");
        }
    }
}