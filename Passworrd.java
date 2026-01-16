import java.util.Scanner;

public class Passworrd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. DATA RAHASIA (Simulasi Database)
        // Kita kunci data yang benar di sini
        final String DB_USER = "admin";
        final String DB_PASS = "batam123";
        
        // 2. KONFIGURASI
        int maxKesempatan = 3;
        boolean isLoginSuccess = false; // Penanda status

        System.out.println("=== BATAM SECURE LOGIN SYSTEM ===");
        
        // 3. LOOPING PERCOBAAN
        // Kita loop dari 1 sampai 3
        for (int i = 1; i <= maxKesempatan; i++) {
            
            System.out.print("\nPercobaan ke-" + i + "\nUsername: ");
            String inputUser = input.nextLine();
            
            System.out.print("Password: ");
            String inputPass = input.nextLine();

            // 4. LOGIKA PENGECEKAN
            if (inputUser.equals(DB_USER) && inputPass.equals(DB_PASS)) {
                System.out.println("\n[SUCCESS] ACCESS GRANTED! Welcome, Admin.");
                isLoginSuccess = true;
                break; // KELUAR DARI LOOP SEGERA
            } else {
                // Jika Salah
                if (i == maxKesempatan) {
                    System.out.println("\n[ALERT] SYSTEM LOCKED: INTRUDER DETECTED! CALLING SECURITY...");
                } else {
                    // Masih ada sisa kesempatan
                    int sisa = maxKesempatan - i;
                    System.out.println("[FAILED] Password salah! Sisa percobaan: " + sisa + " kali.");
                }
            }
        }
        
        // Penutup (Opsional)
        if (!isLoginSuccess) {
            System.out.println("(Sistem dimatikan demi keamanan)");
        }
    }
}