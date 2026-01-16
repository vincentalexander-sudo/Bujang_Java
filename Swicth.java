public class Swicth {
    public static void main(String[] args) {
        var nilai = 'B';

        switch (nilai) {
            case 'A' -> System.out.println("Selamat anda lulus");
            case 'B', 'C' -> System.out.println("Nice Try");
            default -> {
                System.out.println("Anda tinggal kelas");
            }
        }
    }
}
