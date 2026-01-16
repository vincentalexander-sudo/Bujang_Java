public class  ProfileDatabaseTipe {
    public static void main(String[] args) {
        String firstName = "Cure";
        String lastName = "Yell";
        String userName = firstName + " " + lastName;
        String catchPhrase = "\"Hooray hooray\"";
        String weapon = "Yell Tact";
        String henshinItem = "PreHeart dan Mirai Crystals";
        char grade = 'A';
        byte level = 80;
        double powerRating = 96.5;
        boolean sudahBerubah = true;
        System.out.println("===============================");
        System.out.println("=== PRECURE DATABASE SYSTEM ===");
        System.out.println("Nama Karakter\t: " + userName);
        System.out.println("Slogan\t\t: " + catchPhrase);
        System.out.println("Senjata\t\t: " + weapon);
        System.out.println("Alat Berubah\t: " + henshinItem);
        System.out.println("Level\t\t: " + level);
        System.out.println("Kelas\t\t: " + grade);
        System.out.println("Power Rating\t: " + powerRating);
        System.out.println("Henshin stat\t: " + sudahBerubah);
        System.out.println("===============================");
    }
}