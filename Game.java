import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerHP, enemyHP, pilihanSkill;

        System.out.print("Masukkan HP Player: ");
        playerHP = input.nextInt();

        System.out.print("Masukkan HP Musuh: ");
        enemyHP = input.nextInt();

        String[] skillSET = {
            "Pukulan Cepat", "Pukulan Berat", "Healing"
        };

        while (playerHP > 0 && enemyHP > 0) { 
            System.out.println("PILIHAN SKILL TERSEDIA: ");
            for (int i = 0; i < skillSET.length; i++) {
                System.out.println((i + 1) + ". " + skillSET[i]);
            }
            System.out.print("Masukkan pilihan skill: ");
            pilihanSkill = input.nextInt();

            if (pilihanSkill == 1) {
                System.out.println("Anda memukul dengan cepat!");
                enemyHP = enemyHP - 10; 
                System.out.println("Musuh terkena 10 damage.");
            }else if (pilihanSkill == 2) {
                double keberuntungan = Math.random();
                System.out.println("Anda mencoba memukul sekuat tenaga...");
                
                if (keberuntungan > 0.5) {
                    enemyHP = enemyHP - 30; 
                    System.out.println("BOOM! Pukulan telak! Musuh kena 30 damage.");
                } else {
                    System.out.println("Waduh! Serangan meleset. Musuh tidak terluka.");
                }
            }else if (pilihanSkill == 3) {
                System.out.println("Anda melakukan healing.");
                int healing = (int) (Math.random() * 20) + 1;
                playerHP = playerHP + healing; 
                System.out.println("Anda melakukan healing sebesar " + healing + " HP.");
            }else {
                System.out.println("Pilihan skill tidak valid.");
            }

            if (enemyHP <= 0) {
                System.out.println("Musuh telah tumbang!");
                break; 
            }

            int damageMusuh = (int) (Math.random() * 20) + 1; 
            playerHP = playerHP - damageMusuh; 
            System.out.println("Musuh memukul Anda sebesar " + damageMusuh + " damage.");

            if (playerHP <= 0) {
                System.out.println("Musuh telah tumbang!");
                break; 
            }

            System.out.println("HP Player: " + playerHP);
            System.out.println("HP Musuh: " + enemyHP);
        }

        if (playerHP > 0) {
            System.out.println("Selamat! Anda menang!");
        } else {
            System.out.println("Maaf, Anda kalah.");
            
        }
    }
}
