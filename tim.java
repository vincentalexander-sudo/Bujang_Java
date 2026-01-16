public class tim {
    public static void main(String[] args) {
        String[][] timPrecure = {
            {"Nagisa", "Honoka"},
            {"Nozomi", "Rin", "Urara", "Komachi", "Karen"}
        };
        System.out.println("[Nama Asli]");

        System.out.println("===============================");
        System.out.println("===     Futari Wa Precure   ===");
        System.out.println("Jumlah Anggota\t: " + timPrecure[0].length);
        System.out.println("Nama Karakter\t: " + timPrecure[0][0]);
        System.out.println("Nama Karakter\t: " + timPrecure[0][1]);
        System.out.println("===============================");

        System.out.println(" ");

        System.out.println("===============================");
        System.out.println("===     Yes Precure 5       ===");
        System.out.println("Jumlah Anggota\t: " + timPrecure[1].length);
        System.out.println("Nama Karakter\t: " + timPrecure[1][0]);
        System.out.println("Nama Karakter\t: " + timPrecure[1][1]);
        System.out.println("Nama Karakter\t: " + timPrecure[1][2]);
        System.out.println("Nama Karakter\t: " + timPrecure[1][3]);
        System.out.println("Nama Karakter\t: " + timPrecure[1][4]);
        System.out.println("===============================");

        System.out.println(" ");

        System.out.println("[Nama Pahlawan]");
        timPrecure[0][0] = "Cure Black";
        timPrecure[0][1] = "Cure White";

        timPrecure[1][0] = "Cure Dream";
        timPrecure[1][1] = "Cure Rouge";
        timPrecure[1][2] = "Cure Lemonade";
        timPrecure[1][3] = "Cure Mint";
        timPrecure[1][4] = "Cure Aqua";

        System.out.println("===============================");
        System.out.println("===     Futari Wa Precure   ===");
        System.out.println("Nama Karakter\t " + timPrecure[0][0]);
        System.out.println("Nama Karakter\t " + timPrecure[0][1]);
        System.out.println("===============================");

        System.out.println(" ");

        System.out.println("===============================");
        System.out.println("===     Yes Precure 5       ===");
        System.out.println("Nama Karakter\t " + timPrecure[1][0]);
        System.out.println("Nama Karakter\t " + timPrecure[1][1]);
        System.out.println("Nama Karakter\t " + timPrecure[1][2]);
        System.out.println("Nama Karakter\t " + timPrecure[1][3]);
        System.out.println("Nama Karakter\t " + timPrecure[1][4]);
        System.out.println("===============================");
    }
}
